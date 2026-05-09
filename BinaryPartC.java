import java.util.Scanner;

public class BinaryPartC {
    public static String toBinaryString(int input) {
        int num = input;
        int[] bits = new int[32];
        int count = 0;

        while(num>0) {
            bits[count] = num%2;
            num = num/2;
            count++;
        }

        String result = "";
        for(int i=count-1; i>=0; i--) {
            result = result + bits[i];
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String binary = toBinaryString(num);

        System.out.println(num + " in binary = " + binary);
    }
}