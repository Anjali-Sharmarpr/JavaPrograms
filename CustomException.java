package PracticeBasic;

//creating our own exceptions

class AnjaliException extends Exception{ //inheriting features from the Exception class
	
	public AnjaliException(String str ) {   //constructor
		super(str);     //calling the constructor of Exception class using super()
	}
}
public class CustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i=10;
		int j=20;
		
		int result ;
		
		try {
		    result=i/j;	
		    
		    if(result==0) {
		    	throw new AnjaliException("Its my exception");
		    }
		}
		catch(AnjaliException e) {
			result=i;
			System.out.println("Showing default output" + e);
		}
		System.out.println(result);
		
		
		//finally - block which will definetely executes irresepective of exceptions
		
		try {
			int h=4/2;
			
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally executes");
		}
	}

}
