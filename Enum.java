package PracticeBasic;

//enumeration

enum Status{
	Running, Started, Failed, Success;
}
public class Enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		Status s= Status.Started;
		System.out.println(s);
		
		Status st=Status.Failed;
		System.out.println(st.ordinal()); //returning index of Failed
		
		Status[] s1= Status.values();
		
		for( Status i : s1) {
			System.out.println(i + " : " + i.ordinal());
		}
		
		//if else and switch also works in enum
		
		System.out.println();
		
		if(s==Status.Running) {
			System.out.println("Running case");
		}
		else if(s==Status.Started) {
			System.out.println("Starting case");
		}
		else if(s==Status.Failed) {
			System.out.println("Failed case");
		}
		else{
			System.out.println("Success case");
		}
		
		switch (st) {
		
		case Running:
			System.out.println("Running case");
			break;
			
		case Started:
			System.out.println("Starting case");
			break;
			
		case Failed:
			System.out.println("Failed case");
			break;
			
		default:
			System.out.println("Success Case");
			break;
			
		}
	}

}
