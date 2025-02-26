// Program to calculate number of rounds an athlete must complete in a triangular park.
import java.util.Scanner;
public class AthleteRounds {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three sides of the triangular park in meters: ");
        double side1 = sc.nextDouble(), side2 = sc.nextDouble(), side3 = sc.nextDouble();
        System.out.println("Athlete must complete " + calculateRounds(side1, side2, side3) + " rounds.");
        sc.close();
    }
}
