
//import java.*;
import java.util.*;
//import java.lang.*;

public class cha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        // String string=null;
        // StringBuilder string = new StringBuilder();
        // String str1;
        int i;
        // for (i = 0; i < str.length(); i++) {
        // if (str.charAt(i) == 'i') {
        // // string.setCharAt(i,'u');
        // string.append('u');
        // }
        // if (str.charAt(i) == 'u') {
        // // string.setCharAt(i,'i');
        // string.append('i');
        // } else {
        // string.append(i);
        // }
        // }
        char[] ch = new char[str.length()];
        for (i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i') {
                ch[i] = 'u';
            }
            if (str.charAt(i) == 'u') {
                ch[i] = 'i';
            } else {
                ch[i] = str.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
