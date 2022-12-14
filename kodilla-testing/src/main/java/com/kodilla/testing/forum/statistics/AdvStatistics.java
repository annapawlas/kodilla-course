package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class AdvStatistics {

    private int usersNumber;
    private int postsNumber;
    private int commentsNumber;
    private double averagePostsNumberPerUser;
    private double averageCommentsNumberPerUser;
    private double averageCommentsNumberPerPost;

    void calculateAdvStatistics(Statistics statistics){

        List<String> forumUsers = statistics.usersNames();
        usersNumber = forumUsers.size();

        postsNumber = statistics.postsCount();
        commentsNumber = statistics.commentsCount();

        if (usersNumber == 0 && postsNumber == 0){
            averagePostsNumberPerUser = Double.NaN;
        }
        else if (usersNumber==0 && postsNumber > 0) {
            averagePostsNumberPerUser = Double.POSITIVE_INFINITY;
        }
        else  {
            averagePostsNumberPerUser = postsNumber/usersNumber;
        }


        if (usersNumber == 0 && commentsNumber == 0){
            averageCommentsNumberPerUser = Double.NaN;
        }
        else if (usersNumber==0 && commentsNumber > 0) {
            averageCommentsNumberPerUser = Double.POSITIVE_INFINITY;
        }
        else  {
            averageCommentsNumberPerUser = commentsNumber/usersNumber;
        }


        if (postsNumber == 0 && commentsNumber == 0){
            averageCommentsNumberPerPost = Double.NaN;
        }
        else if (postsNumber==0 && commentsNumber > 0) {
            averageCommentsNumberPerPost = Double.POSITIVE_INFINITY;
        }
        else  {
            averageCommentsNumberPerPost = commentsNumber/postsNumber;
        }

    }
    public double getAveragePostsNumberPerUser() {
        return averagePostsNumberPerUser;
    }

    public double getAverageCommentsNumberPerUser() {
        return averageCommentsNumberPerUser;
    }

    public double getAverageCommentsNumberPerPost() {
        return averageCommentsNumberPerPost;
    }




}
