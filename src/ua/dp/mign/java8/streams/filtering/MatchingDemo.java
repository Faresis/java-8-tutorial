package ua.dp.mign.java8.streams.filtering;

import java.util.Optional;
import java.util.stream.Stream;

public final class MatchingDemo {
    public static void findFirst() {
        Stream<Employee> employees = Stream.of(new Employee("Jack"), new Employee("Jill"), new Employee("Jiane"));
        Optional<Employee> emp = employees.filter(e -> e.getName().contains("i")).findFirst();
        System.out.println("Find first: " + emp.get());
    }

    private static void allMatch() {
        Stream<Employee> employees = Stream.of(new Employee("Jack"), new Employee("Jill"), new Employee("Jiane"));

        System.out.println("All match: " +  employees.allMatch(e -> e.getName().startsWith("J")));
    }

    private static void noneMatch() {
        Stream<Employee> employees = Stream.of(new Employee("Jack"), new Employee("Jill"), new Employee("Jiane"));

        System.out.println("None match: " + employees.map(Employee::getName).noneMatch(n -> n.startsWith("K")));
    }

    public static void main(String[] args) {
        findFirst();
        allMatch();
        noneMatch();
    }

    private static class Employee {
        private final String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return this.name;
        }
    }
}
