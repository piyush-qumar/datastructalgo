//public class Oopstest {
//}
class SuperClass {
    public void display() {
        System.out.println("SuperClass display method is called");
    }
}
class SubClass extends SuperClass {
    public void display() {
        System.out.println("SubClass display method is called");
    }
}
    public class Oopstest {
        public static void main(String[] args) {
            SuperClass obj = new SubClass();
            obj.display();
            obj.display();// This will call SuperClass's display method, d SubClass.display(); // This will call SubClass's display method
        }
    }