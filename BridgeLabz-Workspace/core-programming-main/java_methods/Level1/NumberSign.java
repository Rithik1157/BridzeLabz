// Program to check if a number is positive, negative, or zero.
import java.util.Scanner;
public class NumberSign {
    public static int checkNumberSign(int number) {
        return (number > 0) ? 1 : (number < 0) ? -1 : 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Result: " + checkNumberSign(number));
        sc.close();
    }
}
