package com.lawrence;

public interface Interface1{
    void func1();
    default void func3(){
        System.out.println("func3");
        func1();
    }
}