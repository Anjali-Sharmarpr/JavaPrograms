import java.util.Scanner;
public class calculator {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
         
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();

        System.out.println("Enter operation you want to perform?");
        char op = input.next().charAt(0);

        switch(op){
            case '+':
            System.out.println("Addition: "+ (a+b));
            break;

            case '-':
            System.out.println("Susbtraction: "+ (a-b));
            break;

            case '*':
            System.out.println("Multiplication: "+ (a*b));
            break;

            case '/':
            System.out.println("Division: "+ (a/b));
            break;

            default:
            System.out.println("Invalid operation");
            break;
        }
    }
}
