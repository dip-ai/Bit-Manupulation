import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Eneter the operation between 1 and 0: ");
            int choose = sc.nextInt();
            System.out.print("Enter the Number in decimel: ");
            int num = sc.nextInt();
            System.out.print("Enter the Position: ");
            int pos = sc.nextInt();
            int bitMask = 1 << pos;
            if (choose == 0) {
                System.out.println("After updating the bit: " + (~bitMask & num));
            } else {
                System.out.println("After updating the bit: " + (bitMask | num));
            }

        }
    }
}