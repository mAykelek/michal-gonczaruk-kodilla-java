package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final String id;
    private final String forumname;
    private final char sex;
    private final int postQuantity;
    private final LocalDate dateOfBirth;

    public ForumUser(String id, String forumname, char sex, int postQuantity, int getYear, int getMonth, int getDay) {
        this.id = id;
        this.forumname = forumname;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(getYear, getMonth, getDay);
        this.postQuantity = postQuantity;
    }

    public String getId() {
        return id;
    }

    public String getForumname() {
        return forumname;
    }

    public char getSex() {
        return sex;
    }

    public int getPostQuantity() {
        return postQuantity;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", forumname='" + forumname + '\'' +
                ", sex=" + sex +
                ", postQuantity=" + postQuantity +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
