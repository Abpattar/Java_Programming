import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks of students: ");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += marks[i];
        }
        double avg = sum / n;
        System.out.println("Average marks of students: " + avg);
        sc.close();
    }
}