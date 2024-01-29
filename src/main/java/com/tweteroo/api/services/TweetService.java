package com.tweteroo.api.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tweteroo.api.dtos.TweetDTO;
import com.tweteroo.api.models.TweetModel;
import com.tweteroo.api.repository.TweetRepository;

@Service
public class TweetService {
    final TweetRepository tweetRepository;
    final UserService userService;

    TweetService(TweetRepository tweetRepository, UserService userService) {
        this.tweetRepository = tweetRepository;
        this.userService = userService;
    }


    public TweetModel save(TweetDTO dto){
        if (userService.findUserById(dto.getUserId())){
            
        }
    }

    public TweetModel createTweet(TweetModel tweet){
        return tweetRepository.save(tweet);
    }
}
