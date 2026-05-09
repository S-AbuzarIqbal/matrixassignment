import java.util.Scanner;

public class BinaryPartA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int n = num;
        int[] bits = new int[32];
        int index = 0;

        while(n>0) {
            bits[index]=n%2;
            n=n/2;
            index++;
        }

        // printing  backwards here
        System.out.print(num + " in binary = ");
        for (int i=index-1;i>=0;i--) {
            System.out.print(bits[i]);
        }
        System.out.println();
    }
}
