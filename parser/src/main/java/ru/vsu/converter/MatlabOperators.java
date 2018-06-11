package ru.vsu.converter;

import ru.vsu.ast.BinaryOperator;
import ru.vsu.ast.UnaryOperator;

import java.util.Hashtable;
import java.util.Map;

public class MatlabOperators {


    private static Map<String, BinaryOperator> binaryOperators = new Hashtable<>();
    private static Map<String, UnaryOperator> unaryOperators = new Hashtable<>();

    static{

        binaryOperators.put("&", BinaryOperator.And);
        binaryOperators.put("&&", BinaryOperator.And);
        binaryOperators.put("|", BinaryOperator.Or);
        binaryOperators.put("||", BinaryOperator.And);

        binaryOperators.put("+", BinaryOperator.Plus);
        binaryOperators.put("-", BinaryOperator.Minus);

        binaryOperators.put("*", BinaryOperator.Prod);
        binaryOperators.put(".*", BinaryOperator.ElemProd);

        binaryOperators.put("/", BinaryOperator.Div);
        binaryOperators.put("./", BinaryOperator.ElemDiv);

        binaryOperators.put("^", BinaryOperator.Pow);
        binaryOperators.put(".^", BinaryOperator.ElemPow);

        binaryOperators.put(">", BinaryOperator.Greater);
        binaryOperators.put("<", BinaryOperator.Less);
        binaryOperators.put(">=", BinaryOperator.GreaterOrEqual);
        binaryOperators.put("<=", BinaryOperator.LessOrEqual);

        binaryOperators.put("==", BinaryOperator.Equal);
        binaryOperators.put("!=", BinaryOperator.NotEqual);

        unaryOperators.put("+", UnaryOperator.Plus);
        unaryOperators.put("-", UnaryOperator.Minus);
        unaryOperators.put("~", UnaryOperator.Not);
        unaryOperators.put("!", UnaryOperator.Not);
        unaryOperators.put(".'", UnaryOperator.Transpose);
        unaryOperators.put("'", UnaryOperator.ComplexConjTranspose);
    }

    public static BinaryOperator getBinaryOperator(String string){

        if(binaryOperators.containsKey(string)){

            return binaryOperators.get(string);
        }

        throw new IllegalArgumentException(
                "Operator with given string representation does not exist"
        );
    }

    public static UnaryOperator getUnaryOperator(String string){

        if(unaryOperators.containsKey(string)){

            return unaryOperators.get(string);
        }

        throw new IllegalArgumentException(
                "Operator with given string representation does not exist"
        );
    }
}
