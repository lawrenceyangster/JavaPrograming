package com.lawrence;

public class MoreDataTypes {
	public static int sum(int[] array)
	{
		int sum =0;
		
		for(int i: array) sum+=i;
		
		return sum;
	}
	
	public static void shift()
	{
		byte i = -34;
		
		System.out.println("Left Shifting -34 by 2 = "+(-34<<2) );
		System.out.println("Right Shifting -34 by 2 = "+(-34>>2) );
		System.out.println("Unsigned Right Shifting -34 by 2 = "+(-34>>>2) );
		
	}
}
