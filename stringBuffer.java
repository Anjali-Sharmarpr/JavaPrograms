package PracticeBasic;

//String Buffer stored Mutable strings
//Mmutable strings are those which can be changed

public class stringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StringBuffer sb=new StringBuffer("Anjali");
         sb.append(" Sharma");
         System.out.println(sb);
         sb.insert(0,"I am ");
         System.out.println(sb);
         sb.deleteCharAt(11);
         System.out.println(sb);
         sb.delete(11, 17);
         System.out.println(sb);
         
         
	}

}
