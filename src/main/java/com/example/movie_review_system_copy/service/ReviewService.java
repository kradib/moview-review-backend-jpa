package com.example.movie_review_system_copy.service;

import com.example.movie_review_system_copy.dto.CreateReviewRequest;
import com.example.movie_review_system_copy.model.Review;
import com.example.movie_review_system_copy.respository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReviewService implements IReviewService {

    private final ReviewRepository reviewRepository;

    @Override
    public Review createReview(int movieId, CreateReviewRequest createReviewRequest) {
        return reviewRepository.createReview(movieId, createReviewRequest);
    }
}
