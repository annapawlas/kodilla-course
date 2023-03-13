package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){
        //Given
        User john = new Millenials("John");
        User kate = new YGeneration("Kate");
        User susan = new ZGeneration("Susan");

        //When
        String johnPost = john.sharePost();
        String katePost = kate.sharePost();
        String susanPost = susan.sharePost();

        //Then
        Assertions.assertEquals("Facebook", johnPost);
        Assertions.assertEquals("Snapchat", katePost);
        Assertions.assertEquals("Twitter", susanPost);
    }

    @Test
    void testIndividualSharingStrategy(){
        //Given
        User john = new Millenials("John");
        User kate = new YGeneration("Kate");
        User susan = new ZGeneration("Susan");

        //When
        john.setSocialPublisher(new SnapchatPublisher());
        String johnPost = john.sharePost();

        kate.setSocialPublisher(new TwitterPublisher());
        String katePost = kate.sharePost();

        susan.setSocialPublisher(new FacebookPublisher());
        String susanPost = susan.sharePost();

        //Then
        Assertions.assertEquals("Snapchat", johnPost);
        Assertions.assertEquals("Twitter", katePost);
        Assertions.assertEquals("Facebook", susanPost);
    }
}
