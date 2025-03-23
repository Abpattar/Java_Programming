public class WaterTank {
    static int iwater = 1500;
    
    static void WaterUsed(String bck , int amt)
    {
        System.out.println("Block : "+bck +" Water Used : "+amt +" Litres");
        iwater = iwater - amt;
        System.out.println(" Water Remaining : "+iwater);

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
    public stativ void main(String[] args)
    {
        
    }
    
}
