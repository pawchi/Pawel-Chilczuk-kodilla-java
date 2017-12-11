package com.kodilla.good.patterns.challenges;

public class User {
    public String name;
    public String surname;
    public String nick;

    public User(String name, String surname, String nick) {
        this.name = name;
        this.surname = surname;
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNick() {
        return nick;
    }
}
