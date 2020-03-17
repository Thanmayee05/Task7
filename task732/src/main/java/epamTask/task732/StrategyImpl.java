package epamTask.task732;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
public class StrategyImpl 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        System.out.print("Enter the first value: ");  
        float value1=Float.parseFloat(br.readLine());  
        System.out.print("Enter the second value: ");  
        float value2=Float.parseFloat(br.readLine());  
        context context = new context(new add());          
        System.out.println("Addition = " + context.executeStrategy(value1, value2));  

        context = new context(new sub());       
        System.out.println("Subtraction = " + context.executeStrategy(value1, value2));  

        context = new context(new mult());        
        System.out.println("Multiplication = " + context.executeStrategy(value1, value2));  
     }  

}
