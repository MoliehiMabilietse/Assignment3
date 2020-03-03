package org.example;

public class Teacher {
    private String name;
    private String surname;
    private String subject;

    public Teacher(String name, String surname, String subject) {

        this.name = name;
        this.surname = surname;
        this.subject = subject;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSubject() {
        return subject;
    }


    public String toString() {
        return "Name: " + name + "\nSurname: " + surname + "\nSubject: " + subject;
    }
}

