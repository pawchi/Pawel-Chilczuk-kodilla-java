package com.kodilla.stream.forumuser;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public void forumUserLibrary(){
        userList.add(new ForumUser(001,"Waldecki",'M',1980,01,01,5));
        userList.add(new ForumUser(002,"KasioKo",'F',1995,03,01,1));
        userList.add(new ForumUser(003,"beti15",'F',1999,02,22,17));
        userList.add(new ForumUser(004,"mordor_47",'M',1996,12,30,2));

    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(userList);
    }
}
