import java.util.HashMap;
import java.util.*;

public class pattt {
    public static void main(String[] args) {
        HashMap<String, String> name = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<String>();
        String line = sc.nextLine();
        String str1[] = line.split(":", 5);
        String str2[] = str1[1].split("\"", 0);
        for (String s : str2) {
            ar.add(s);
        }
        name.put("name", ar.get(0));
        System.out.println(name);
    }
}
