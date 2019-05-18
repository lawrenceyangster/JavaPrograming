package com.lawrence.chapter4;

public class ComparableBox<T extends Comparable<T>> extends Box<T> implements Comparable<ComparableBox<T>> {
    public int compareTo(ComparableBox<T> o){
        if(value == null)
            return o.value == null? 0: -1;

        return this.value.compareTo(o.value);
    }
}
