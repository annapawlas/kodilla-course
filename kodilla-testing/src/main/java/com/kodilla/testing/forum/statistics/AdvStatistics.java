package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class AdvStatistics {

    int usersNumber;
    int postsNumber;
    int commentsNumber;
    double averagePostsNumberPerUser;
    double averageCommentsNumberPerUser;
    double averageCommentsNumberPerPost;

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




}
