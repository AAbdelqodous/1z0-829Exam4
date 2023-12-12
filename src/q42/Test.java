package q42;

public class Test {
    public static void main(String[] args) {
        M obj1 = new M();
        N obj2 = (N) obj1;
        // subtype can't refer to an instance of super type so at runtime `N obj2 = (N)obj1;`
        // will throw ClassCastException.
        obj2.printName();
    }
}
