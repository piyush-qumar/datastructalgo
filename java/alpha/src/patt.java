import java.util.HashMap;
import java.util.*;
public class patt {
  public static void main(String[] args) {
    HashMap<String, String> name = new HashMap<String, String>();
    Scanner sc=new Scanner(System.in);
    ArrayList<String> ar = new ArrayList<String>();
    String line=sc.nextLine();
    ar.add(line);
    name.put("name", ar.get(0));
    System.out.println(name); 
  }
}
