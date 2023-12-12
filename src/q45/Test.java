package q45;

import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {
        var file1 = Paths.get("F:\\A\\B");
        var file2 = Paths.get("F:\\A\\B\\C\\Book.java");
        System.out.println(file1.resolve(file2).equals(file1.resolveSibling(file2)));
    }
}
