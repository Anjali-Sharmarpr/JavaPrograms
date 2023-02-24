package PracticeBasic;

//Abstract and anonymous inner class

abstract class demo{
	
	public abstract void show();
}

class demoC extends demo{
	public void show() {
		System.out.println("Show");
	}
	
}
public class Abstract_Inner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//it will give error  as objects of abstract class  cant be created
		//demo obj = new demo();
		//but it can be done using anonymous inner class
		
		demo obj = new demo() 
		{
			public void show() {
				System.out.println("Show function of anonymous inner class");
			}
		};
		obj.show();
		demoC o = new demoC();
		o.show();

	}

}
