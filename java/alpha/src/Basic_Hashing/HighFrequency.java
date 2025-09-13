package Basic_Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
class HighFreq {
    public static int solution(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> res1 = new HashMap<>();
        for(int num : nums) {
            res1.put(num, res1.getOrDefault(num,0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>entry: res1.entrySet()) {
            int a = entry.getKey();
            int b = entry.getValue();
            if(max<b) {
                max = b;
                res = a;
            }
            else if(max == b && a<res) {
                res = a;
            }
        }
        return res;
    }
}

public class HighFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        HighFreq sol = new HighFreq();
        System.out.println(sol.solution(nums));
    }
}
