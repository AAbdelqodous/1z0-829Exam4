package q47;

public class Test {
    public static void main(String[] args) {
        Counter [] arr = new Counter[2]; //Line n2
        // one dimensional array of 2 elements of Counter type and both the elements are initialized to null.
        // Line n2 compiles successfully.
        for(Counter ctr : arr) {
            System.out.print(ctr.count); //Line n3
            // Though correct way to refer static variable is by using the type name, such as Counter.count
            // but it can also be invoked by using reference variable of Counter type.
            // Hence ctr.count at Line n3 correctly points to the count variable at Line n1.

            // For invoking static fields, object is not needed,
            // therefore even if 'ctr' refers to null, ctr.count doesn't throw NullPointerException.
            // Given loop executes twice and therefore output is: 1010
        }
    }
}
