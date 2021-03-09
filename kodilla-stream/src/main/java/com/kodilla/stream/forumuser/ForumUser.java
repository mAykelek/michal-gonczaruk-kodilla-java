package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int id;
    private final String forumname;
    private final char sex;
    private final int postQuantity;
    private final LocalDate dateOfBirth;

    public ForumUser(final int id, final String forumname, final char sex, final int postQuantity, final int getYear, final int getMonth, final int getDay) {
        this.id = id;
        this.forumname = forumname;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(getYear, getMonth, getDay);
        this.postQuantity = postQuantity;
    }

    public int getId() {
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
