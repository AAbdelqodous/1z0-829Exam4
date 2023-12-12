package q53;

public class Test {
    public static void main(String[] args) {
        int a = 2;
        int b = ~a;
        System.out.println(a);
        System.out.println(b);
        int c = a^b;
        System.out.println(c);
        boolean d = a < b & a > c++;
        System.out.println(d + " " + c);
        boolean e = a > b && a > c++;
        System.out.println(e + " " + c);
    }
}
