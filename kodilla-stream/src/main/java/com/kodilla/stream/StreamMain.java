package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {


        Forum theForum = new Forum();
        LocalDate localDate = LocalDate.now();
        Map<Integer, ForumUser> newMap = theForum.getUserList().stream()
                .filter(sex -> sex.getSex() == 'M')
                .filter(year -> (localDate.getYear() - year.getDateOfBirth().getYear()) >= 20)
                .filter(quantity -> quantity.getPostQuantity() > 1)
                .collect(Collectors.toMap(ForumUser::getId, ForumUser -> ForumUser));

        System.out.println("# elements: " + newMap.size());
        newMap.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}