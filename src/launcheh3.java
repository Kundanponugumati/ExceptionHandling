import java.util.Scanner;

public class launcheh3 {
    public static void main(String[] args) {

            System.out.println("Connection Established");
            System.out.println("please Enter Numerator");
            Scanner sc = new Scanner(System.in);
            try {
                int num1 = sc.nextInt();
                System.out.println("please Enter Denominator");
                int num2 = sc.nextInt();
                int res = num1 / num2;
                System.out.println("The Result is " + res);
            }
            catch (ArithmeticException e)
            {
                System.out.println("description of getMEssage() is " + e.getMessage());
                System.out.println("Please Enter Non-Zero Number in Denominator");
            }
            try {
                System.out.println("Enter the Size of Array");
                int size = sc.nextInt();
                int[] arr = new int[size];
                System.out.println("kindly enter element to be inserted");
                int element = sc.nextInt();
                System.out.println("kindly enter which index element should be stored");
                int postion = sc.nextInt();
                arr[postion] = element;
                System.out.println("Data Entered Success fully ");
            }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Please enter position within array indexes");
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println("Array size must no be negative");
        }

        catch(Exception e)
        {
            System.out.println("This is recommend to give Generic catch block which is parent of all Exceptions. ");
        }
        System.out.println("Connection Terminated");
    }
}
