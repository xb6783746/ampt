package ru.vsu.ast;

import java.util.Arrays;

public enum BinaryOperator {

    Equal("=="), NotEqual("!="),
    Less("<"), Greater(">"), LessOrEqual("<="), GreaterOrEqual(">="),
    Plus("+"), Minus("-"), Prod("*"), Div("/");

    private String operator;

    BinaryOperator(String operator){

        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public static BinaryOperator get(String operator){

        return Arrays.stream(BinaryOperator.values())
                .filter(x -> x.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        "Operator with given string representation does not exist"
                ));
    }

}
