package ru.vsu.converter;

import ru.vsu.ast.BinaryOperator;
import ru.vsu.ast.UnaryOperator;

import java.util.Hashtable;
import java.util.Map;

public class MatlabOperators {


    private static Map<String, BinaryOperator> map = new Hashtable<>();
    private static Map<String, UnaryOperator> unaryOperators = new Hashtable<>();

    static{

        map.put("&", BinaryOperator.And);
        map.put("&&", BinaryOperator.And);
        map.put("|", BinaryOperator.Or);
        map.put("||", BinaryOperator.And);

        map.put("+", BinaryOperator.Plus);
        map.put("-", BinaryOperator.Minus);

        map.put("*", BinaryOperator.Prod);
        map.put(".*", BinaryOperator.ElemProd);

        map.put("/", BinaryOperator.Div);
        map.put("./", BinaryOperator.ElemDiv);

        map.put("^", BinaryOperator.Pow);
        map.put(".^", BinaryOperator.ElemPow);

        map.put(">", BinaryOperator.Greater);
        map.put("<", BinaryOperator.Less);
        map.put(">=", BinaryOperator.GreaterOrEqual);
        map.put("<=", BinaryOperator.LessOrEqual);

        map.put("==", BinaryOperator.Equal);
        map.put("!=", BinaryOperator.NotEqual);

        unaryOperators.put("+", UnaryOperator.Plus);
        unaryOperators.put("-", UnaryOperator.Minus);
        unaryOperators.put("~", UnaryOperator.Not);
    }

    public static BinaryOperator getBinaryOperator(String string){

        if(map.containsKey(string)){

            return map.get(string);
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
