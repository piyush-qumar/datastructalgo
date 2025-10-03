package Arrays;

import java.util.Arrays;
import java.util.Scanner;
class LeftRotateSol {
    public int[] solution(int[] arr, int k) {
        int n = arr.length;
        int[] numres = new int[k];
        int[] resv = new int[n];
        int c=0;
        for(int i=0;i<k;i++) {
            numres[i] = arr[i];
        }
        for(int i=k;i<n;i++) {
            resv[c++] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            resv[c++] = numres[i];
        }
        return resv;
    }
}

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        LeftRotateSol sol = new LeftRotateSol();
        System.out.println(Arrays.toString(sol.solution(nums, k)));

    }
}
