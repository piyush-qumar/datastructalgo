package Sorting_Algos;

import java.util.Arrays;
import java.util.Scanner;
class SelectionSortSol {
    public int[] solution(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            int index = i;
            for(int j=i;j<nums.length;j++) {
                if(nums[j]<nums[index]) index = j;
            }
            int x = nums[i];
            nums[i] = nums[index];
            nums[index] = x;
        }
        return nums;
    }
}

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        SelectionSortSol sol = new SelectionSortSol();
        System.out.println(Arrays.toString(sol.solution(arr)));
    }
}
