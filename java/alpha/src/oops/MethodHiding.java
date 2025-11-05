package oops;

public class MethodHiding {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent d = new Child();
        Child c = new Child();
        p.display();
        c.display();
        d.display();
        Child.dispaly();
    }
}
