package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.FunctionArgumentNode;

import java.util.List;

public class FunctionCallNode extends ExpressionNode {


    public FunctionCallNode(ExpressionNode object, String functionName, List<FunctionArgumentNode> args) {

        this(null, object, functionName, args);
    }

    public FunctionCallNode(String functionName, List<FunctionArgumentNode> args) {

        this(null, null, functionName, args);
    }

    public FunctionCallNode(BasicAstNode parent, String functionName, List<FunctionArgumentNode> args) {

        this(parent, null, functionName, args);
    }

    public FunctionCallNode(BasicAstNode parent,
                            ExpressionNode object,
                            String functionName,
                            List<FunctionArgumentNode> args) {
        super(parent);
        this.object = object;
        this.functionName = functionName;
        this.args = args;

        args.forEach((x) -> x.setParent(this));
    }

    private ExpressionNode object;
    private String functionName;
    private List<FunctionArgumentNode> args;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<FunctionArgumentNode> getArgs() {
        return args;
    }

    public void setArgs(List<FunctionArgumentNode> args) {
        this.args = args;
    }

    public ExpressionNode getObject() {
        return object;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(args, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
