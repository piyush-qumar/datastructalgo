package Basic_String;

import java.util.Scanner;
class RotateStringSol {
    public Boolean solution(String a, String goal) {
        if(a.length()!=goal.length())
            return false;
        String doub = a+a;
        if(doub.contains(goal))
            return true;
        return false;
    }
}

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String goal = sc.next();
        RotateStringSol sol = new RotateStringSol();
        System.out.println(sol.solution(s, goal));
    }
}
