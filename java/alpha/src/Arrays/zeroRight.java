package Arrays;

import java.util.Arrays;
import java.util.Scanner;
class zeroRightSol {
    public int[] solution(int[] arr,int n) {
        int j=0;
        for(int i = 0;i<n;i++) {
            if(arr[i]!=0) {
                int x = arr[i];
                arr[i] = arr[j];
                arr[j] = x;
                j++;
            }
        }
        return arr;
    }
}

public class zeroRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        zeroRightSol sol = new zeroRightSol();
        System.out.println(Arrays.toString(sol.solution(nums,n)));

    }
}
