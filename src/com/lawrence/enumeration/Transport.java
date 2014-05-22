package com.lawrence.enumeration;

enum Transportation
{
	CAR(80), BIKE(20), BUS(60), WALK(10), RAILWAY(300), AIRLINE(700);
	
	private int speed;
	
	private Transportation(int speed)
	{
		this.speed = speed;
	}
	int getSpeed()
	{
		return this.speed;
	}
}

public class Transport {
	public static void testTransportation()
	{
		Transportation t = Transportation.CAR;
		
		switch(t)
		{
			case CAR:
				System.out.println("By car");
			default:
				System.out.println("Something else");
		}
		
		Transportation[] array = Transportation.values();
		for(Transportation tt :array)
			System.out.println(tt);
		
		Transportation ttt = Transportation.valueOf("AIRLINE");
		System.out.println(ttt);
	}
}

