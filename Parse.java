import java.util.*;

public class Parse{

    public static void main(String[] args)

    { 
        try{
            System.out.println("Enter Numbers (String) ");
            Scanner obj = new Scanner(System.in);
            String str = obj.nextLine();
            System.out.println("Enter the 2nd Number (String) ");
            String str2 = obj.nextLine();
            float num1 = Float.parseFloat(str);
            float num2 = Float.parseFloat(str2);

            System.out.println("Sum : "+(num1+num2));
            System.out.println("Difference : "+(num1-num2));
            System.out.println("Product : "+(num1*num2));
            System.out.println("Quotient : "+(num1/num2));
            obj.close();
        }catch(Exception e){System.out.println("Invalid Input");}
    }
}