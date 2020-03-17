package epamTask.Task71;

public class getPlanFactory 
{
	public plan getPlan(String planType)
	{  
        if(planType == null)
        	return null;    
        if(planType.equalsIgnoreCase("DOMESTICPLAN"))  
             return new domesticPlan();  
        else if(planType.equalsIgnoreCase("COMMERCIALPLAN"))  
            return new commercialPlan();  
        else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN"))   
            return new instituitionalPlan();  
        return null;
     }   
}
