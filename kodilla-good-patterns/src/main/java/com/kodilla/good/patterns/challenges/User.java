package com.kodilla.good.patterns.challenges;

public class User {

    String name;
    String surname;
    String address;
    String email;

    public User(String name, String surname, String address, String email) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
    }

    public String getName() {

        return name;
    }

    public String getSurname() {

        return surname;
    }

    public String getAddress() {

        return address;
    }

    public String getEmail() {
        return email;
    }
}
