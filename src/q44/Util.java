package q44;

public class Util {
    static int ctr = 0;
    private static Util obj;
    private Util() {
        ++ctr;
    }
     static synchronized Util get() { //Singleton design pattern.
        if(obj == null)
            obj = new Util();
        System.out.println(ctr);
        return obj;
    }
}
