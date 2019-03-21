

package calculator;

public class Calculator {

	
	public float sum(float x,float y)
     
     {
    	 
    	 return x+y;
     }
	
  public float multiplication(float x,float y)
     
     {
    	 
    	 return x*y;
     }

  
  public float division(float x,float y)
  
  {
	  if(y == 0)
	  {
		  throw new IllegalArgumentException("Divisor cannot be zero");
	  }
 	 
	   else
	    {
		  
 	      return x/y;
	    }
   }
  
}



