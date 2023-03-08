package PracticeBasic;


//practicing multiple thread
//means a multiple threads will execute parallely

class One extends Thread{     //now we make it a thread class
	
	public One() {
		System.out.println("Constructor one");
	}
	public void run() {
		
		for(int i=0;i<100;i++) {
			System.out.println("One");
			
			try {
				Thread.sleep(10);  //waiting state
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

class Two extends Thread{
	
	public Two() {
		System.out.println("Constructor two");
	}
	public void run() {

		for(int i=0;i<100;i++) {
			System.out.println("Two");
			
			try {
				Thread.sleep(10); // waiting state
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
public class UsingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		One obj1 = new One();
		Two obj2 = new Two();
		
		
		//executing the run function simultaneously
		
		//start method present in thread class
		
		obj1.start();
		obj2.start();  
		
		
		//1 - least priority ,  10- highest priority, 5- default priority
		
		System.out.println(obj1.getPriority());
		System.out.println(obj2.getPriority());
		
		obj2.setPriority(4);
		System.out.println(obj2.getPriority());
		
		obj1.setPriority(Thread.MAX_PRIORITY-1);  //max priority 10 , min priority
		System.out.println(obj1.getPriority()); 
		
		
          
	}

}
