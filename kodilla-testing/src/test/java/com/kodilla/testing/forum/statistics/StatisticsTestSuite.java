package com.kodilla.testing.forum.statistics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;





public class StatisticsTestSuite {

    @Before
    public void beforeEveryTest(){
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn()
    }

    @Test
    public void testComputeStaticticsNoPosts() {
        //Given





        //When


        //Then
        Assert.assertEquals(, );
    }
}
