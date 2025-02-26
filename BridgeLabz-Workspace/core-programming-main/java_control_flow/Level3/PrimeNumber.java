import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isPrime = number > 1;

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        
        System.out.println(number + " is " + (isPrime ? "a Prime Number." : "Not a Prime Number."));
        sc.close();
    }
}
