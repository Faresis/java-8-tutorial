package ua.dp.mign.java8.streams.collection;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class MapDemo {
    public static void main(String[] args) {
        Stream<Employee> employees = Stream.of(new Employee("Alice"), new Employee("Bob"), new Employee("Smith"));
        List<String> names = employees.map(Employee::getName).collect(Collectors.toList());
        System.out.println(names);

        IntStream intStream = names.stream().mapToInt(String::length);
        System.out.println("Max " + intStream.max().getAsInt());
    }

    private static class Employee {
        private final String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
