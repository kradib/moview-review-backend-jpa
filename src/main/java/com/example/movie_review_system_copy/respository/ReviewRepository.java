package com.example.movie_review_system_copy.respository;

import com.example.movie_review_system_copy.model.Review;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import java.time.Instant;

@Repository
public interface ReviewRepository extends CrudRepository<Review, Integer> {

}
