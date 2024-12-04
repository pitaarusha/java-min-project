
// program to calculate GPA in java
import java.util.Scanner;

public class doi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        System.out.println("Enter the number of courses: ");
        int n = input.nextInt();
        

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the grade of course " + (i + 1) + ":");
            double grade = input.nextDouble();
            sum += grade;
        }
        double gpa = sum / n;
        System.out.println("Your GPA is: " + gpa);

        input.close();
    }
}
