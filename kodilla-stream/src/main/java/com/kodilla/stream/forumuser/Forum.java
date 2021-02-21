package com.kodilla.stream.forumuser;


import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumList = new ArrayList<>();

    public Forum() {
        /* id, forumname, sex, postquantity, year, month, day */
        theForumList.add(new ForumUser("134532", "Adam", 'M', 7, 2001, 1, 12));
        theForumList.add(new ForumUser("234312", "Robert", 'M', 34, 1996, 2, 15));
        theForumList.add(new ForumUser("564564", "Angelina", 'F', 192, 1984, 11, 1));
        theForumList.add(new ForumUser("425364", "Michael", 'M', 53, 1999, 7, 20));
        theForumList.add(new ForumUser("651231", "Elizabeth", 'F', 14, 2000, 6, 17));
    }

        public List<ForumUser> getUserList() {
            return new ArrayList<>(theForumList);
        }
}
