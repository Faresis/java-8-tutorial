package ua.dp.mign.java8.refactoring;

public final class AnonymousToLambdaShadowing {
    public static void main(String[] args) {
        int a = 10;

        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                int a = 2;
                System.out.println(a);
            }
        };

        // Will not compile since lambdas can't shadow enclosing scope variables
        /*
        Runnable lambda = () -> {
            int a = 2;
            System.out.println(a);
        };
        */
    }
}
