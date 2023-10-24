import java.util.Scanner;

public class launcheh1 {
    public static void main(String[] args) {
//        System.out.println("Connection Established");
//        System.out.println("please Enter Numerator");
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        System.out.println("please Enter Denominator");
//        int num2 = sc.nextInt();
//        int res = num1/num2;
//        System.out.println("The Result is "+res);
//        System.out.println("Connection Terminated");

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
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("This can't Handle Arithmetic Exception so finally it goes to default exception handler");
        }
        catch (Exception e)
        {
            System.out.println("This parent of all Exceptions");
        }
        System.out.println("Connection Terminated");
    }
}
