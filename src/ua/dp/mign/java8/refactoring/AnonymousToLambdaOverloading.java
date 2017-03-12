package ua.dp.mign.java8.refactoring;

public final class AnonymousToLambdaOverloading {
    private interface Task {
        void execute();
    }

    public static void doSomething(Task t) {
        t.execute();
    }

    public static void doSomething(Runnable r) {
        r.run();
    }

    public static void main(String[] args) {
        doSomething(new Task() {
            @Override
            public void execute() {
                System.out.println("message from anonymous");
            }
        });

        /*
         * Since both overloading have the same functional descriptor
         * this method call is ambiguous. In case with anonymous class
         * there was an explicit type definition.
         * Thus, this code won't compile.
         */
        /*
        doSomething(() -> {
            System.out.println("message from lambda");
        });
        */
        // With explicit type specification everything is Ok.
        doSomething((Task)() -> {
            System.out.println("message from lambda");
        });
    }
}
