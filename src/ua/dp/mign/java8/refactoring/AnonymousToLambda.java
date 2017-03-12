package ua.dp.mign.java8.refactoring;

public final class AnonymousToLambda {
    public static void main(String[] args) {
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("some message");
            }
        };

        Runnable lambda = () -> System.out.println("some message");
    }
}
