//This import statement tells the compiler that you need access to the scanner class which is in java.util.package
import java.util.Scanner;

public class Program_02 {
    public static void main(String[] args) {
        //The below line creates a object named 'scan' that reads input from the standard input stream (System.in)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three integer to print its sum: ");
        //The below lines will store integer value in the variable 'a', 'b', 'c'
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        int sum = a + b + c;
        System.out.print("The sum of the three number is:" +sum);
    }    
}
