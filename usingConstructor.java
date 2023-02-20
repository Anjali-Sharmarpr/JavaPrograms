package PracticeBasic;


//Practising all about constructor

class Human{
	private int age;
	private String name;
	
	//constructor - which initializes object
	
	public Human(){ //default constructor
		System.out.println("Constructor called");
		name="Anjali";
		age=21;
	}
	public Human(int a ,String n) { //parameterized constructor
		age=a;
		name=n;
	}
	void show() {
		System.out.println("Name : "+ name);
		System.out.println("Age : "+ age);
	}
	
}
public class usingConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human obj = new Human(); //constructor called when an object is created
		obj.show();
		
		Human obj1 = new Human(18,"Harry"); //constructor called when an object is created
		obj1.show();
		

	}

}
