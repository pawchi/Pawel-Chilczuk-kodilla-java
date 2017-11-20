package com.kodilla.testing.forum.statistics;

class ComputeStatistics {
    int usersCount;
    int postsCount;
    int commentsCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;



    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (postsCount==0){
            averagePostsPerUser=0;
        } else {
            averagePostsPerUser =  postsCount/usersCount;
        }
        if (commentsCount==0){
            averageCommentsPerUser=0;
            averageCommentsPerPost=0;
        }else {
            averageCommentsPerUser =  commentsCount/usersCount;
            averageCommentsPerPost =  commentsCount/postsCount;
        }

    }

    public void ShowStatistics(){

    }

    public double getAveragePostsPerUser(){
        return averagePostsPerUser;
    }
    public double getAverageCommentsPerUser(){
        return averageCommentsPerUser;
    }
    double getAverageCommentsPerPost(){
        return averageCommentsPerPost;
    }
}
