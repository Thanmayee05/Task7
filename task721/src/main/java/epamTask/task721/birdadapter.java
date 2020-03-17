package epamTask.task721;

public class birdadapter implements toyduck
{
	bird bird; 
    public birdadapter(bird bird) 
    { 
        this.bird = bird; 
    } 
  
    public void squeak() 
    { 
        bird.makeSound(); 
    } 

}
