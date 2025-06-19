package com.NaagarikFeedback.naagarikFeedback.controller;

import com.NaagarikFeedback.naagarikFeedback.entity.FeedbackEntity;
import com.NaagarikFeedback.naagarikFeedback.service.FeedbackService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    //Constructor injection
    private final FeedbackService feedbackService;

    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    //get feedback data
    @GetMapping("/get-feedback")
    public List<FeedbackEntity> getFeedback() {
        return feedbackService.getAllFeedback();
    }

    //post feedback data
    @PostMapping("/add-feedback")
    public String addFeedback(@RequestBody FeedbackEntity feedbackEntity) {
        feedbackService.addFeedback(feedbackEntity);
        return "Feedback Added Successfully";
    }

    //get single feedback
    @GetMapping("/get-feedback/{id}")
    public FeedbackEntity getSingleFeedback(@PathVariable Long id) {
        FeedbackEntity feedbackEntity = feedbackService.getSingleFeedback(id);
        if (feedbackEntity != null && !feedbackEntity.equals("")) {
            return feedbackEntity;
        } else {
            return null;
        }
    }

    //update feedback data
    @PutMapping("/update-feedback/{id}")
    public String updateFeedback(@RequestBody FeedbackEntity newfeedbackEntity, @PathVariable Long id) {
        FeedbackEntity oldFeedback = feedbackService.getSingleFeedback(id);
        oldFeedback.setName(newfeedbackEntity.getName() != null && !newfeedbackEntity.getName().equals("") ? newfeedbackEntity.getName() : oldFeedback.getName());
        oldFeedback.setFeedback(newfeedbackEntity.getFeedback() != null && !newfeedbackEntity.getFeedback().equals("") ? newfeedbackEntity.getFeedback() : oldFeedback.getFeedback());
        oldFeedback.setLocation(newfeedbackEntity.getLocation() != null && !newfeedbackEntity.getLocation().equals("") ? newfeedbackEntity.getLocation() : oldFeedback.getLocation());
        feedbackService.addFeedback(oldFeedback);
        return "Updated Successfully";
    }

    //delete feedback
    @DeleteMapping("delete-feedback/{id}")
    public String deleteFeedback(@PathVariable Long id){
        if(id!=null){
            feedbackService.deleteFeedback(id);
            return "Deleted";
        }
        else{
            return "Some issue in deleting";
        }
    }
}
