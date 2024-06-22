package com.example.movie_review_system_copy.service;

import com.example.movie_review_system_copy.dto.CreateMovieRequest;
import com.example.movie_review_system_copy.model.Movie;

import java.util.List;

public interface IMovieService {

    List<Movie> getMovies();

    Movie getAMovie(int id);

    Movie createMovie(CreateMovieRequest createMovieRequest);


}
