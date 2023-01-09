//import java.io.*;
import java.util.*;

public class pat {
    public static void main(String[] arg) {
        int l = 0;
        ArrayList<Character> ar = new ArrayList<Character>();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 34) {
                l++;
                ar.add(s.charAt(i));
            }
        }
        //
        System.out.println(l);
        System.out.println(ar);
        // String[] s1=s.split("\"");
        // for(int i=0;i<s1.length;i++)
        // {
        // System.out.println(s1[i]);
        // }
    }
}
