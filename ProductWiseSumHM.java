import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ProductWiseSumHM {
    public static void main(String[] args) {
        File txt = new File("C:\\Users\\DELL\\Downloads\\gitrepo\\git repos\\src\\SalesEVESession.txt");
        Scanner inp;
        String l;
        HashMap<String, Double> hm = new HashMap<>();

        try {
            inp = new Scanner(txt);
            l = inp.nextLine(); // skip header
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

                if (hm.containsKey(pname)) {
                    amount += hm.get(pname);
                }
                hm.put(pname, amount);
            }
        } catch (Exception e) {
            System.out.println("\n---------------");
        } finally {
            System.out.println("\nProduct wise Sales Total(using hashmap)");
            for (Map.Entry<String, Double> me : hm.entrySet()) {
                System.out.println(me.getKey() + " --- " + me.getValue());
            }
        }
    }
}
