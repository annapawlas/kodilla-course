package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(3647, "magdatomczyk", 'F', 1966, 6,25, 7));
        userList.add(new ForumUser(9411, "mikołajsowa", 'M', 1978,2,6, 2));
        userList.add(new ForumUser(3294, "maksymprzybylski", 'M',1942, 1,13, 12));
        userList.add(new ForumUser(4214, "bartoszmarkiewicz", 'M',1969, 12, 17, 10));
        userList.add(new ForumUser(2442, "dorotalipińska", 'F', 1972,12,12, 56));
        userList.add(new ForumUser(5404, "tamarajabłońska", 'F',2003,11, 28, 0));
        userList.add(new ForumUser(6625, "hildegardaskiba", 'F', 1998,2,3, 31));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
