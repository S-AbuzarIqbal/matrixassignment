import java.util.Scanner;
import java.io.File;

public class IDWiseSumNoHM {
    public static void main(String[] args) {
        File txt = new File("C:\\Users\\DELL\\Downloads\\gitrepo\\git repos\\src\\SalesEVESession.txt");
        Scanner inp;
        String l;

        // Rep IDs because not using hm
        String[] rep = {"E011","E012","E013","E014"};
        double[] totals = {0,0,0,0};

        try {
            inp = new Scanner(txt);
            l = inp.nextLine(); // to skip the header
            System.out.println(l);

            String[] parts;
            String repID;
            double qty, uprice, amount;

            while (l.length() > 0) {
                l = inp.nextLine();
                System.out.println(l);
                parts  = l.split("\t");
                uprice = Double.parseDouble(parts[2]);
                qty    = Double.parseDouble(parts[3]);
                repID  = parts[5];
                amount    = qty * uprice;

                for (int i = 0; i < rep.length; i++) {
                    if (rep[i].equals(repID)) {
                        totals[i] += amount;
                        break;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("\n---------------");
        } finally {
            System.out.println("\n Rep ID wise Sales Total ");
            for (int i = 0; i < rep.length; i++) {
                System.out.println(rep[i] + " --- " + totals[i]);
            }
        }
    }
}
