package ru.vsu.transformer;

import ru.vsu.ast.BasicAstNode;
import ru.vsu.ast.BasicAstVisitor;
import ru.vsu.ast.expression.FunctionCallNode;
import ru.vsu.ast.expression.FunctionHandleExpression;
import ru.vsu.ast.expression.RangeExpressionNode;
import ru.vsu.ast.expression.SliceExpressionNode;
import ru.vsu.helpers.FunctionNameResolver;

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

        String name = nameResolver.resolve(node.getFunctionName());

        node.setFunctionName(name);

        return super.visit(node);
    }

    @Override
    public Void visit(FunctionHandleExpression node) {

        String name = nameResolver.resolve(node.getFunctionName());

        node.setFunctionName(name);

        return super.visit(node);
    }

}
