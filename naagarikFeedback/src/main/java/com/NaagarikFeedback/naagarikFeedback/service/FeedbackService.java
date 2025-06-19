package com.NaagarikFeedback.naagarikFeedback.service;


import com.NaagarikFeedback.naagarikFeedback.entity.FeedbackEntity;
import com.NaagarikFeedback.naagarikFeedback.repository.FeedbackRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;

@Service

public class FeedbackService {

    //Constructor injection
    private final FeedbackRepository feedbackRepository;

    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    //get all feedback datas
    public List<FeedbackEntity> getAllFeedback() {
        return feedbackRepository.findAll();
    }


    //insert feedback data
    public void addFeedback(FeedbackEntity feedbackEntity) {
        feedbackEntity.setDateTime(LocalDateTime.now());
        feedbackRepository.save(feedbackEntity);
    }


    //get single feedback data
    public FeedbackEntity getSingleFeedback(Long id){
        return feedbackRepository.findById(id).orElse(null);
    }

    //delete feedback
    public void deleteFeedback(Long id){
        feedbackRepository.deleteById(id);
    }

}
