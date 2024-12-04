package OOP;
import java.util.*;

class OneTime {
    public static String generateOTP(int length) {
        String numbers = "0123456789";
        Random rndm_method = new Random();
        char[] otp = new char[length];
        for (int i = 0; i < length; i++) {
            otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
        }
        return new String(otp);
    }

    public static void main(String[] args) {
        int length = 6;
        String otp = generateOTP(length);
        System.out.println("Your One Time Password is: " + otp);
    }
}
// import java.util.Random;

// public static String generatorOTP(int length) {
// String numbers = "1234567890";
// Random rndm_method = new Random();
// char [] otp = new char[length];

// for (int i = 0; i< length; i++) {
// otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
// return new String (otp);
// }

// public static void main(String[] args) {
// int length = 6;
// String otp = generatorOTP(length);
// System.out.print("you one password is "+ otp);
// }

// }
// import java.util.*;

// public static String generateOTP(int length) {
// String numbers = "0123456789";
// Random rndm_method = new Random();
// char[] otp = new char[length];
// for (int i = 0; i < length; i++) {
// otp[i] = numbers.charAt(rndm_method.nextInt(numbers.length()));
// }

// return new String(otp);
// }
