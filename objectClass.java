package PracticeBasic;

//object class - the default class inherited by our created class

class Laptop{
	String model;
	int price;
}

public class objectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Laptop obj = new Laptop();
		obj.model="HP";
		obj.price=50000;
		
		System.out.println(obj.toString());
		
	}

}
