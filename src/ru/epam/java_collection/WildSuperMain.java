package ru.epam.java_collection;

import java.util.ArrayList;
import java.util.List;

public class WildSuperMain {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student());
        //listStudent.sort(new PersonNameComparator());
        listStudent.sort((o1, o2) -> o1.getName().compareTo(o1.getName()));
//        action(listStudent);
//        List <Person> personList = new ArrayList<>();
//        personList.add(new Student());
//        action(personList);
    }

    static void action(List<? super Student> list) {
        list.remove(0);
        list.add(new Student());
    }
}
