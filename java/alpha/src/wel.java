import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.util.ArrayList;

public class wel {
    public static void main(String[] args) {
        ArrayList<String> ar = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        Pattern p = Pattern.compile("\"([^\"]*)\"");
        Matcher m = p.matcher(line);
        while (m.find()) {
            String s = m.group(1);
            ar.add(s);
        }
        System.out.println("<" + ar.get(0) + ">" + ar.get(1) + "</" + ar.get(0) + ">");

    }
}