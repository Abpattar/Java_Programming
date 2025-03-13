import java.util.*;

public class Prime
{
    public static void main(String[] args)
    {
try{
    int n , p = 0;
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter a Number :")
    n = obj.nextInt();
    for(int i = 2 ;i<=(n+1)/2; i++)
    {
        if(n%i==0)
        {
            p++;
        }
    }
    if(p==0)
    {
        System.out.println("Prime Number ");
    }
    else
    {
        System.out.println("Not a Prime Number");
    }
    obj.close();
}catch(Exception e){ System.out.println("Invalid Input"); }
}
}

