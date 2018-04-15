package ru.vsu.ast.command;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.expression.ExpressionNode;

public class AssignCommandNode extends CommandNode {

    public AssignCommandNode(boolean isEscaped, ExpressionNode lvalue, ExpressionNode rvalue) {
        super(isEscaped);
        this.lvalue = lvalue;
        this.rvalue = rvalue;
    }

    private ExpressionNode lvalue;
    private ExpressionNode rvalue;

    public ExpressionNode getLvalue() {
        return lvalue;
    }
    public ExpressionNode getRvalue() {
        return rvalue;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
