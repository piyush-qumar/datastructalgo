package Basic_Math;

import java.util.Scanner;

class CountNum {
    public int countDigit(int x) {
        String q = Integer.toString(x);
        return q.length();
    }

}

public class CountNumber {
    public static void main(String ars[]) {
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
        CountNum sol = new CountNum();
        int res = sol.countDigit(n);
        System.out.println(res);
    }

}



