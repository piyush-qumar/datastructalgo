package Basic_Math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class GCDSol {
    public int solution(int x, int y) {
        List<Integer> res1 = findFac(x);
        List<Integer> res2 = findFac(y);
        int res = 0;
        for(int i: res2) {
            if(res1.contains(i)) {
                res = Math.max(res,i);
            }
        }
        return res;
    }

    private List<Integer> findFac(int x) {
        List<Integer> res = new ArrayList<>();
        int i = 1;
        while (i <= x) {
            if (x % i == 0)
                res.add(i);
            i++;
        }
        return res;
    }
}
public class GCD {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    GCDSol sol = new GCDSol();
    System.out.println(sol.solution(x,y));

}
}
