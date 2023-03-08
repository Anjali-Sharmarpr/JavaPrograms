package PracticeBasic;


// Runnable is an interface (implementing by thread class)


/*class Three implements Runnable{     //now we make it a thread class
	
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Three");
			
			try {
				Thread.sleep(5);  //waiting state
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}*/

class Four implements Runnable {     //now we make it a thread class
	
	
	public void run() {
		
		for(int i=0;i<5;i++) {
			System.out.println("Four");
			
			try {
				Thread.sleep(5);  //waiting state
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class usingRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Runnable obj= new Runnable() {    //created anynomous class
			public void run() {
				
				for(int i=0;i<5;i++) {
					System.out.println("Three");
					
					try {
						Thread.sleep(5);  //waiting state
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		};
		Runnable obj1 =   new Four();
		
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj1);
		
		t1.start();
		t2.start();
	}

}
