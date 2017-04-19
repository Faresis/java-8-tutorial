package ua.dp.mign.java8.defaultmethods.conflicts;

public final class ExplicitResolution {
    interface A {
        default void hello() {
            System.out.println("hello from a");
        }
    }

    interface B {
        default void hello() {
            System.out.println("hello from b");
        }
    }

    static class C implements A, B {
        @Override
        public void hello() {
            A.super.hello();
        }
    }

    public static void main(String[] args) {
        new C().hello();
    }
}
