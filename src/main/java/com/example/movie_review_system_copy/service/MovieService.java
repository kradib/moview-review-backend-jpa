package com.example.movie_review_system_copy.service;

import com.example.movie_review_system_copy.dto.CreateMovieRequest;
import com.example.movie_review_system_copy.model.Movie;
import com.example.movie_review_system_copy.respository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class MovieService implements IMovieService{

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getMovies() {
        return movieRepository.getMovies();
    }

    @Override
    public Movie getAMovie(int id) {
        return movieRepository.getAMovie(id);
    }

    @Override
    public Movie createMovie(CreateMovieRequest createMovieRequest) {
        return movieRepository.createMovie(createMovieRequest);
    }
}
