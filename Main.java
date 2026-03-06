import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns of square matrix: ");
        int n = sc.nextInt();

        int[][] m = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                m[i][j] = sc.nextInt();

        System.out.println("\nMatrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

        System.out.println("\nSum of rows:");
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += m[i][j];
            System.out.println("  Row " + (i + 1) + " = " + sum);
        }

        System.out.println("\nSum of columns:");
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++)
                sum += m[i][j];
            System.out.println("  Column " + (j + 1) + " = " + sum);
        }

        int forw = 0, rev = 0;
        for (int i = 0; i < n; i++) {
            forw += m[i][i];
            rev += m[i][n - 1 - i];
        }
        System.out.println("\nForward Diagonal = " + forw);
        System.out.println("\nReverse Diagonal = " + rev);

    }
}
