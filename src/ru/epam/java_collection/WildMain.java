package ru.epam.java_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class WildMain {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person());
        list.add(new Student());
        action(list);
        List<Student> student = new ArrayList<>();
        student.add(new Student());
        action(student);
    }

    static void action(List<? extends Person> list) {
        list.remove(0);
        //list.add(new Person());
        Stream<? extends Person> stream = list.stream();
    }
}
