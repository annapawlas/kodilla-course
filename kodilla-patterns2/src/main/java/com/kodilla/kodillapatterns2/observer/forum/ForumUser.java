package com.kodilla.kodillapatterns2.observer.forum;

public class ForumUser implements Observer{

    private String username;
    private int updateCount;

    public ForumUser(String username) {
        this.username = username;
    }
    @Override
    public void update(ForumTopic forumTopic) {
        System.out.println(username + ": New messages in topic " + forumTopic.getName() + "\n" +
                " (total: " + forumTopic.getMessages().size() + " messages)");
        updateCount++;
    }

    public String getUsername() {
        return username;
    }
    public int getUpdateCount() {
        return updateCount;
    }


}
