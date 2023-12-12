package q50;

import java.io.File;
import java.nio.file.Files;

public class Test {
    public static void main(String[] args) {
        String furniture = new String(new char[] {'S', 'o', 'f', 'a'});
//        System.out.println(furniture);
        switch (furniture) {
            default:
                System.out.println("CHAIR");
            case "Recliner":
                System.out.println("RECLINER");
            case "Sofa":
                System.out.println("SOFA");
            case "Bed":
                System.out.println("BED");
                break;
        }



    }
}
