package Arrays.LogicBuilding;

import java.util.Arrays;
import java.util.Scanner;

class MoveZeroesSol {
    public int[] solution(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++) {
            if(nums[i]!=0) {
                swap(nums, i, j);
                j++;
            }
        }
        return nums;
    }
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        MoveZeroesSol sol = new MoveZeroesSol();
        int[] result = sol.solution(nums);
        System.out.println(Arrays.toString(result));
    }
}
