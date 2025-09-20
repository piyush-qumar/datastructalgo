package Basic_String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class IsomorphicSol {
    public boolean solution(String a, String b) {
        if(a.length() != b.length() ) {
            return false;
        }
        Map<Character,Character> mpst = new HashMap<>();
        HashMap<Character,Character> mpts = new HashMap<>();
        int l = a.length();
        for(int i=0; i<l;i++) {
            char x = a.charAt(i);
            char y = b.charAt(i);
            if(mpst.containsKey(x) && mpst.get(x)!=y) {
                return false;
            }
            if(mpts.containsKey(y) && mpts.get(y)!=x) {
                return false;
            }
            mpst.put(x,y);
            mpts.put(y,x);

        }
        return true;
    }
}

public class Isomorphic {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a = sc.next();
        String b= sc.next();
        IsomorphicSol sol  = new IsomorphicSol();
        System.out.println(sol.solution(a,b));
    }
}
