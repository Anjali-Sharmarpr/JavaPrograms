
package PracticeBasic;

//exception - runtime errors which stops the execution of programs 
/*
* taking example of divide by zero
* array index out of bound exception
*/
public class TryException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i=0;
		int j=20;
		int arr[]= new int[5];
		
		//int result= j/i; //will throw divide by zero error
		int result=0; 
		
		
		
		try {
			result=j/i;
			System.out.println(arr[5]);   //array index out of bound exception
		}
		
		/*catch(Exception e) {    //Exception class 'e' is object 
			System.out.println("Something Went Wrong " + e); //e will show the exception
		}*/
		
		catch(ArithmeticException e) {   //for arithmetic exception
			System.out.println("Exception :- " + e);
		}
		catch(ArrayIndexOutOfBoundsException e) {   //for array index out of bound
			System.out.println("Exception :- " + e );
		}
		catch(Exception e){
			System.out.println("Exception :- " + e );  //for any other exception
		}
		System.out.println(result);
		
		//if exception occurs then only catch block executes
		
		//we can mention what we want in the catch field 
		//or we can force our exception to execute the corresponding catch block 
		
		int d=15,r=20;
		int ans;
		
		//example can't divide a number greater than the dividend
		try {
			 ans= d/r;
			 if(ans==0) {
				 //throwing arithmetic exception and the catch block catches it
				 throw new ArithmeticException("Arithmetic Exception throwing by me");
			 }
		}
		catch(Exception e){
			System.out.println("Showing Default output" + e);
			ans=d;
		}
		System.out.println(ans);
		
		
	}

}
