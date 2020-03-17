package epamTask.task721;

public class adapter 
{
	public static void main(String args[]) 
    { 
        sparrow sp = new sparrow(); 
        toyduck toyD = new plastictoyduck(); 
  
        toyduck birdAdapter = new birdadapter(sp); 
  
        System.out.println("Sparrow..."); 
        sp.fly(); 
        sp.makeSound(); 
  
        System.out.println("ToyDuck..."); 
        toyD.squeak(); 
  
        System.out.println("BirdAdapter..."); 
        birdAdapter.squeak(); 
    } 

}
