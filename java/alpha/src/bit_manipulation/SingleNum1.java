package bit_manipulation;

import java.util.Scanner;
class SingleNum1Sol{
    public int solution(int[] n) {
        int s = n.length;
        int res = 0;
        for(int i=0;i<s;i++) {
            res = res ^ n[i];
        }
        return res;
    }
}

public class SingleNum1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        SingleNum1Sol sol = new SingleNum1Sol();
        System.out.println(sol.solution(arr));

    }
}
