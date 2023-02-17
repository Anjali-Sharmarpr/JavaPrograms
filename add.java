//adding two numbers by making classes and objects
class Sum{
     
    public int add(int num1,int num2){
        return (num1+num2);
    }
}
public class add {
    public static void  main(String args[]){
         Sum obj = new Sum();
         int result=obj.add(10, 20);
         System.out.println(result);
    }
}
