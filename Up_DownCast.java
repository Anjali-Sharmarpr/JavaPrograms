package PracticeBasic;

//upcasting and downcasting
//same as typecasting but in terms of objects

class Parent{
	public void show1() {
		System.out.println("In parent show");
	}
}
class Child extends  Parent{
	public void show2() {
		System.out.println("In child show");
	}
}
public class Up_DownCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           Parent obj = (Parent)new Child(); //Upcasting - casting to upper level class
           obj.show1();
           
           Child obj1 =  (Child)obj; //Downcasting - casting to lower level
           //instead of new Child(); we used the old object(Parent Type) and typecasted it to Child type
           obj1.show2();
		
	}

}
