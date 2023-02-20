package PracticeBasic;

//using this and super method
//super() -  calls the constructor of super class (parent class)
//this() -  calls the constructor of the same class 

 class A extends Object{ //by default the super class inherits the object class 
	public A(){
		super(); //here super() calling constructor of object class 
		System.out.println("Class A Constructor");
	}
	public A(int n){
		//super();
		this();
		System.out.println("Class A parameterized constructor "+ n);
	}
}
 class B extends A{
	 public B(){
		 super(); // here super() calling constructor of its super class (parent class)
		  System.out.println("Class B constructor");
	 }
	 public B(int n){
		 //super(5); 
		 this();
		 System.out.println("Class B parametrized constructor "+ n);
	 }
 }
public class this_super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B obj = new B(5);
	}

}
