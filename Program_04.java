import java.util.Scanner;
public class Program_04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your english marks out of 100:");
        float english = s.nextFloat();
        System.out.println("Enter your hindi marks out of 100:");
        float hindi = s.nextFloat();
        System.out.println("Enter your maths marks out of 100:");
        float maths = s.nextFloat();
        System.out.println("Enter your science marks out of 100:");
        float science = s.nextFloat();
        System.out.println("Enter your sst marks out of 100:");
        float sst = s.nextFloat();

        float sum = english + hindi + maths + science + sst;
        System.out.println("The sum of the 5 subjects are: " +sum );

        float average = sum/5;
        System.out.println("The average of the 5 subjects are: "+average);

        float percentage = (sum/500)*100;
        System.out.println("The percentage of the 5 subjects are: "+percentage +"%");

    }
}
