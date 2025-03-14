import java.util.*;

public class Volume {
    public static void main(String[] args)
    {
        try{
        double l , h , v ,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the lenght of room: ");
        l = obj.nextDouble();
        System.out.println("Enter the Breadth of the room : ");
        b = obj.nextDouble();
        System.out.println("Enter the Height of the room : ");
        h = obj.nextDouble();
        v =  l * b * h;
        System.out.println("Volume of the Room is : "+v);
        obj.close();
        }catch(Exception e){ System.out.println("Invalid Input"); }
    }
}
