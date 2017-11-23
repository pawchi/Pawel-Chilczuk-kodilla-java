package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;


    public ForumUser(int userId, String userName, char sex, int birthYear,int birthMonth,int birthDay, int postsNumber) {
        this.userId = userId;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(birthYear,birthMonth,birthDay);
        this.postsNumber = postsNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public int getBirthYear(){return birthDate.getYear(); }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
