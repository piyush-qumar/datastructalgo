package Basic_Math;

import java.util.Scanner;
class CountOdd {
    public int countDigit(int n) {
        int res =0;
        if(n==0) return 0;
        while(n>0) {
            int x = n%10;
            if(x%2!=0)
                res++;
            n= n/10;
        }
        return res;
    }
}

public class CountOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        CountOdd sol = new CountOdd();
        System.out.println("Odd count = "+sol.countDigit(n));
    }
}
