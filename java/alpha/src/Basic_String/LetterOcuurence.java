package Basic_String;

import java.util.HashMap;
import java.util.Scanner;
class LetterOcuurenceSol {
    public HashMap<Character,Integer> solution(String ans) {
        HashMap<Character,Integer> res = new HashMap<>();
        char[] chrs = ans.toCharArray();
        int n = chrs.length;
        for(int i=0;i<n;i++) {
            res.put(chrs[i], res.getOrDefault(chrs[i],0)+1);
        }
        return res;
    }
}

public class LetterOcuurence {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
        LetterOcuurenceSol sol = new LetterOcuurenceSol();
        System.out.println(sol.solution(input));
    }
}
