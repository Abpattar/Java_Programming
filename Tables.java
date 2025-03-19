import java.util.*;

public class Tables {
    public static void main(String args[])

    {
        try {
            System.out.println("Enter the Number: ");
            Scanner obj = new Scanner(System.in);
            int num = obj.nextInt();
            System.out.println("Table of " + num + " is: ");
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + num * i);
            }
            obj.close();
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}
