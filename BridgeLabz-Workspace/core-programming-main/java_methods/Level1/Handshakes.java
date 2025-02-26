// Program to calculate maximum handshakes among N students.
import java.util.Scanner;
public class Handshakes {
    public static int calculateHandshakes(int students) {
        return (students * (students - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.println("Maximum handshakes: " + calculateHandshakes(students));
        sc.close();
    }
}
