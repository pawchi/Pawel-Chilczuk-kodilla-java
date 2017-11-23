package com.kodilla.stream;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("\nForumUsers filtered by criteria: male, >=20 years old, posts No.>0\n");

        Forum userLibrary = new Forum();
        userLibrary.forumUserLibrary();
        Map<Integer,ForumUser> theResultOfForumUsers = userLibrary.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getBirthYear() < 1997)
                .filter(forumUser -> forumUser.getPostsNumber()>=1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser ));

        theResultOfForumUsers.entrySet().stream()
                .forEach(entry -> System.out.println(entry.toString()));
    }
}
