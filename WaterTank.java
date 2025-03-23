import java.util.*;

public class WaterTank {
    static int iwater = 1500;
    
    static void WaterUsed(String bck , int amt)
    {
        System.out.println("Block : "+bck +" Water Used : "+amt +" Litres");
        iwater = iwater - amt;
        System.out.println("Water Remaining : "+iwater);

        if(iwater <= 100)
        {
            System.out.println("Low Water Level !!.. Call the Facility Manager to refill the tank");
            Waterrefill();
        }
    }
    static void Waterrefill()
    {
        System.out.println("Water Refilled !!");
        iwater = 1500 + iwater;
        System.out.println("Water Level : "+iwater);
    }
    public static void main(String[] args)
    {
        try{
            System.out.println("Enter the Block Name : ");
            Scanner obj = new Scanner(System.in);
            String block = obj.nextLine();
            System.out.println("Enter the Water Used : ");
            int amt = obj.nextInt();
            WaterUsed(block,amt);
            obj.close();
        }catch(Exception e){System.out.println("Invalid Input");}
    }
    
}
