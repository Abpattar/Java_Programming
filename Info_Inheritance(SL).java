import java.util.*;

class student {
    String name;
    int rollno;

    student(String n, int r)
    {
        name = n;
        rollno = r;
    }
    void display()
    {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollno);
    }
}
class marks extends student {
    int m1, m2, m3;

    marks(String n, int r, int a, int b, int c)
    {
        super(n, r);
        m1 = a;
        m2 = b;
        m3 = c;
    }
    void display()
    {
        super.display();
        System.out.println("Marks 1 : " + m1);
        System.out.println("Marks 2 : " + m2);
        System.out.println("Marks 3 : " + m3);
    }
}
public class Info_Inheritance(SL)

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student : ");
        String n = sc.nextLine();
        System.out.println("Enter the roll number of the student : ");
        int r = sc.nextInt();
        System.out.println("Enter the marks in 3 subjects : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        marks m = new marks(n, r, a, b, c);
        m.display();
    }
    

