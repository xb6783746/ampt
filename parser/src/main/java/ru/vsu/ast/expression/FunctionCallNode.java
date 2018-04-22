package ru.vsu.ast.expression;

import ru.vsu.ast.AstTreeVisitor;
import ru.vsu.ast.BasicAstNode;

import java.util.List;

public class FunctionCallNode extends ExpressionNode {


    public static class FunctionArgumentNode extends ExpressionNode {

        public FunctionArgumentNode(ExpressionNode expression) {

            this(null, expression, null);
        }

        public FunctionArgumentNode(ExpressionNode expression, String argName) {

            this(null, expression, argName);
        }

        public FunctionArgumentNode(BasicAstNode parent, ExpressionNode expression, String argName) {
            super(parent);
            this.expression = expression;
            this.argName = argName;
        }

        private ExpressionNode expression;
        private String argName;

        public ExpressionNode getExpression() {
            return expression;
        }

        public String getArgName() {
            return argName;
        }

        @Override
        public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

            if(expression == oldNode){

                expression = (ExpressionNode)newNode;
            }
        }

        @Override
        public <T> T accept(AstTreeVisitor<T> visitor) {

            return visitor.visit(this);
        }
    }


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

    public ExpressionNode getObject() {
        return object;
    }

    @Override
    public void replace(BasicAstNode oldNode, BasicAstNode newNode) {

        replaceInList(args, oldNode, newNode);
    }

    @Override
    public <T> T accept(AstTreeVisitor<T> visitor) {

        return visitor.visit(this);
    }
}
