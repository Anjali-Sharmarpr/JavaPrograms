package PracticeBasic;

//inner class is class inside a class

 class Outer{
	 public void show() {
		 System.out.println("In show of class A");
	 }
	 
	 class Inner{
		 public void show() {
			 System.out.println("In show of class B");
		 }
	 }
}
public class InnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Outer obj = new Outer();
          obj.show();
          
          //Inner obj1 = new Inner();  //error
          Outer.Inner obj1 =  obj.new Inner(); //object of outer class is required to create inner class
          obj1.show();
          
          /*
           * if inner class is declared static
           * then it will be called in the following manner
           * Outer.Inner obj1 = new Outer.Inner(); 
           * (As objects can't be created for static class
          */
          
          Outer obj2 = new Outer()
        		  {
        	           public void show() {            //anynomous inner class
        	        	   System.out.println("In anynomous show"); 
        	           }
        		  };
          obj2.show();
          
          
	}

}
