import java.util.Scanner;

class generator {
    public static void main(String[] args) {
        double mile = 24;
        double kilo = 1.6;
        double time2 = 40 / 60;
        double time3 = 35 / 360;
        double time1 = 1;
        double answer, tdistance, thrs;

        thrs = time2 + time3 + time1;
        tdistance = mile * kilo;
        answer = tdistance / thrs;

        System.out.println("the answer is " + answer + "km/hr");
        
    }
}
// Scanner sc = new Scanner(System.in);
// double number;

// System.out.print("enter number");
// number = sc.nextDouble();

// if (number%2==0) {
// System.out.println("it even");
// }
// else
// System.out.print("it odd");