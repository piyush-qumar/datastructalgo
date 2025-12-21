package bit_manipulation;

import java.util.*;

class SingleNum1Sol{
    public List<Integer> solution(int[] n) {
        //do it using map data structure
        Map<Integer, Integer> mp = new HashMap<>();
        int s = n.length;
        List<Integer> ls = new ArrayList<>();
        int count =0;
        for(int i=0;i<s;i++) {
            mp.put(n[i], mp.getOrDefault(n[i],0)+1);
        }

        for(int key: mp.keySet()) {
            if(mp.get(key) == 1) {
                count++;
                ls.add(key);
            }
        }
//        int[] res = new int[count];
//        int c = 0;
//        for(int key: mp.keySet()) {
//            if(mp.get(key) == 1) {
//                res[c++] = key;
//            }
//        }
        return ls;
    }
}

public class SingleNum1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        SingleNum1Sol sol = new SingleNum1Sol();
        System.out.println(sol.solution(arr));

    }
}
