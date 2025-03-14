import java.util.*;

public class ElectricBill {
    public static void main(String[] args)
    {
        try{
        double u , b , c = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Units Consumed : ");
        u = obj.nextDouble();
        if(u<=100)
        {
            c = u * 1.20;
        }
        else if(u>100 && u<=300)
        {
            c = 100 * 1.20 + (u-100) * 2;
        }
        else if(u>300 && u<=500)
        {
            c = 100 * 1.20 + 200 * 2 + (u-300) * 3;
        }
        else if(u>500)
        {
            c = 100 * 1.20 + 200 * 2 + 200 * 3 + (u-500) * 4;
        }
        b = c + c * 0.2;
        System.out.println("Electricity Bill : "+b);
        obj.close();
        }catch(Exception e){ System.out.println("Invalid Input"); }
    }
}
