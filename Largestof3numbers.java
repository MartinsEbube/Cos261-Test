// 7. Find the largest of three numbers
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int largest = a;
        if (b > largest) largest = b;
        if (c > largest) largest = c;

        System.out.println("Largest is: " + largest);
    }
}
