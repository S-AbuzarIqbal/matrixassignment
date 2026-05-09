import java.util.Scanner;

public class BinaryPartB {
    public static int[] toBinaryArray(int input) {
        int num = input;
        int[] bits = new int[32];
        int count = 0;

        while(num > 0) {
            bits[count] = num%2;
            num = num/2;
            count++;
        }

        int[] result = new int[count];
        for(int i=0; i<count; i++) {
            result[i] = bits[count-1-i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int[] binarydigits = toBinaryArray(num);
        System.out.print(num + " in binary = ");
        for(int digit : binarydigits) {
            System.out.print(digit);
        }
        System.out.println();
    }
}