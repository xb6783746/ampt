package ru.vsu.ast.expression;

import ru.vsu.ast.AstVisitor;
import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.ParameterizedAstVisitor;

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
        public <T> T accept(AstVisitor<T> visitor) {
            return visitor.visit(this);
        }

        @Override
        public <T, P> T accept(ParameterizedAstVisitor<T, P> visitor, P param) {

            return visitor.visit(this, param);
        }
    }

    public ArrayExpressionNode(List<ArrayRowNode> rows, boolean isCellArray) {
        this(null, rows, isCellArray);
    }

    public ArrayExpressionNode(BasicAstNode parent, List<ArrayRowNode> rows, boolean isCellArray) {
        super(parent);
        this.rows = rows;
        this.isCellArray = isCellArray;

        rows.forEach(x -> x.setParent(this));
    }

    private boolean isCellArray;
    private List<ArrayRowNode> rows;

    public boolean isCellArray() {
        return isCellArray;
    }

    public List<ArrayRowNode> getRows() {
        return rows;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(rows, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstVisitor<T> visitor) {

        return visitor.visit(this);
    }

    @Override
    public <T, P> T accept(ParameterizedAstVisitor<T, P> visitor, P param) {

        return visitor.visit(this, param);
    }
}
