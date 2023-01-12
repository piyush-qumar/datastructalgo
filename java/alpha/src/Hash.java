
//import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash {
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        HashMap<String, HashMap<String, String>> hm = new HashMap<>();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        HashMap<String, String> hm2 = new HashMap<String, String>();
        System.out.println("Enter the number of employees");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // System.out.println("Enter the company name");
            // String cname = sc.next();
            System.out.println("Enter the employee name");
            String name = sc.next();
            System.out.println("Enter the employee id");
            String id = sc.next();
            hm1.put(name, id);
            // hm.put(cname, hm1.get(name));
        }
        for (Map.Entry<String, String> entry : hm1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            hm2.put(key,value);
        }
        System.out.println("Enter the company name");
        String cname = sc.next();
        // System.out.println(hm1);
        System.out.println(hm);
        sc.close();

    }
}
