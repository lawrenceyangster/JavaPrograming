package com.lawrence.package2;

public class ThreeBookSeries extends TwoBookSeries{
    public ThreeBookSeries()
    {
        super(10);
    }

    @Override
    public int getNext() {
        System.out.println("Subclass getNext");
        super.restart();
        return super.getNext();
    }
}
