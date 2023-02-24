package PracticeBasic;

//functional interface - interface which consists only single(one) function

@FunctionalInterface   // annotations (required else we won't be able to create functional interface

interface functional{
	void show();
}

/*class get implements functional {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show");
	}
	
}*/
public class Interface_functional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            
		//get g= new get() 
		functional f= new functional(){ //able to create object of interface
			
			public void show() {
				System.out.println("Show of interface");
			}
		};
		f.show();
	}

}
