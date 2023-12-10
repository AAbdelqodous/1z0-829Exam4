package q3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        StringBuilder[] array1 = { new StringBuilder("Manners"), new StringBuilder("maketh"),
                new StringBuilder("Man") };
        StringBuilder[] array2 = { new StringBuilder("Manners"), new StringBuilder("maketh"),
                new StringBuilder("man") };
        System.out.println( array1[0] == array2[0]);
        System.out.print(Arrays.mismatch(array1, array2)); // index of first mismatch
        System.out.print(Arrays.compare(array1, array2)); // returns 'M' - 'm' value, which is 77 - 109 = -32.
    }
}
