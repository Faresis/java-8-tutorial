package ua.dp.mign.java8.defaultmethods.conflicts;

public final class MostSpecificInterfaceVsEmptyClass {
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

    static class D implements A {}

    static class C extends D implements A, B {}

    public static void main(String[] args) {
        new C().hello();
    }
}
