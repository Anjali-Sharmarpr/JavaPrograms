package PracticeBasic;

//exploring static block
//static block gets executed whenever a class is loaded
//static block gets executed only once


class Phone{
	
  String  name;
	int price;
	static String type;
	
	//constructor
	public Phone(){
		name="Branded";
		price=1000;
		
		System.out.println("In Constructor");
	}
	//static block
	//helps in initializing the static variables
	static {
		type="Andoid Phone";
		System.out.println("In static block");
	}
	 void show() {
		System.out.println("Name is "+ name + " price is "+ price + " type is "+ type);
	}

}

public class staticBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object 1  creation
		Phone m1=new Phone();
		m1.show();
		
		//object 2 creation
		Phone m2=new Phone();
		m2.show();
		
        
	}

}
