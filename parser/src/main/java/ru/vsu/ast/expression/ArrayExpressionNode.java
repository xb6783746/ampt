package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

import java.util.List;

public class ArrayExpressionNode extends ExpressionNode {


    public static class ArrayRowNode extends BasicAstNode {

        public ArrayRowNode(List<ExpressionNode> rowExpressions) {
            this(null, rowExpressions);
        }

        public ArrayRowNode(BasicAstNode parent, List<ExpressionNode> rowExpressions) {
            super(parent);
            this.rowExpressions = rowExpressions;

            rowExpressions.forEach((x) -> x.setParent(this));
        }

        private List<ExpressionNode> rowExpressions;

        public List<ExpressionNode> getRowExpressions() {
            return rowExpressions;
        }

        @Override
        public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

            replaceInList(rowExpressions, oldNode, newNode);
        }

        @Override
        public <T> T accept(AstTreeVisitor<T> visitor) {
            return visitor.visit(this);
        }
    }

    public ArrayExpressionNode(List<ArrayRowNode> rows) {
        this(null, rows);
    }

    public ArrayExpressionNode(BasicAstNode parent, List<ArrayRowNode> rows) {
        super(parent);
        this.rows = rows;
    }

    private List<ArrayRowNode> rows;

    public List<ArrayRowNode> getRows() {
        return rows;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(rows, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
