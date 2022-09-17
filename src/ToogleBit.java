import java.util.Scanner;

public class ToogleBit {
    public static void main(String[] args) {
        System.out.print("Enter the Number in decimel: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.print("Enter the Position: ");
            int pos = sc.nextInt();
            int bitMask = 1 << pos;
            System.out.println("After toogling the bit: " + (bitMask ^ num));
        }
    }
}