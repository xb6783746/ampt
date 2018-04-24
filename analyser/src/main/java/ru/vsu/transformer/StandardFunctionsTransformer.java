package ru.vsu.transformer;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.BasicAstVisitor;
import ru.vsu.ast.expression.*;
import ru.vsu.ast.expression.FunctionCallNode.FunctionArgumentNode;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StandardFunctionsTransformer extends BasicAstVisitor<Void> implements AstTransformer {


    private class Replace{

        public Replace(String replace, Consumer<FunctionCallNode> transformer) {
            this.replace = replace;
            this.transformer = transformer;
        }

        private String replace;
        private Consumer<FunctionCallNode> transformer;
    }


    public StandardFunctionsTransformer() {

        standardFunctions.put("rand", new Replace("np.random.rand", this::reorder));
        standardFunctions.put("zeros", new Replace("np.zeros", this::reorderWithTuple));
        standardFunctions.put("ones", new Replace("np.ones", this::reorderWithTuple));
        standardFunctions.put("disp", new Replace("print", this::transformDisp));
    }

    private Map<String, Replace> standardFunctions = new Hashtable<>();

    @Override
    public BasicAstNode transform(BasicAstNode tree) {

        tree.accept(this);
        return tree;
    }

    @Override
    public Void visit(SliceExpressionNode node) {

        return visit((RangeExpressionNode)node);
    }

    @Override
    public Void visit(FunctionCallNode node) {

        if(standardFunctions.containsKey(node.getFunctionName())){

            Replace replace = standardFunctions.get(node.getFunctionName());

            replace.transformer.accept(node);

            node.setFunctionName(replace.replace);
        }
        return super.visit(node);
    }

    private void reorder(FunctionCallNode node){

        List<FunctionArgumentNode> args = reorderList(node.getArgs());

        node.setArgs(args);

        view(node);
    }

    private void reorderWithTuple(FunctionCallNode node){

        List<FunctionArgumentNode> args = reorderList(node.getArgs());

        FunctionArgumentNode tuple = toTuple(args);

        node.setArgs(Collections.singletonList(tuple));

        view(node);
    }

    private void transformDisp(FunctionCallNode node){

        FunctionArgumentNode arg = node.getArgs().get(0);

        if(arg != null && arg.getExpression() instanceof ArrayExpressionNode){

            List<FunctionArgumentNode> args = new ArrayList<>();

            ArrayExpressionNode array = (ArrayExpressionNode)arg.getExpression();

            for(int i = 0; i < array.getRows().size(); i++){

                ArrayExpressionNode.ArrayRowNode row = array.getRows().get(i);

                args.addAll(
                        row.getRowExpressions()
                                .stream()
                                .map(FunctionArgumentNode::new)
                                .collect(Collectors.toList())
                );

                if(i < array.getRows().size() - 1) {

                    args.add(new FunctionArgumentNode(new StringNode("\\n")));
                }
            }

            node.setArgs(args);
        }
    }

    private List<FunctionArgumentNode> reorderList(List<FunctionArgumentNode> expressions){

        if(expressions.size() <= 2){

            return expressions;
        }

        List<FunctionArgumentNode> res = new ArrayList<>(expressions.size());

        List<FunctionArgumentNode> rowColumn = expressions.subList(0, 2);
        List<FunctionArgumentNode> rest = expressions.subList(2, expressions.size());

        Collections.reverse(rest);

        res.addAll(rowColumn);
        res.addAll(rest);

        return res;
    }

    private FunctionArgumentNode toTuple(List<FunctionArgumentNode> args){

        TupleExpressionNode tuple = new TupleExpressionNode(
                args
                        .stream()
                        .map(FunctionArgumentNode::getExpression)
                        .collect(Collectors.toList())
        );

        return new FunctionArgumentNode(tuple);
    }

    private void view(FunctionCallNode functionCallNode){

        FunctionCallNode view = createViewNode(functionCallNode);

        functionCallNode.getParent().replace(functionCallNode, view);
    }

    private FunctionCallNode createViewNode(ExpressionNode obj){

        IdentifierExpressionNode id = new IdentifierExpressionNode("mlarr");

        FunctionArgumentNode arg = new FunctionArgumentNode(id);

        return new FunctionCallNode(
                obj,
                "view",
                Collections.singletonList(arg)
        );
    }
}
