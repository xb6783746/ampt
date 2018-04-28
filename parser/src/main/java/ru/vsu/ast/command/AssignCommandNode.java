package ru.vsu.ast.command;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.LValueNode;
import ru.vsu.ast.expression.ExpressionNode;

public class AssignCommandNode extends CommandNode {

    public AssignCommandNode(boolean isEscaped, LValueNode lvalue, ExpressionNode rvalue) {
        super(isEscaped);
        this.lvalue = lvalue;
        this.rvalue = rvalue;

        lvalue.setParent(this);
        rvalue.setParent(this);
    }

    private LValueNode lvalue;
    private ExpressionNode rvalue;

    public LValueNode getLvalue() {
        return lvalue;
    }
    public ExpressionNode getRvalue() {
        return rvalue;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        if(lvalue == oldNode){

            lvalue = (LValueNode) newNode;
        }

        if(rvalue == oldNode){

            rvalue = (ExpressionNode) newNode;
        }
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
