package com.iandavisdev;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Row {
    Symbol[] pixels;
    public void draw(){
        System.out.print(Symbol.VERTICAL_BORDER.getCharValue());
        for (Symbol pixel : pixels){
            System.out.print(pixel.getCharValue());
        }
        System.out.print(Symbol.VERTICAL_BORDER.getCharValue());
        System.out.print('\n');
    }
}
