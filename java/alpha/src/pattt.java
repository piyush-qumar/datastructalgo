import java.util.HashMap;
import java.util.*;

public class pattt {
    public static void main(String[] args) {
        HashMap<String, String> name = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ar = new ArrayList<String>();
        String line = sc.nextLine();
        //sc.close(); // if ot used it gives the error of sc is never closed,, try it by removing it
        String str1[] = line.split(":", 5);
        String str2[] = str1[1].split("\"", 0);
        for (String s : str2) {
            ar.add(s);
        }
        name.put("name", ar.get(0));
        System.out.println(name);
    }
}
