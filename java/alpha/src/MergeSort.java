import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] mergeSort(int arr[]) {
        int n= arr.length;
        mergeSortHelper(arr, 0,n-1);
        return arr;
    }
public void mergeSortHelper(int[] arr, int low, int high) {
        if(low>=high) return;
        int mid = (low+high)/2;
        mergeSortHelper(arr, 0, mid);
        mergeSortHelper(arr, mid+1, high);
        merge(arr,low,mid,high);
}
public void merge(int[] arr, int low, int mid, int high) {
int left = low;
int right = mid+1;
List<Integer> temp = new ArrayList<Integer>();
while(left<=mid && right<=high) {
    if(arr[left]>arr[right]) {
        temp.add(arr[right]);
        right++;
    }
    else {
        temp.add(arr[left]);
        left++;
    }
}
    while(left<=mid) {
        temp.add(arr[left]);
        left++;
    }
    while(right<=high) {
        temp.add(arr[right]);
        right++;
    }
    for(int i=low;i<=high;i++) {
        arr[i] = temp.get(i-low);
    }

    }
}
public class MergeSort {
    public static void main(String[] args) {
        int []arr = {2,6,8,0,12,34};
        int n = arr.length;
        System.out.println("Before sorting:");
        for(int i = 0;i<n;i++) {
            System.out.println(arr[i]);
        }
        Solution sol = new Solution();
        int[] sortArr = sol.mergeSort(arr);
        System.out.println("After sorting:");
        for(int i = 0;i<n;i++) {
            System.out.println(sortArr[i]);     
        }
    }
}
