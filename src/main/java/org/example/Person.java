package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = 0;
    protected String build = null;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String bild) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.build = bild;
    }

    public boolean hasAge() {
        if (age > 0) return true;
        else return false;
    }

    public boolean hasAddress() {
        if (build != null) return true;
        else return false;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    //Optional нужно добавить
    public OptionalInt getAge() {
        OptionalInt newInt = OptionalInt.of(age);
        return newInt;
    }

    //Optional нужно добавить
    public String getAddress() {
        return build;
    }

    public void setAddress(String address) {
        build = address;
    }

    public void happyBirthday() {
        age++;
    }

    @Override
    public String toString() {
        String returnTo = surname
                + " "
                + name;
        return returnTo;
    }

    @Override
    public int hashCode() {
        // тут нужно подумать
        return 1;
    }

    public PersonBuilder newChildBuilder() {
        // вернуть билдер
        PersonBuilder personBuilder = new PersonBuilder()
                .setSurname(this.surname)
                .setAge(0)
                .setAddress(this.build);
        return personBuilder;
    }

}
