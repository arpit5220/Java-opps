
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		// store 5 roll no.
		//int [] numbers=new int[5];
		
		// store 5 names
		//String [] names=new String[5];
		
	
		// Student arpit; // declaraing a reference variable to an object of Student class
		 
 		 //Student [] kunal=new Student[5];
 		//System.out.println(Arrays.toString(kunal)); --> [null,null,null,null,null]
 		
 		//Student s1=new Student();
 		//new keyword--> Dynamically alocates memory and return a reference variable to it
 		// Dynamic memory allocation means provide memory at runtime not compile time
 		
 		Student arpit =new Student(15,"kumar",85.6f); //--> object created 
 	 Student ankit =new Student();// --> object created
 		//Constructor --> is a special function that runs when you create a objects and it alocate some variable
 		// if contructor has no argument then it is a default constructor
 		
 		//System.out.println(arpit.rno);//--> 13 // if non parametrised constructor called
 	   //this keyword is used to make it accessible for every object
 	//	System.out.println(ankit.rno);//--> 13    if non parametrised constructor called
 		

 		 //  arpit.changename("coding lover");
 			// arpit.greeting();
 			
 			// System.out.println(arpit.rno);
 			// System.out.println(arpit.name);
 			// System.out.println(arpit.marks);
 			
 			// Student random=new Student(arpit);
 			
 			// System.out.println(random.rno); //--> 15
 			// System.out.println(random.name); //--> kumar
 			// System.out.println(random.marks);// --> 85.6
 			
 			Student one= new Student(18,"undertaker",89.6f);
 			Student two=one;   // copy to another object
 			
 			one.name="Something";   // changing in one object change it for second in heap
 			System.out.println(two.name);
 			
 			
	}
}
	

	// creat a class
	/// classes does not ocupy space in the memory it is just a logical  contruct
	// object occupying space in the memory, it is a physical reality
class Student{
	    
	    int  rno;
	    String  name;
	    float  marks;
	
	void greeting(){
	    System.out.println("hello my name is "+ this.name);
	}
	
	void changename(String newname  ){
	    name=newname;
	}
	
	
	
	// Constructor
// 	Student() // non parameterised constructor
// 	{
// 	    this.rno=13;     // this is more appropriate for passing value to different objects
// 	    this.name="katiyar";
// 	    this.marks=100.5f;
// 	}
	
	Student() //--> default constructor
	{
	    
	}
	
	Student(int roll,String name,float marks)
	{
	    this.rno=roll;     //--> also working 
	    this.name=name;
	    this.marks=marks;
	}
	
	Student (Student other)  //--> copy of object
	{
	    
	    this.rno=other.rno;     
	    this.name=other.name;
	    this.marks=other.marks;
	}
	
}
