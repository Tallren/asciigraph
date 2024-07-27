package com.iandavisdev;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum Symbol {
    POINT('*'),
    EMPTY(' '),
    VERTEX_UP('/'),
    VERTEX_DOWN('\\'),
    VERTEX_STRAIGHT('-'),
    HORIZONTAL_BORDER('='),
    VERTICAL_BORDER('|');


    private final char charValue;

    public Symbol[] arrayOf(int size){
        var symbols = new Symbol[size];
        Arrays.fill(symbols, this);
        return symbols;
    }

    public static Symbol[] arrayOfWhitespace(int size){
        var symbols = new Symbol[size];
        Arrays.fill(symbols, Symbol.EMPTY);
        return symbols;
    }
    Symbol(char charValue){
        this.charValue = charValue;
    }
}
