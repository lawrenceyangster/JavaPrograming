package com.lawrence.chapter4;

public class NumberBox<T extends Number> extends Box<T> {
    public int intValue(){
        return value.intValue();
    }
}
