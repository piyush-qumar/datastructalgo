package Basic_Hashing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class FrequencyVarSolution {
    public void solution(List<Character> s) {
        int l = 0;
        int h = s.size() - 1;
    while(l<h) {
        char ch = s.get(l);
        s.set(l, s.get(h));
        s.set(h, ch);
        l++;
        h--;
    }
    }
}

public class FrequencyVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        char[] chArr = ch.toCharArray();
        List<Character> chList = new ArrayList<>();
        for(char c : chArr) {
            chList.add(c);
        }
        FrequencyVarSolution sol = new FrequencyVarSolution();
        sol.solution(chList);
        for (char c : chList) {
            System.out.print(c);
        }
        System.out.println();
    }
}
