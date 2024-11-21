import java.util.Scanner;
public class Program_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        float celsius = sc.nextFloat();

        float fahrenheit = celsius * 9/5 + 32;
        System.out.println("The value of temperature in Fahrenheit is : " + fahrenheit);
    }
}
