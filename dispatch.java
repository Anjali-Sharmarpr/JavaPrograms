package PracticeBasic;

//practicing Dynamic Method Dispatch

class D{
	public void show() {
		System.out.println("In D Show");
	}
}

class E extends D{
	public void show() {
		System.out.println("In E show");
	}
}
 class dispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		D obj = new D();
		obj.show();
		
		obj = new E();
		obj.show();
		
		//this is called dynamic method dispatch in java
		//only possible when there is inheritance
		//and it is an example of Run Time Polymorphism
	}

}
