
// package OOP;
/*mathematics credit 4
 * physics credit 4
 * chemistry credit 4
 * civic credit 3
 * history credit 3
 * total credit 18
 * 
 * math_grade
 * phy_grade
 * civ_grade
 * hist_grade
 * chem_grade
 *  
 * A = 100 or 70
 * B+ = 69 or 65
 * B = 64 or 60
 * C = 59 or 40
 * F = 39 or 0
 */
import java.util.Scanner;

public class Gpa_correction {
    public static void main(String[] args) {

        // condition for mathematics running
        Scanner sc = new Scanner(System.in);
        double mathematics, math_grade=0;
        System.out.println("enter the mathematics marks \n");
        mathematics = sc.nextDouble();
        if (mathematics < 0 && mathematics > 100) {
            System.out.println("wrong marks");
        } else if (mathematics >= 70) {
            System.out.println("A");
            math_grade = 5;
        } else if (mathematics >= 65) {
            System.out.println("B+");
            math_grade = 4;
        } else if (mathematics >= 60) {
            System.out.println("B");
            math_grade = 3;
        } else if (mathematics >= 40) {
            System.out.println("C");
            math_grade = 2;
        } else if (mathematics >= 0) {
            System.out.println("F");
            math_grade = 1;
        } else {
            System.out.print("error");
        }
        //physics runs here
        double physics, phy_grade=0;
        System.out.println("enter the physics marks \n");
        physics = sc.nextDouble();
        if (physics < 0 && physics > 100) {
            System.out.println("wrong marks");
        } else if (physics >= 70) {
            System.out.println("A");
            phy_grade = 5;
        } else if (physics >= 65) {
            System.out.println("B+");
            phy_grade = 4;
        } else if (physics >= 60) {
            System.out.println("B");
            phy_grade = 3;
        } else if (physics >= 40) {
            System.out.println("C");
            phy_grade = 2;
        } else if (physics >= 0) {
            System.out.println("F");
            phy_grade = 1;
        } else {
            System.out.print("error");
        }

        //chemistry runs here
        double chemistry, chem_grade=0;
        System.out.println("enter the chemistry marks \n");
        chemistry = sc.nextDouble();
        if (chemistry < 0 && chemistry > 100) {
            System.out.println("wrong marks");
        } else if (chemistry >= 70) {
            System.out.println("A");
            chem_grade = 5;
        } else if (chemistry >= 65) {
            System.out.println("B+");
            chem_grade = 4;
        } else if (chemistry >= 60) {
            System.out.println("B");
            chem_grade = 3;
        } else if (chemistry >= 40) {
            System.out.println("C");
            chem_grade = 2;
        } else if (chemistry >= 0) {
            System.out.println("F");
            chem_grade = 1;
        } else {
            System.out.print("error");
        }

        //civics runs here 
        double civics, civ_grade=0;
        System.out.println("enter the civics marks \n");
        civics = sc.nextDouble();
        if (civics < 0 && civics > 100) {
            System.out.println("wrong marks");
        } else if (civics >= 70) {
            System.out.println("A");
            civ_grade = 5;
        } else if (civics >= 65) {
            System.out.println("B+");
            civ_grade = 4;
        } else if (civics >= 60) {
            System.out.println("B");
            civ_grade = 3;
        } else if (civics >= 40) {
            System.out.println("C");
            civ_grade = 2;
        } else if (civics >= 0) {
            System.out.println("F");
            civ_grade = 1;
        } else {
            System.out.print("error");
        }

        //history runs here
        double history, hist_grade=0;
        System.out.println("enter the history marks \n");
        history = sc.nextDouble();
        if (history < 0 && history > 100) {
            System.out.println("wrong marks");
        } else if (history >= 70) {
            System.out.println("A");
            hist_grade = 5;
        } else if (history >= 65) {
            System.out.println("B+");
            hist_grade = 4;
        } else if (history >= 60) {
            System.out.println("B");
            hist_grade = 3;
        } else if (history >= 40) {
            System.out.println("C");
            hist_grade = 2;
        } else if (history >= 0) {
            System.out.println("F");
            hist_grade = 1;
        } else {
            System.out.print("error");
        }

        double gpa;
        double credit01 = 3;
        double credit02 = 4;

        // * math_grade
        // * phy_grade
        // * civ_grade
        // * hist_grade
        // * chem_grade
        
        // gpa formula runs here
        gpa = ((math_grade*credit01) + (phy_grade*credit01)+ (civ_grade*credit02)+ (hist_grade*credit02)+ (chem_grade*credit01))/18;
        System.out.println("Your GPA is "+ gpa);

        // condition for the gpa to runs
        if (gpa>= 4.5) {
            System.out.println("Status: First class");
        }
        else if (gpa >= 4) {
            System.out.println("Status: Upper class");
        }
        else if (gpa>=3) {
            System.out.println("Status: Upper second class");
        }
        else if (gpa>=2) {
            System.out.println("Status: Normal class");
        }
        else
        System.out.println("Status: Discontinues");


        sc.close();
    }
}