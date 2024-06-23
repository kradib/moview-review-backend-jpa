package com.example.movie_review_system_copy.service;

import com.example.movie_review_system_copy.dto.CreateReviewRequest;
import com.example.movie_review_system_copy.model.Movie;
import com.example.movie_review_system_copy.model.Review;
import com.example.movie_review_system_copy.respository.MovieRepository;
import com.example.movie_review_system_copy.respository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReviewService implements IReviewService {

    private final ReviewRepository reviewRepository;
    private final MovieRepository movieRepository;

    @Override
    public Review createReview(int movieId, CreateReviewRequest createReviewRequest) {
        final Optional<Movie> movieOptional = movieRepository.findById(movieId);
        if(movieOptional.isPresent()) {
            final Review review = Review.builder()
                    .userName(createReviewRequest.getUserName())
                    .reviewBody(createReviewRequest.getReviewBody())
                    .createdAt(Instant.now())
                    .updateAt(Instant.now())
                    .movie(movieOptional.get())
                    .build();
            return reviewRepository.save(review);
        } else {
            log.error("The specified id {} does not exist", movieId);
            return null;
        }
    }
}
