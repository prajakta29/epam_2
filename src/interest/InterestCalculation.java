package interest;

public class InterestCalculation 
{
	
	
private double n;

public double simpleinterest(double principal,double time,double rate)
{
	double simplerate = (principal*time*rate)/100;
	return simplerate;

}

public double compoundinterest(double principal,double time,double rate)
  {
	double compoundrate = (principal*(Math.pow((1+rate/100),time)));
	return compoundrate;
	
	
   }


}
