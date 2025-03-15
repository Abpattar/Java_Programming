import java.util.*;

public class Calculator {
    public static void main(String args[])
    {
        try{
        double a , b , c = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        a = obj.nextDouble();
        System.out.println("Enter the Second Number : ");
        b = obj.nextDouble();
        System.out.println("Enter the Operation : ");
        char op = obj.next().charAt(0);
        switch(op)
        {
            case '+': c = a + b; break;
            case '-': c = a - b; break;
            case '*': c = a * b; break;
            case '/': c = a / b; break;
            default: System.out.println("Invalid Operation");
        }
        System.out.println("Result : "+c);
        obj.close();
        }catch(Exception e){ System.out.println("Invalid Input"); }
    }
}
