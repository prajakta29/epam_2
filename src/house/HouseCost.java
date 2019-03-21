package house;

public class HouseCost {

	
	public double constructcost(int choice,double sqfeet)
	{
		/*
		 * -----select among below choices-------
		 
		 1. Standard materials cost=1200INR
		 2. Above standard materials cost =1500INR
		 3. High standard materials cost=1800INR
		 4. High Standard and fully automated cost =2500INR
		 */
	
		
		double res;
				
		if(choice == 1)
		{
			
			  res = sqfeet*1200;
		
			return  res;
		}
		
		else if(choice == 2)
		{
			
			 res= sqfeet*1500;
			
			 return  res;
		}
		
		else if(choice == 3)
		
		{
			 res= sqfeet*1800;
			
			 return  res;
			
		}
		
		else if(choice == 4)
		{
			
		 res = sqfeet*2500;
		 return  res;
			
		}
	
		return 0;
	}
	
	
	
}
