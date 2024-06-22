package com.example.movie_review_system_copy.controller;

import com.example.movie_review_system_copy.dto.CreateReviewRequest;
import com.example.movie_review_system_copy.service.ReviewService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//localhost:8080/review/

@RestController
@RequestMapping("/review")
@Slf4j
@RequiredArgsConstructor
public class ReviewController {


    private final ReviewService reviewService;
    @PostMapping("/{movieId}")
    public ResponseEntity<Object> createReview(@PathVariable final int movieId,
                                               @RequestBody CreateReviewRequest createReviewRequest) {
        log.info("Received a request with body {} for movieId {}", createReviewRequest, movieId);

        return ResponseEntity.ok(reviewService.createReview(movieId, createReviewRequest));

    }
}
