import java.util.Scanner;
public class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age and height of Amar: ");
        int age1 = sc.nextInt();
        int height1 = sc.nextInt();
        System.out.print("Enter age and height of Akbar: ");
        int age2 = sc.nextInt();
        int height2 = sc.nextInt();
        System.out.print("Enter age and height of Anthony: ");
        int age3 = sc.nextInt();
        int height3 = sc.nextInt();
        int youngest = Math.min(age1, Math.min(age2, age3));
        int tallest = Math.max(height1, Math.max(height2, height3));
        System.out.println("Youngest friend is " + youngest);
        System.out.println("Tallest friend is " + tallest);
        sc.close();
    }
}
