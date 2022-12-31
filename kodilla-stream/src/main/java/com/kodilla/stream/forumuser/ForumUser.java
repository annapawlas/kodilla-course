package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int userId;
    private final String username;
    private final char sex;
    private final LocalDate birthDate;
    private final int postsNumber;

    public ForumUser(int userId, String username, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int postsNumber) {
        this.userId = userId;
        this.username = username;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postsNumber = postsNumber;
    }

    public int getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return userId == forumUser.userId && sex == forumUser.sex && postsNumber == forumUser.postsNumber && Objects.equals(username, forumUser.username) && Objects.equals(birthDate, forumUser.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, username, sex, birthDate, postsNumber);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}
