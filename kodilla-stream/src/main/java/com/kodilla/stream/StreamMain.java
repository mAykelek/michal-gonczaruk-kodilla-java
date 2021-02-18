package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map<String, ForumUser> newMap = theForum.getUserList().stream()
                .filter(s -> s.getSex() == 'M')
                .filter(d -> d.getDateOfBirth() > )
                .filter(q -> q.getPostQuantity() > 1)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser -> ForumUser));

        System.out.println("# elements: " + newMap.size());
        newMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}