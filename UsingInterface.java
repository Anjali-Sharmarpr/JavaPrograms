package PracticeBasic;

//interface- public abstract

interface Computer{
	
	 void code();
}
class Lappy implements Computer {
	
	public void code() {
		System.out.println("Coding by LAptop");
	}
}
class Desktop implements Computer{
	
	public void code() {
		System.out.println("Coding by Desktop");
	}
	
}
class Developer{
	
	public void devApp(Computer com) {
		com.code();
	}
}
public class UsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Lappy l= new Lappy(); 
		Desktop dk= new Desktop();
		
		Developer d = new Developer();
		
		//passing object as parameters
		d.devApp(l); 
		d.devApp(dk);
	}

}
