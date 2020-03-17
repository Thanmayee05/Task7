package epamTask.Task722;

public class bridge 
{
	public static void main(String[] args) 
	{  
	    qformat questions = new qformat("Java Programming Language");  
	    questions.q = new jQuestions();  
	    questions.delete("what is class?");  
	    questions.display();  
	    questions.newOne("What is inheritance? ");   
	    questions.newOne("How many types of inheritance are there in java?");  
	    questions.displayAll();  
	}  

}
