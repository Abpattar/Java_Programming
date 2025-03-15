import java.util.*;

public class Grading {
    public static  void main (String args[])
    {
        try{
            System.out.println("Enter the Marks (0 to 100): ");
            Scanner obj = new Scanner(System.in);
            int marks = obj.nextInt();
            char grade;
            if (marks >= 85) {grade = 'A';}
            else if (marks >= 70 && marks < 85) {grade = 'B';}
            else if (marks >= 55 && marks < 70) {grade = 'C';}
            else if (marks >= 35 && marks < 55) {grade = 'D';}
            else if (marks >= 25 && marks < 35) {grade = 'E';} 
            else if (marks >= 0 && marks < 50) {grade = 'F';} 
            else {grade = 'I';}
            switch (grade) {
                case 'A': System.out.println("Grade : A"); break;
                case 'B': System.out.println("Grade : B"); break;
                case 'C': System.out.println("Grade : C"); break;
                case 'D': System.out.println("Grade : D"); break;
                case 'E': System.out.println("Grade : E"); break;
                case 'F': System.out.println("Grade : F"); break;
                case 'I': System.out.println("Invalid Marks"); break;
            }
            obj.close();
        }catch(Exception e){ System.out.println("Invalid Input"); }
    }
}
