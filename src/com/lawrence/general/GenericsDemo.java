package com.lawrence.general;

class Gen<T>
{
	T obj;
	
	Gen(T obj)
	{
		this.obj = obj;
	}
	
	T getObject()
	{
		return obj;
	}
	
	void showType()
	{
		System.out.println("The type of the object is " + obj.getClass().getName());
	}
}
public class GenericsDemo {
	
	
	public static void testGen()
	{
		class Shape
		{
			String shapeName;
		}
		class Triangle extends Shape
		{
			
		}
		
		Gen<Integer> genInteger = new Gen<Integer>(88);
		genInteger.showType();
		
		Gen<String> genString = new Gen<String>("Hello");
		genString.showType();
		
		Gen<Shape> genShape = new Gen<Shape>(new Shape());
		
		Gen<Triangle> genTriangle = new Gen<Triangle>(new Triangle());
		
		//genShape = genTriangle;
	}
	
	
}
