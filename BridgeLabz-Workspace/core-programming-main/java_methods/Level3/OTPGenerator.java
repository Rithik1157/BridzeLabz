// Program to generate unique 6-digit OTPs.
import java.util.HashSet;
import java.util.Random;
public class OTPGenerator {
    public static String generateOTP() {
        Random random = new Random();
        return String.format("%06d", random.nextInt(1000000));
    }
    public static boolean areOTPsUnique(String[] otps) {
        HashSet<String> set = new HashSet<>();
        for (String otp : otps) if (!set.add(otp)) return false;
        return true;
    }
    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("Generated OTPs: " + java.util.Arrays.toString(otps));
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otps));
    }
}
