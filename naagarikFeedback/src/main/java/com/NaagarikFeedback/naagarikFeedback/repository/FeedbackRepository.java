package com.NaagarikFeedback.naagarikFeedback.repository;

import com.NaagarikFeedback.naagarikFeedback.entity.FeedbackEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<FeedbackEntity, Long> {
}
