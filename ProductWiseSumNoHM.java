import java.util.Scanner;
import java.io.File;

public class ProductWiseSumNoHM {
    public static void main(String[] args) {
        File txt = new File("C:\\Users\\DELL\\Downloads\\gitrepo\\git repos\\src\\SalesEVESession.txt");
        Scanner inp;
        String l;

        // products because no HashMap
        String[] prod   = {"Product A","Product B","Product C","Product D"};
        double[] totals     = {0,0,0,0};

        try {
            inp = new Scanner(txt);
            l = inp.nextLine(); // to skip tge header
            System.out.println(l);

            String[] parts;
            String pname;
            double qty, uprice, amount;

            while (l.length() > 0) {
                l = inp.nextLine();
                System.out.println(l);
                parts    = l.split("\t");
                pname = parts[1];
                uprice   = Double.parseDouble(parts[2]);
                qty      = Double.parseDouble(parts[3]);
                amount      = qty * uprice;

                for (int i = 0; i < prod.length; i++) {
                    if (prod[i].equals(pname)) {
                        totals[i] += amount;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("\n---------------");
        } finally {
            System.out.println("\nProduct wise Sales Total");
            for (int i = 0; i < prod.length; i++) {
                System.out.println(prod[i] + " --- " + totals[i]);
            }
        }
    }
}
