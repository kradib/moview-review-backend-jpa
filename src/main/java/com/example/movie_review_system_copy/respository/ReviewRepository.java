package com.example.movie_review_system_copy.respository;

import com.example.movie_review_system_copy.dto.CreateReviewRequest;
import com.example.movie_review_system_copy.model.Review;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.Instant;

@Repository
@RequiredArgsConstructor
public class ReviewRepository {

    private final MovieRepository movieRepository;


    public Review createReview(final int movieId, final CreateReviewRequest createReviewRequest) {
        final Review review = Review.builder()
                .userName(createReviewRequest.getUserName())
                .reviewBody(createReviewRequest.getReviewBody())
                .reviewId(1)
                .createdAt(Instant.now())
                .updateAt(Instant.now())
                .build();
        movieRepository.updateMovie(movieId, review);
        return review;
    }

}
