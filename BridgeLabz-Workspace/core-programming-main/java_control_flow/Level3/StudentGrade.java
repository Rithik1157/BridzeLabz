import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();
        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();
        double percentage = (physics + chemistry + maths) / 3.0;
        System.out.println("Average Marks: " + percentage);
        if (percentage >= 90) System.out.println("Grade: A");
        else if (percentage >= 80) System.out.println("Grade: B");
        else if (percentage >= 70) System.out.println("Grade: C");
        else if (percentage >= 60) System.out.println("Grade: D");
        else System.out.println("Grade: F");
        sc.close();
    }
}
