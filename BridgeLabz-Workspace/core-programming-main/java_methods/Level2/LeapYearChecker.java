// Program to check if a year is a leap year.
import java.util.Scanner;
public class LeapYearChecker {
    public static boolean isLeapYear(int year) {
        return year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.println(year + " is " + (isLeapYear(year) ? "a Leap Year." : "Not a Leap Year."));
        sc.close();
    }
}
