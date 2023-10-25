import java.util.Scanner;

// rethrow the exception.
class alpha3 {

    public void alpha()
    {
        try
        {
            System.out.println("Connection Established");
            System.out.println("please Enter Numerator");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            System.out.println("please Enter Denominator");
            int num2 = sc.nextInt();
            int res = num1/num2;
            System.out.println("The Result is "+res);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Please Enter Non-Zero Number");
            throw e;
        }

        System.out.println("Connection Terminated");
    }
}


public class launcheh7 {
    public static void main(String[] args) {
        try {
            System.out.println("main method established");
            alpha3 a = new alpha3();
            a.alpha();
//            System.out.println("hello");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Exception getting handled in main method");
        }
        System.out.println("main method connection terminated");
    }
}
