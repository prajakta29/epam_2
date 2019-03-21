package Exec;

import calculator.Calculator;
import interest.InterestCalculation;
import house.HouseCost;

public class Executor {
	
	
	public static void main(String args[])
	{
		InterestCalculation i = new InterestCalculation();
		Calculator c = new Calculator();
		HouseCost  h = new HouseCost();
		
		float a=0 ,b=0;
		double p = 0,t = 0,r = 0;
		int ch =0;
		double sqft =0;
		
		
		float sum = c.sum(a, b);
		c.multiplication( a, b);
		c.division(a,b);
		
		i.compoundinterest(p, t, r);
		i.simpleinterest(p, t, r);
		
		
		h.constructcost(ch, sqft);
	}

}
