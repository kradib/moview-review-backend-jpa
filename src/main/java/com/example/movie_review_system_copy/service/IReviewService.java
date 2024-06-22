package com.example.movie_review_system_copy.service;

import com.example.movie_review_system_copy.dto.CreateReviewRequest;
import com.example.movie_review_system_copy.model.Review;

public interface IReviewService {

    Review createReview(final int movieId, final CreateReviewRequest createReviewRequest);
}
