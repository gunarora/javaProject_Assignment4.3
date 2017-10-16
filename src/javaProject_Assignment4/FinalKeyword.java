/*Write a program in java to demonstrate the use of final keyword with class, with the method, with constructor and with a variable
the constructor, and with a variable.*/
//Showing Final Variable and Final constructor demo
package javaProject_Assignment4; ////Package Declaration is mandatory

//Class
public class FinalKeyword {
	
	//Final variable declaration
	 final int MAX_VALUE=99;
	 
	 ////Blank final variable
	   final int MIN_VALUE;
	   
	   FinalKeyword(){
		      //It must be initialized in constructor
		   //Final Constructor
		   MIN_VALUE=100;
		   }
	   //method to print the value of final variable
	   void mthdValue(){ 
		   //we can't define new value to final variable
		 //MAX_VALUE=101;
		   System.out.println(MIN_VALUE +" "+ MAX_VALUE);
	      
	   }  
	   
	   
	   
	   //Main Started
	   public static void main(String args[]){  
		   //object of class
		   FinalKeyword obj=new  FinalKeyword();  
		   //call the method using object
	     obj.mthdValue(); 
	   }

	

}

 

