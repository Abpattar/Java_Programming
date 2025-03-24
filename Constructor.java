import java.util.*;

public class Constructor {

        String name;
        long rol;
        double cgpa;     
    Constructor()
    {
        System.out.println("This is a constructor");
        System.out.println("Enter Name , Roll Number and CGPA");

    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        rol = sc.nextLong();
        cgpa = sc.nextDouble();
        System.out.println(" ");
        sc.close();
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Roll Number : " + rol);
        System.out.println("CGPA : " + cgpa);
    }
    public static void main(String[] args)
    {
        Constructor c = new Constructor();
        c.input();
        c.display();
    }

}
