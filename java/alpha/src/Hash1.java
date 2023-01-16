
//import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Hash1 {
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        // HashMap<String, ArrayList<Item>> Items = new HashMap<String,
        // ArrayList<Item>>();
        // Map<String, List<Item>> items = new HashMap<>();

        // String key="hello";
        // Item item;
        // items.computeIfAbsent(key, k -> new ArrayList<>()).add(item);
        List<Map<String, String>> str = new ArrayList<>();
        Map<String, List<Map<String, String>>> hm = new HashMap<>();
        Map<String, String> hm1 = new HashMap<String, String>();
        System.out.println("Enter the number of employees");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the employee");
            String name = sc.next();
            System.out.println("enter the id");
            String id = sc.next();
            hm1.put(name, id);

        }
        str.add(hm1);
        // str.add(hm1);
        // System.out.println(str);
        // System.out.println(hm1);

        System.out.println("Enter the company name");
        String cname = sc.next();
        hm.put(cname, str);
        System.out.println(hm);
        sc.close();
    }
}
