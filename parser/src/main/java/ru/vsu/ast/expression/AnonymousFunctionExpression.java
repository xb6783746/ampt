package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.FunctionArgumentNode;

import java.util.List;

public class AnonymousFunctionExpression extends ExpressionNode {


    public AnonymousFunctionExpression(List<FunctionArgumentNode> args, ExpressionNode expressionNode) {
        this(null, args, expressionNode);
    }

    public AnonymousFunctionExpression(BasicAstNode parent, List<FunctionArgumentNode> args, ExpressionNode expressionNode) {
        super(parent);
        this.args = args;
        this.expressionNode = expressionNode;
    }

    private List<FunctionArgumentNode> args;
    private ExpressionNode expressionNode;

    public List<FunctionArgumentNode> getArgs() {
        return args;
    }

    public ExpressionNode getExpressionNode() {
        return expressionNode;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(expressionNode == oldNode){

            expressionNode = (ExpressionNode)newNode;
        }
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
