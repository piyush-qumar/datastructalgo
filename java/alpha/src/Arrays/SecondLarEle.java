package Arrays;

import java.util.Scanner;
class SecondLarEleSol {
    public int solution (int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int _2max = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++) {
            if(max<nums[i]) {
                _2max = max;
                max = nums[i];
            }
            if(nums[i]>_2max && nums[i]<max) {
                _2max = nums[i];
            }
        }
        if(_2max == Integer.MIN_VALUE)
            return -1;
        return _2max;
    }
}

public class SecondLarEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        SecondLarEleSol sol = new SecondLarEleSol();
        System.out.println(sol.solution(nums));

    }
}
