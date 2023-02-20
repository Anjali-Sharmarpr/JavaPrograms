package PracticeBasic;

//implementing method overriding
//when same method is present in both base and derived class

class base{
	void show() {
		System.out.println("Show A");
	}
	int sum(int a,int b) {
		return a+b;
	}
}
class derive extends base{
	void show() {
	  System.out.println("Show B");
	}
	int sum(int a, int b) {
		return a+b+1;
	}
}
public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           derive obj = new derive();
           obj.show();                   //show B will be called
           System.out.println(obj.sum(2, 3));        //sum of class B will be called
           base obj1 = new base();
           obj1.show();                  //show A will be called
           System.out.println(obj1.sum(2, 3));       //sum of class A will be called
	}

}
