
//import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hashh {
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();
        HashMap<String, HashMap<String, String>> hm = new HashMap<String, HashMap<String, String>>();
        HashMap<String, String> hm1 = new HashMap<String, String>();
        System.out.println("Enter the number of employees");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the employee");
            String name = sc.next();
            System.out.println("enter the id");
            String id = sc.next();
            str.add(name);
            System.out.println(str);
            hm1.put(str.get(i), id);
        }

        System.out.println(hm1);

        System.out.println("Enter the company name");
        String cname = sc.next();
        hm.put(cname, hm1);
        System.out.println(hm);
        sc.close();
    }
}
