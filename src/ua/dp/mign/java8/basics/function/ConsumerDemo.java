package ua.dp.mign.java8.basics.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public final class ConsumerDemo {
    private static final class Name {
        private String name;

        Name(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }

    private static void processNames(Iterable<Name> names, Consumer<Name> consumer) {
        names.forEach(name -> consumer.accept(name));
    }

    public static void main(String[] args) {
        List<Name> names = Arrays.asList(new Name("a"), new Name("b"), new Name("c"), new Name("d"));
        System.out.println(names);
        Consumer<Name> capitalize = n -> n.setName(n.name.toUpperCase());
        processNames(names, capitalize);
        System.out.println(names);
    }
}
