package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

import java.util.List;

public class ArrayExpressionNode extends ExpressionNode {


    public static class ArrayRowNode extends BasicAstNode {

        public ArrayRowNode(List<ExpressionNode> rowExpressions) {
            this.rowExpressions = rowExpressions;
        }

        private List<ExpressionNode> rowExpressions;

        public List<ExpressionNode> getRowExpressions() {
            return rowExpressions;
        }

        @Override
        public <T> T accept(AstTreeVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public ArrayExpressionNode(List<ArrayRowNode> rows) {
        this.rows = rows;
    }

    private List<ArrayRowNode> rows;

    public List<ArrayRowNode> getRows() {
        return rows;
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
