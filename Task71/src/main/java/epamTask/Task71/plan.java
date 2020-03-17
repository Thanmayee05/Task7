package epamTask.Task71;

abstract class plan 
{
	protected double price;  
    abstract void getRate();  

    public void calculateBill(int units)
    {  
         System.out.println(units*price);  
    }  

}
