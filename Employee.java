public class Employee {
    int empid;
    String empname;
    static int empcount = 0;
    static String companyname = "Shimbala";
    Employee(int id , String n)
    {
        empid = id;
        empname = n;
        empcount++;
    }
    void display()
    {
        System.out.println(empid + " "+ empname + " "+ companyname);
    }
    static void printemployee()
    {
        System.out.println("Employee  count is " + empcount);
    }
    static void changecompanyname()
    {
        companyname = "Shimbala Tech";
    }
    public static void main(String args[])
    {
        Employee e1 = new Employee(1,"Natan");
        Employee e2 = new Employee(2,"Sam");
        Employee e3 = new Employee(3,"Sully");
        e1.display();
        e2.display();
        e3.display();
        Employee.printemployee();
        Employee.changecompanyname();
        e1.display();
        e2.display();
        e3.display();
    }
    
}
