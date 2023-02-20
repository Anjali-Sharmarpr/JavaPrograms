package PracticeBasic;

//practising inheritance 
//inheritance - 'is' relationship and 'has' relationship

class Calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
}
class AdvCalculator extends Calculator{
	public int mul(int a,int b) {
		return a*b;
	}
	public int div(int a,int b) {
		return a/b;
	}
}
class VeryAdvCalculator extends AdvCalculator{  
	public int power(int a,int b) {
		double c=(double)a;
		double d=(double)b;
		
		return (int)Math.pow(c, d);
	}
}
public class usingInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         VeryAdvCalculator c= new VeryAdvCalculator();
         System.out.println("add "+ c.add(10, 5)+" "+ "sub "+ c.sub(10, 5)+" ");
         System.out.println("mul "+ c.mul(10, 5)+" "+ "div "+ c.div(10, 5)+" ");
         System.out.println("power "+ c.power(10,5));
         
         //VeryAdvCalculator is inheriting from AdvCalculator and then 
         //AdvCalculator is inheriting from Calculator 
         //its called Multi Level Inheritance
         
         /*
          * A
          * ^
          * |
          * B
          * ^
          * |
          * C
          */
         
         //Multiple inheritance - where two parent class and one child class 
         //not possible in java due to ambiguity
	}

}
