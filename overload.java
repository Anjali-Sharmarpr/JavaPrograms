//adding two numbers by making classes and objects
class Sum{
     int temp=5;
    public int add(int num1,int num2){
        return (num1+num2);
    }
    public int add(int num1,int num2,int num3){
        return (num1+num2+num3);
    }
}
public class overload {
    public static void  main(String args[]){
         Sum obj = new Sum();
         int result=obj.add(10, 20);
         System.out.println(result);
         result=obj.add(10, 20,30);
         System.out.println(result);
         Sum obj1 = new Sum();

         obj.temp=8;
         System.out.println(obj.temp);
         System.out.println(obj1.temp);
    }
}
