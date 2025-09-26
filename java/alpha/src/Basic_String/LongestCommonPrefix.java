package Basic_String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
class LongestCommonSol {
    public String solution(List<String> lst) {
        Collections.sort(lst);
        StringBuilder res = new StringBuilder();
        String x = lst.get(0);
        String y = lst.get(lst.size()-1);
        int n = Math.min(x.length(),y.length());
        for(int i =0;i<n;i++) {
            char a = x.charAt(i);
            char b = y.charAt(i);
            if(a != b)
                return res.toString();
            res.append(a);
        }
        return res.toString();
    }
}

class LongestCommonPrefix {
    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String[] lit = new String[n];
        List<String> lst = new ArrayList<>(n);
        for(int i = 0;i<n;i++) {
            String x = sc.next();
            lst.add(x);
            lit[i] = x;
        }
        LongestCommonSol sol = new LongestCommonSol();
        System.out.println(sol.solution(lst));
    }
}


