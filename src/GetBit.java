import java.util.Scanner;

public class GetBit {
    public static void main(String[] args) {
        System.out.print("Enter the Number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.print("Enter the Position: ");
            int pos = sc.nextInt();
            int bitMask = 1 << pos;
            // int operation= ;
            System.out.println("After Changing the position, the bit is: " + bitMask);
            if ((bitMask & num) == 0) {
                System.out.println("This bit is 0");
            } else {
                System.out.println("This bit is non-zero");
            }
        }

    }
}