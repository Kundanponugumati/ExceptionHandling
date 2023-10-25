import java.util.Scanner;

// Ducking the exception.
class alpha2 {
    public void alpha() throws ArithmeticException {
        System.out.println("Connection Established");
        System.out.println("please Enter Numerator");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("please Enter Denominator");
        int num2 = sc.nextInt();
        int res = num1 / num2;
        System.out.println("The Result is " + res);
        System.out.println("Connection Terminated");
    }
}

public class launcheh6 {
    public static void main(String[] args) {
        try {
            System.out.println("main method established");
            alpha2 a = new alpha2();
            a.alpha();
        } catch (ArithmeticException e) {
            System.out.println("Exception getting handled in main method");
        }
        System.out.println("main method connection terminated");
    }

}

