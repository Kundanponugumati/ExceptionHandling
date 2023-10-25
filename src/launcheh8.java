import java.util.Scanner;

// rethrow the exception and using finally keyword
class alpha4 {

    public void alpha() throws ArithmeticException
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
//        catch (NegativeArraySizeException e)
//        {
//            System.out.println("Please Enter Non-Zero Number");
//            throw e;
//        }
        finally {
        System.out.println("Connection Terminated");
        // finally block gets executed even though we won't handle exception.
            // so we can write try,catch,finally or try,finally but we can't write only finally.
        }
    }
}


public class launcheh8 {
    public static void main(String[] args) {
        try {
            System.out.println("main method established");
            alpha4 a = new alpha4();
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
