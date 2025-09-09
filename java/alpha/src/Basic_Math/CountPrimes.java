package Basic_Math;
import java.util.*;

class CountPrime {
    public static int solution(int n) {
        boolean[] bool = new boolean[n+1];
        Arrays.fill(bool,false);
        for(int i=2;i*i<=n;i++) {
            if(!bool[i]) {
                for(int j =i*i;j<=n;j=j+i) {
                    bool[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (!bool[i]) count++;
        }

        return count;
    }
}

public class CountPrimes {
    public static void main(String[] args) {
        CountPrime sol = new CountPrime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Total count of primes = "+sol.solution(n));

    }
}
