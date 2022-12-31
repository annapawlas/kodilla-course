package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer,ForumUser> mapOfForumUsers = forum.getUserList().stream()
                .filter(user -> user.getSex()=='M')
                .filter(user -> Period.between(user.getBirthDate(), LocalDate.now()).getYears()>=20)
                .filter(user -> user.getPostsNumber()>0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        mapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
