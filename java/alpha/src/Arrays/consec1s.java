package Arrays;

import java.util.Scanner;
class consec1sSol {
    public int solution(int[] nums) {
        int c = 0;
        int con = 0;
        boolean flag = false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) {
                flag = true;
                c++;
                if(c>con) {
                    con = c;
                }
            }
            else c=0;
        }
        if(!flag) return -1;
        return con;
    }
}

public class consec1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        consec1sSol sol = new consec1sSol();
        System.out.println(sol.solution(nums));

    }
}
