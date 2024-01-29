package com.tweteroo.api.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.repository.TweetRepository;

@Service
public class TweetService {
    final TweetRepository tweetRepository;

    TweetService(TweetRepository tweetRepository) {
        this.tweetRepository = tweetRepository;
    }

    public TweetModel createTweet(TweetModel tweet){
        return tweetRepository.save(tweet);
    }
}
