import java.util.*;
public class Id
{
    public static void main(String[] args)
    {
    try{
    String n , g , c , s ;
    long ph , pi ;
    int a;
    Scanner obj = new Scanner (System.in);
    Scanner obj1 = new Scanner (System.in);
    System.out.println("Enter your Name : ");
    n = obj.nextLine();
    System.out.println("Enter your Age :");
    a = obj1.nextInt();
    System.out.println("Enter your Gender :");
    g = obj.nextLine();
    System.out.println("Enter your State :");
    s = obj.nextLine();
    System.out.println("Enter your City :");
    c = obj.nextLine();
    System.out.println("Enter your Phone Number :");
    ph = obj1.nextLong();    
    System.out.println("Enter your Pincode :");
    pi = obj1.nextLong();

    System.out.println("\n\n ");
    System.out.println("Your Details are : ");
    System.out.println("\n ");
    System.out.println("Name : "+n);
    System.out.println("Age : "+a);
    System.out.println("Gender : "+g);
    System.out.println("State : "+s);
    System.out.println("City : "+c);
    System.out.println("Pincode : "+pi);
    System.out.println("Phone Number : "+ph);
    obj.close();
    obj1.close();
    }catch(Exception e){ System.out.println("Invalid Input"); }
}
}