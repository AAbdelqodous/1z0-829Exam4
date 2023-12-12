package q51;

public class Test {
    static interface Animal{}
    static class Dog implements Animal{}
    private static void play(Animal a){
        System.out.println("flips");
    }
    private static void play(Dog d){
        System.out.println("runs");
    }

    public static void main(String[] args) {
        Animal a1 = new Dog();
        Dog a2 = new Dog();
        play(a1);
        play(a2);
    }
}
