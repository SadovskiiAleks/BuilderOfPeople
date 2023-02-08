package org.example;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = 0;
    protected String build = null;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        // проверка на указанный возраст IllegalArgumentException
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        // проверка на указанный возраст IllegalArgumentException
        if (age < 0) {
            throw new IllegalArgumentException("arguments of setAge() are less 0");
        } else {
            this.age = age;
        }
        return this;
    }

    public PersonBuilder setAddress(String address) {
        // проверка на указанный возраст IllegalArgumentException
        this.build = build;
        return this;
    }


    public Person build() {
        // проверка наличия указанных данных IllegalStateException
        if (name == null) {
            throw new IllegalStateException("arguments of name are null");
        }
        if (surname == null) {
            throw new IllegalStateException("arguments of surname are null");
        }
        if (age != 0 && build != null) {
            Person person = new Person(name, surname, age, build);
            return person;
        }
        if (age != 0) {
            Person person = new Person(name, surname, age);
            return person;
        } else {
            Person person = new Person(name, surname);
            return person;
        }
    }
}
