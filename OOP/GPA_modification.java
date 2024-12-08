import java.util.Scanner;;

public class GPA_modification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subject;

        double[] marks = new double[subject];
        System.out.println("how many subject you need: ");
        subject  = sc.nextInt();
        
        for (int i = 0; i < subject; i++) {
            marks[i]  = sc.nextDouble();
        }
        System.out.println("Marks entered: ");

        for (double mark : marks) {
            System.out.println(mark);
        }

    }
}
/*
 * iimport java.util.Scanner;
 * 
 * 
 * System.out.println("How many subjects do you need: ");
 * subject = sc.nextInt();
 * 
 * // Create an array to hold the marks
 * double[] marks = new double[subject];
 * 
 * // Loop to read marks for each subject
 * for (int i = 0; i < subject; i++) {
 * System.out.println("Enter marks for subject " + (i + 1) + ": ");
 * marks[i] = sc.nextDouble(); // Store each mark in the array
 * }
 * 
 * // Print the marks
 * System.out.println("Marks entered: ");
 * for (double mark : marks) {
 * System.out.println(mark);
 * }
 * 
 * sc.close(); // Close the scanner
 * }
 * }
 */