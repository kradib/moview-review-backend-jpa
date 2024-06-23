package com.example.movie_review_system_copy.service;

import com.example.movie_review_system_copy.dto.CreateMovieRequest;
import com.example.movie_review_system_copy.model.Movie;

import java.util.List;
import java.util.Optional;

public interface IMovieService {

    List<Movie> getMovies();

    Optional<Movie> getAMovie(int id);

    Movie createMovie(CreateMovieRequest createMovieRequest);


}
