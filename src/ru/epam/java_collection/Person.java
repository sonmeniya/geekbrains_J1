package ru.epam.java_collection;

public class Person {
    private int personId;
    private String name = "";

    public Person() {
    }

    public Person(int id) {
        super();
        this.personId = id;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.personId = id;
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
