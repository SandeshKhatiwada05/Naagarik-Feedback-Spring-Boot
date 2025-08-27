package com.NaagarikFeedback.naagarikFeedback;

import com.NaagarikFeedback.naagarikFeedback.controller.FeedbackController;
import com.NaagarikFeedback.naagarikFeedback.entity.FeedbackEntity;
import com.NaagarikFeedback.naagarikFeedback.service.FeedbackService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class FeedbackControllerTest {

    private MockMvc mockMvc;
    private FeedbackService feedbackService;

    @BeforeEach
    public void setup() {
        feedbackService = Mockito.mock(FeedbackService.class);
        FeedbackController feedbackController = new FeedbackController(feedbackService);
        mockMvc = MockMvcBuilders.standaloneSetup(feedbackController).build();
    }

    @Test
    public void testGetAllFeedback() throws Exception {
        Mockito.when(feedbackService.getAllFeedback())
                .thenReturn(Arrays.asList(new FeedbackEntity("Sandesh", "Good Work!", "Kathmandu")));

        mockMvc.perform(get("/feedback/get-feedback"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Sandesh"));
    }

    @Test
    public void testAddFeedback() throws Exception {
        Mockito.doNothing().when(feedbackService).addFeedback(any());

        String feedbackJson = """
            {
              "name": "Sandesh",
              "feedback": "Unmanaged Road!",
              "location": "Kathmandu"
            }
        """;

        mockMvc.perform(post("/feedback/add-feedback")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(feedbackJson))
                .andExpect(status().isOk())
                .andExpect(content().string("Feedback Added Successfully"));
    }

    @Test
    public void testDeleteFeedback() throws Exception {
        Mockito.doNothing().when(feedbackService).deleteFeedback(1L);

        mockMvc.perform(delete("/feedback/delete-feedback/1"))
                .andExpect(status().isOk())
                .andExpect(content().string("Deleted"));
    }
}
