package PracticeBasic;

//practising static variable
//static variable is shared by all the objects
//static variable  belongs to class

class Mobile{
	
    String  name;
	int price;
	static String type;
	
	void show() {
		System.out.println("Name is "+ name + " price is "+ price + " type is "+ type);
	}
	
	//static method
	//static method consists only static variable 
	//because they are called using classes so we don't know which object we are talking about
	//to consists it non static variable we can pass object reference
	
	static void show1(Mobile obj) {
		
		System.out.println("In static method");
		
		//System.out.println("Name is "+ name + " price is "+ price + " type is "+ type);
		//will give error on name and price variable
		
		System.out.println("Name is "+ obj.name + " price is "+ obj.price + " type is "+ type);
	}
}
public class usingStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m1=new Mobile();
		m1.name="Samsung";
		m1.price=10000;
		//m1.type="SmartPhone";
		Mobile.type="SmartPhone";
		
		Mobile m2=new Mobile();
		m2.name="Realme";
		m2.price=15000;
		//m2.type="SmartPhone";
		Mobile.type="SmartPhone";
		
		m1.show();
		m2.show();
		
		//m1.type="android";
		Mobile.type="android";
		m1.show();
		m2.show();
		
		//creating type variable static
		//static variable is shared by all objects therfore object 1 changes the name ,
		//but object2 is showing the changed name (without changing)
		
		//static method don't need an object to called, called usign classs name
		Mobile.show1(m1);
		
		
         
	}

}
