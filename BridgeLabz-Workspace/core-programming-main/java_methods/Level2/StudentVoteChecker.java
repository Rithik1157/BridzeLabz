// Program to check if students can vote based on age.
import java.util.Scanner;
public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
            System.out.println("Student " + (i + 1) + (canStudentVote(ages[i]) ? " can vote." : " cannot vote."));
        }
        sc.close();
    }
}
