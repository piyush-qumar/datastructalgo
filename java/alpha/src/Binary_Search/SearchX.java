package Binary_Search;
import java.util.Scanner;
class SearchXSol {
    public int solution( int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = n;
        int index =-1;
        while(left<=right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == k) {
                index = mid;
                break;
            } else if (nums[mid] > k)
                right = mid - 1;
            else if (nums[mid] < k)
                left = mid + 1;
        }

        return index;
    }
}

public class SearchX {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++)
            nums[i] = sc.nextInt();
        SearchXSol sol = new SearchXSol();
        System.out.println(sol.solution(nums,k));
    }
}
