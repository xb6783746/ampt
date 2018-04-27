package ru.vsu.transformer;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.BasicAstVisitor;
import ru.vsu.ast.FunctionArgumentNode;
import ru.vsu.ast.expression.FunctionCallNode;
import ru.vsu.ast.expression.RangeExpressionNode;
import ru.vsu.ast.expression.SliceExpressionNode;
import ru.vsu.helpers.FunctionNameResolver;

import java.util.Collections;
import java.util.List;

public class CompatibleFunctionTransformer extends BasicAstVisitor<Void> implements AstTransformer {

    public CompatibleFunctionTransformer(FunctionNameResolver nameResolver) {
        this.nameResolver = nameResolver;
    }

    private FunctionNameResolver nameResolver;

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


        FunctionNameResolver.Replace replace =
                nameResolver.resolve(node.getFunctionName());

        if(replace != null){

            node.setFunctionName(replace.getFuncName());

            if(replace.isNeedWrapToMlarr()){

                toMr(node);
            }
        }

        return super.visit(node);
    }

    private void toMr(FunctionCallNode node){

        BasicAstNode parent = node.getParent();

        FunctionCallNode toMr = createMrNode(node);

        parent.replace(node, toMr);
    }

    private FunctionCallNode createMrNode(FunctionCallNode node){

        List<FunctionArgumentNode> arg = Collections.singletonList(new FunctionArgumentNode(node));

        return new FunctionCallNode("mr", arg);
    }
}
