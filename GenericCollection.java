package Generics;

//use of generics in collection

import java.util.*;
public class GenericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		ArrayList<Integer> num= new ArrayList(); //arraylist of integer type
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(5);
		
		Vector<String> names = new Vector();
		names.add("Anil Sharma");
		names.add("Jaya Sharma");
		names.add("Pooja Sharma");
		names.add("Anjali Sharma");
		
		String name= names.get(3);
		int id = num.get(2);
		
		System.out.println("Name:-  " + name );
		System.out.println("ID :- " + id);
		
		ArrayList marks = new ArrayList();
		marks.add(54);
		marks.add(79);
		marks.add(63);
		marks.add(91);
		marks.add(24);
		
		int score =  (int)marks.get(1);  //if dont use generics then we have to type cast implicitly
		System.out.println("Marks:-  " + score);
		
		
		
		
		
	}

}
