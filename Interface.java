package PracticeBasic;

//interface 

interface Sample{
	
	//by default the variables are static and final in interface
	//means can't change it
	
	int age=5;
	
	void show();
	void config();
}

class NewSample implements Sample{
	
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("In show");
	}

	public void config() {
		// TODO Auto-generated method stub
		System.out.println("In config");
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewSample s = new NewSample();
		s.show();
		s.config();
		
		System.out.println(Sample.age);
		//Sample.age=4; //error 
  
	}

}
