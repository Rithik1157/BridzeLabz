package Level_1;

import java.util.Scanner;

public class DistancescConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in km: ");
        double km = sc.nextDouble();
        double miles = km / 1.6;
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km");
        sc.close();
    }
}
