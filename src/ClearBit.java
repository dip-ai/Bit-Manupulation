import java.util.Scanner;;

public class ClearBit {
    public static void main(String[] args) {
        System.out.print("Enter the Number in decimel: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.print("Enter the Position: ");
            int pos = sc.nextInt();
            int bitMask = 1 << pos;
            int notofBit = (~bitMask);
            System.out.println("After clearing the bit: " + (notofBit & num));
        }
    }
}