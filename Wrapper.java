package PracticeBasic;

//practising about Wrapper Class
//conversion of primitive type variable into object  known as AutoBoxing
//and also object type into primitive type known as AutoUnBoxing

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		int num=7;
		//Integer class
		Integer num1= num; //auto boxing
		
		int num2 = num1; //auto unboxing 
		//conversion is happening automatically
		
		System.out.println(num);
		System.out.println(num1);
		System.out.println(num2);
		
		//String class
		String str="12";
		int num3=Integer.parseInt(str);
		
		System.out.println(num3*2);
		
		
		
	}

}
