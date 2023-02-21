package PracticeBasic;


//abstract method should be inside an abstract class
//abstract class may or may not contain an abstract method
//abstract method declared in base function , defined (override) in derived class


abstract class Car{
	public abstract void drive();
	
	
	public void music() {
		System.out.println("Music Playing");
	}
}

class Maruti extends Car{
	
	//definition of abstract method must be present in derived class
	
	public void drive() { 
		System.out.println("Driving");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		 //objects of abstract class can't be created
		
		//Car obj = new Car();
		Maruti obj = new Maruti();
		obj.drive();
		obj.music();
	}

}
