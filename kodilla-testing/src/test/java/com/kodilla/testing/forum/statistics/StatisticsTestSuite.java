package com.kodilla.testing.forum.statistics;
import org.junit.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;





public class StatisticsTestSuite {

    @Before
    public void beforeEveryTest(){

    }

    @Test
    public void testComputeStaticticsNoPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> emptyList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(emptyList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ComputeStatistics run = new ComputeStatistics();
        run.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0,run.getAveragePostsPerUser(),0);
        Assert.assertEquals(0,run.getAverageCommentsPerPost(),0);

    }
    @Test
    public void testComputeStaticticsThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> bigList = new ArrayList<>();
        for(int n=0;n<10;n++){
            bigList.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(bigList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ComputeStatistics run = new ComputeStatistics();
        run.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(100,run.getAveragePostsPerUser(),0);

    }

    @Test
    public void testComputeStaticticsNoComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        for(int n=0;n<10;n++){
            userList.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ComputeStatistics run = new ComputeStatistics();
        run.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0,run.getAverageCommentsPerPost(),0);
        Assert.assertEquals(0,run.getAverageCommentsPerUser(),0);
    }

    @Test
    public void testComputeStatisticsLessCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        for(int n=0;n<10;n++){
            userList.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);

        //When
        ComputeStatistics run = new ComputeStatistics();
        run.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0.1,run.getAverageCommentsPerPost(),0.1);

    }

    @Test
    public void testComputeStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> userList = new ArrayList<>();
        for(int n=0;n<10;n++){
            userList.add("a");
        }
        when(statisticsMock.usersNames()).thenReturn(userList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        ComputeStatistics run = new ComputeStatistics();
        run.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(10,run.getAverageCommentsPerPost(),0);
        Assert.assertEquals(10,run.getAverageCommentsPerUser(),0);

    }

    @Test
    public void testComputeStatisticsNoUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> emptyList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(emptyList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        ComputeStatistics run = new ComputeStatistics();
        run.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(0,run.getAveragePostsPerUser(),0);
        Assert.assertEquals(0,run.getAverageCommentsPerUser(),0);

    }

    @Test
    public void testComputeStatisticsHundredUsers(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for(int n=0;n<100;n++){
            usersList.add("a");
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        ComputeStatistics run = new ComputeStatistics();
        run.calculateAdvStatistics(statisticsMock);


        //Then
        Assert.assertEquals(1,run.getAveragePostsPerUser(),0);
        Assert.assertEquals(1,run.getAverageCommentsPerUser(),0);

    }
}
