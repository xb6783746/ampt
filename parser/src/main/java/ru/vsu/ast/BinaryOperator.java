package ru.vsu.ast;

import java.util.Arrays;

public enum BinaryOperator {

    And("&"), Or("|"),
    Equal("=="), NotEqual("!="),
    Less("<"), Greater(">"), LessOrEqual("<="), GreaterOrEqual(">="),
    Plus("+"), Minus("-"),
    Pow("^"), ElemPow(".^"),
    ElemProd(".*"), ElemDiv("./"),
    Prod("*"), Div("/");

    private String operator;

    BinaryOperator(String operator){

        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public static BinaryOperator get(String operator){

        //TODO move to different class
        if(operator.equals("&&")){

            return And;
        }

        if(operator.equals("||")){

            return Or;
        }

        return Arrays.stream(BinaryOperator.values())
                .filter(x -> x.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException(
                        "Operator with given string representation does not exist"
                ));
    }

}
