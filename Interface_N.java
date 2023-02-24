package PracticeBasic;

//more on interfaces
//interfaces helps in achieving multiple interface

/*
 * class - class -> extends
 * class - interface - >implements
 * interface - interface -> extends 
 */

interface X{
	void show();
	void config();
}

interface Y{
	void run();
}

interface W extends Y{
	void run();
}

class V implements W{

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running W");
	}
	
}
class Z implements X,Y{  //multiple interface

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running Y");
		
	}
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Showing X");
		
	}
	public void config() {
		// TODO Auto-generated method stub
		System.out.println("Configuring X");
	}
	
}
public class Interface_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Z obj=new Z() ;
		obj.config();
		obj.show();
		obj.run();
		
		V obj1 = new V();
		obj1.run();
		
	}

}
