import java.util.Scanner;

// propagation of exception object down the  hierarchy of the stack.
class alpha1 {
    public void alpha()
    {
        System.out.println("Connection Established");
        System.out.println("please Enter Numerator");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("please Enter Denominator");
        int num2 = sc.nextInt();
        int res = num1/num2;
        System.out.println("The Result is "+res);
        System.out.println("Connection Terminated");
    }

    public void compute()
    {
        try
        {
            System.out.println("compute method connection established");
        alpha();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception getting handled in compute method");
        }
        System.out.println("compute method connection terminated");
    }
}


public class launcheh5 {
    public static void main(String[] args) {
        try {
            System.out.println("main method established");
            alpha1 a = new alpha1();
            a.compute();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception getting handled in main method");
        }
        System.out.println("main method connection terminated");
    }
}
