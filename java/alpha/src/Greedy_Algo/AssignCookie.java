package Greedy_Algo;

import java.util.Arrays;
import java.util.Scanner;
class AssignCookieSol {
    public int solution(int[] s, int[] c) {
        Arrays.sort(s);
        Arrays.sort(c);
        int l = 0;
        int h = 0;
        while(l<s.length && h<c.length) {
            if(c[h]>=s[l]) {
                l++;
            }
            h++;
        }
        return l;
    }
}
public class AssignCookie {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        int[] s =new int[x];
        int [] c = new int[y];
        for(int i = 0;i<x;i++) {
            s[i] = sc.nextInt();
        }
        for(int j = 0;j<y;j++) {
            c[j] = sc.nextInt();
        }
        AssignCookieSol sol = new AssignCookieSol();
        System.out.println(sol.solution(s, c));
    }
}
