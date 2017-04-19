package ua.dp.mign.java8.defaultmethods.conflicts;

public final class MostSpecificInterfaceWins {
    interface A {
        default void hello() {
            System.out.println("hello from a");
        }
    }

    interface B extends A {
        default void hello() {
            System.out.println("hello from b");
        }
    }

    static class C implements A, B {}

    public static void main(String[] args) {
        new C().hello();
    }
}
