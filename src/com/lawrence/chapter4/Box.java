package com.lawrence.chapter4;

public class Box<T> {
    protected T value;
    public void box(T t){
        this.value = t;
    }
    public T unBox(){
        T t = this.value;
        this.value = null;
        return t;
    }
}
