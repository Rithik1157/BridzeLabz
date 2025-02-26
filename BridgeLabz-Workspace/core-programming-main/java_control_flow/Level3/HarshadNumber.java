import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(), sum = 0, temp = number;
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(number + (number % sum == 0 ? " is a Harshad Number." : " is Not a Harshad Number."));
        sc.close();
    }
}
