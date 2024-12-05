// package OOP;
import java.text.DecimalFormat;
import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Scanner sc = new Scanner(System.in);

        double phy, chem, civ, hist, math;
        double marks;

        // maths runs here
        System.out.println("write marks for  mathematics:");
        math = sc.nextDouble();
        double gpa_math;

        if (math >= 75) {
            System.out.println("A");
            gpa_math = 5;
        } else if (math >= 65) {
            System.out.println("B+");
            gpa_math = 4.5;
        } else if (math >= 60) {
            System.out.println("B");
            gpa_math = 4;
        } else if (math >= 50) {
            System.out.println("C");
            gpa_math = 3;
        } else if (math >= 40) {
            System.out.println("D");
            gpa_math = 2;
        } else {
            System.out.println("F");
            gpa_math = 1;
        }

        // hist runs here
        System.out.println("write history marks:");
        hist = sc.nextDouble();
        double gpa_history;

        if (hist >= 75) {
            System.out.println("A");
            gpa_history = 5;
        } else if (hist >= 65) {
            System.out.println("B+");
            gpa_history = 4.5;
        } else if (hist >= 60) {
            System.out.println("B");
            gpa_history = 4;
        } else if (hist >= 50) {
            System.out.println("C");
            gpa_history = 3;
        } else if (hist >= 2) {
            System.out.println("D");
            gpa_history = 2;
        } else {
            System.out.println("F");
            gpa_history = 1;
        }

        // civ runs here
        System.out.println("write civ marks:");
        civ = sc.nextDouble();
        double gpa_civics;

        if (civ >= 75) {
            System.out.println("A");
            gpa_civics = 5;
        } else if (civ >= 65) {
            System.out.println("B+");
            gpa_civics = 4.5;
        } else if (civ >= 60) {
            System.out.println("B");
            gpa_civics = 4;
        } else if (civ >= 50) {
            System.out.println("C");
            gpa_civics = 3;
        } else if (civ >= 40) {
            System.out.println("D");
            gpa_civics = 2;
        } else {
            System.out.println("F");
            gpa_civics = 1;
        }

        // physics runs here
        System.out.println("write physics marks:");
        phy = sc.nextDouble();
        double gpa_physics;

        if (phy >= 75) {
            System.out.println("A");
            gpa_physics = 5;
        } else if (phy >= 65) {
            System.out.println("B+");
            gpa_physics = 4.5;
        } else if (phy >= 60) {
            System.out.println("B");
            gpa_physics = 4;
        } else if (phy >= 50) {
            System.out.println("C");
            gpa_physics = 3;
        } else if (phy >= 40) {
            System.out.println("D");
            gpa_physics = 2;
        } else {
            System.out.println("F");
            gpa_physics = 1;
        }

        // chemistry overline
        System.out.println("write chemistry marks:");
        chem = sc.nextDouble();
        double gpa_chemistry;

        if (chem >= 75) {
            System.out.println("A");
            gpa_chemistry = 5;
        } else if (chem >= 65) {
            System.out.println("B+");
            gpa_chemistry = 4.5;
        } else if (chem >= 60) {
            System.out.println("B");
            gpa_chemistry = 4;
        } else if (chem >= 50) {
            System.out.println("C");
            gpa_chemistry = 3;
        } else if (chem >= 40) {
            System.out.println("D");
            gpa_chemistry = 2;
        } else {
            System.out.println("F");
            gpa_chemistry = 1;
        }

        // formula for GPA and overall grade running here
        marks = ((gpa_chemistry * 3) + (gpa_civics * 3) + (gpa_history * 4) + (gpa_math * 4) + (gpa_physics * 4)) / 18;

        marks = Double.valueOf(df.format(marks));
        System.out.println("GPA " + marks);

        // System.out.println("GPA " + df.format(marks));

        // condition to display GPA runs here
        if (marks >= 4.5) {
            System.out.println("status: First class");
        } else if (marks >= 4) {
            System.out.println("status: Upper class");
        } else if (marks >= 3) {
            System.out.println("status: Upper second class");
        } else if (marks >= 2) {
            System.out.println("status: Normal class");
        } else {
            System.out.println("status: Discontinue");
        }
        sc.close();
        df.clone();
    }
}