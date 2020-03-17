package epamTask.task732;

public class context 
{
	private strategy strat;  
    public context(strategy strat){  
       this.strat = strat;  
    }  
    public float executeStrategy(float num1, float num2)
    {  
       return strat.calculation(num1, num2);  
    }  
}
