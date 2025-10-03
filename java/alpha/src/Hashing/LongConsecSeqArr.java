package Hashing;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
class LongConsecSeqArrSol {
    public int solution(int[] nums, int k) {
        int n= nums.length;
        HashSet<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++) {
            st.add(nums[i]);
        }

        int s = st.size();
        int longest =1;
        for(int y: st) {
            if(!st.contains(y-1)) {
                int count =1;
                int a = y;
                while(st.contains(a+1)){
                    count++;
                    a++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
}

public class LongConsecSeqArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        LongConsecSeqArrSol sol = new LongConsecSeqArrSol();
        System.out.println((sol.solution(nums,n)));

    }
}
