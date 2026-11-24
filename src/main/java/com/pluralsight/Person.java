package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + ")";
    }

    // Bonus
    @Override
    public int compareTo(Person o) {
        int result = this.lastName.compareTo(o.lastName);

        if (result == 0) {
            result = this.firstName.compareTo(o.firstName);
        }

        if (result == 0) {
            result = Integer.compare(this.age, o.age);
        }

        return result;
    }
}
