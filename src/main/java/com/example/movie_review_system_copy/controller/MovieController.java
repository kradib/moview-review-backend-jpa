package com.example.movie_review_system_copy.controller;


import com.example.movie_review_system_copy.dto.CreateMovieRequest;
import com.example.movie_review_system_copy.model.Movie;
import com.example.movie_review_system_copy.service.MovieService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movie")
@Slf4j
@RequiredArgsConstructor
public class MovieController {
    private final MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        log.info("Received a request for Fetching all Movies");
        return ResponseEntity.ok(movieService.getMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable final int id) {
        log.info("Received a request for a movie with id {}", id);
        Optional<Movie> movieOptional = movieService.getAMovie(id);
        return movieOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.ok(null));
    }

    @PostMapping
    public ResponseEntity<Movie> createMovie(@RequestBody CreateMovieRequest createMovieRequest) {
        log.info("Received a request for creating movie with request {}", createMovieRequest);
        return ResponseEntity.ok(movieService.createMovie(createMovieRequest));
    }

}
