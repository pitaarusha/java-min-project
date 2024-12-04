package OOP;
public class Main {

    // methods to display the speed limit exceed 
    public void myPublicMethod() {
        System.out.println("the car is going beyond the speed");
    }

    // method for the speed and the parameters
    public void speed(int max_speed) {
        System.out.print("Max speed is : " + max_speed);
    }


    public static void main(String[] args) {    
        Main myCar = new Main();
        myCar.myPublicMethod();
        myCar.speed(45);
    }
}