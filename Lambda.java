package PracticeBasic;

//lambda expressions 
//    put this "->"  and the complier will get all the things automatically
//mainly helps in reducing the code
//can only be used with functional interface

@FunctionalInterface
interface ifc{
	int add(int a,int b);
}

/*class inter implements ifc{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show of ifc");
	}
	
}*/
public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ifc i =  (x,y) ->  x+y;  //lambda expressions get the things automatically 
		
		//alternative option
		
		/*{
			return x+y;
		};*/
		
		int result= i.add(5,6);
		System.out.println(result);
		
	}

}
