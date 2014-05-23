package com.lawrence.general;

class NumberFns<T extends Number>
{
	T number;
	
	NumberFns(T number)
	{
		this.number = number;
	}
	T getNumber()
	{
		return number;
	}
	int compare(NumberFns<?> t)
	{
		double d1 = number.doubleValue();
		double d2 = t.getNumber().doubleValue();
		
		if(d1 == d2)
			return 0;
		else
			if(d1>d2)
				return 1;
			else
				return -1;
	}
}
public class WildGenericsDemo {

}
