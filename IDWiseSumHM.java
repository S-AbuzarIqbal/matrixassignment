import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class IDWiseSumHM {
    public static void main(String[] args) {
        File txt = new File("C:\\Users\\DELL\\Downloads\\gitrepo\\git repos\\src\\SalesEVESession.txt");
        Scanner inp;
        String l;
        HashMap<String, Double> hm = new HashMap<>();

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

                if (hm.containsKey(repID)) {
                    amount += hm.get(repID);
                }
                hm.put(repID, amount);
            }
        } catch (Exception e) {
            System.out.println("\n---------------");
        } finally {
            System.out.println("\nRep ID-wise Sales Total(using a hashmap)");
            for (Map.Entry<String, Double> me : hm.entrySet()) {
                System.out.println(me.getKey() + " --- " + me.getValue());
            }
        }
    }
}
