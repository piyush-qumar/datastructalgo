package Basic_Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

class DivisorSol {
    public static List<Integer> solution(int n) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<=sqrt(n);i++) {
            if(n%i==0)
                ans.add(i);
            if(i!=n/i)
                ans.add(n/i);
        }
        return ans;
    }
}

public class Divisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        DivisorSol sol = new DivisorSol();
        System.out.println(DivisorSol.solution(n));
    }
}
