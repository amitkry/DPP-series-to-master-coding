import java.util.Scanner;

public class Program_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //the below name variable will store a string value. For storing string value we use .next() for string without any space and .nextLine() for string including space
        String name = sc.nextLine();
        System.out.println("Hello " + name + "! Welcome to Pro Developing Champs.");

    }    
}
