package com.lawrence;

public class DataTypes {
	public static void intLiterals()
	{
		int i = 123_456_789;
		System.out.println(i);
	}
	
	public static void binaryLiterals()
	{
		int i = 0b0110;
		int j = 6;
		
		assert(i==j);
	}
}
