package com.lawrence;
import static java.lang.System.*;

public class Diamond implements Interface1, Interface2 {
    public void func1(){
        out.println("func1");
    }
    public void func2(){
        out.println("func2");
    }
    public static void main(String[] args){
        Diamond d = new Diamond();
        d.func1();
        d.func2();

    }
}