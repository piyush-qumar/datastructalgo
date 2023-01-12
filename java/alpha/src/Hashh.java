
//import java.util.*;
import java.util.HashMap;
import java.util.Scanner;

public class Hashh {
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        HashMap<String, HashMap<String, String>> hm = new HashMap<String, HashMap<String, String>>();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        System.out.println("Enter the number of employees");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the company name");
            String cname = sc.next();
            System.out.println("Enter the employee name");
            String name = sc.next();
            System.out.println("Enter the employee id");
            String id = sc.next();
            hm1.put("Employee Name", name);
            hm1.put("Employee Id", id);
            hm.put(cname, hm1);
        }
        // System.out.println(hm1);
        System.out.println(hm);
        sc.close();
    }
}
