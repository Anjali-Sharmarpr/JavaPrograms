package PracticeBasic;

//using final keyword 
//act as constant
//to make our variable, method or class constant we will use final keyword

 final class My{
	final void show () {
		System.out.println("Anjali's Method");
	}
	 void add(int a , int b) {
		System.out.println(a+b);
	}
}
class Your extends My{ //to protect the class from getting inherited  we can use final keyword
	
	//to protect function from overriding we can use final keyword
	
	void show() {  //function override
		System.out.println("Your's Method");
	}
}

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int num=5;
		//num=4; //will show error because final can't be modified
		
		System.out.println(num);
		
		My m= new My();
		m.show();
		m.add(4, 5);
        
		Your y= new Your();
		y.show();
		y.add(4, 5);
	}

}
