package com.kodilla.testing.forum.statistics;

class ComputeStatistics {
    int usersCount;
    int postsCount;
    int commentsCount;
    int averagePostsPerUser;
    int averageCommentsPerUser;
    int averageCommentsPerPost;



    public void calculateAdvStatistics(Statistics statistics) {
        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (postsCount==0){
            averagePostsPerUser=0;
        } else {
            averagePostsPerUser = usersCount / postsCount;
        }
        if (commentsCount==0){
            averageCommentsPerUser=0;
            averageCommentsPerPost=0;
        }else {
            averageCommentsPerUser = usersCount / commentsCount;
            averageCommentsPerPost = postsCount / commentsCount;
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
    public double getAverageCommentsPerPost(){
        return averageCommentsPerPost;
    }
}
