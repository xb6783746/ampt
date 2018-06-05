package ru.vsu.ast;


public enum BinaryOperator {

    And, Or,
    Equal, NotEqual,
    Less, Greater, LessOrEqual, GreaterOrEqual,
    Plus, Minus,
    Pow, ElemPow,
    ElemProd, ElemDiv,
    Prod, Div,
    IndexGetter, IndexSetter,
    CellGetter, CellSetter
}
