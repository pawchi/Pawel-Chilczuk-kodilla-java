package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User john = new Millenials("John Millman");
        User steve = new YGeneration("Steve Youth");
        User bob = new ZGeneration("Bob Zigi");

        //When
        String johnPosts = john.sharePost();
        System.out.println("John shares: "+johnPosts);
        String stevePosts = steve.sharePost();
        System.out.println("Steve shares: "+stevePosts);
        String bobPosts = bob.sharePost();
        System.out.println("Bob shares: "+bobPosts);

        //Then
        Assert.assertEquals("Facebook ",johnPosts);
        Assert.assertEquals("Twitter ",stevePosts);
        Assert.assertEquals("Snapchat ",bobPosts);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User john = new Millenials("John Millman");

        //When
        String johnPosts = john.sharePost();
        System.out.println("John shares: "+johnPosts);
        john.setSharePost(new TwitterPublisher());
        johnPosts = john.sharePost();
        System.out.println("John shares: "+johnPosts);

        //Then
        Assert.assertEquals("Twitter ",johnPosts);

    }
}
