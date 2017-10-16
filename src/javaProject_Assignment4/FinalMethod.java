 package javaProject_Assignment4; 
 //Package Declaration is mandatory

 //Base Class 
public class FinalMethod {
	
	//Showing Final Method demo
	final void demo(){
	      System.out.println("ABC Class Method");
	   } 
}

//Derived class
class NormalMethod extends FinalMethod{  
	//We can't override final method
	   /*void demo(){
	      System.out.println("cd Class Method");
	   }*/
	   
	//Main method started
	   public static void main(String[] args) {
		   //creation object 
			NormalMethod obj= new NormalMethod();  
			//Calling method
		      obj.demo(); 
		      
	   }
}
