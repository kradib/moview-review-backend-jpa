package com.example.movie_review_system_copy.service;

import com.example.movie_review_system_copy.dto.CreateMovieRequest;
import com.example.movie_review_system_copy.model.Movie;
import com.example.movie_review_system_copy.respository.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class MovieService implements IMovieService{

    private final MovieRepository movieRepository;

    @Override
    public List<Movie> getMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getAMovie(int id) {
        return movieRepository.findById(id);
    }

    @Override
    public Movie createMovie(CreateMovieRequest createMovieRequest) {
        final Movie movie = Movie.builder()
                .title(createMovieRequest.getTitle())
                .trailerLink(createMovieRequest.getTrailerLink())
                .poster(createMovieRequest.getPosterLink())
                .build();
        return movieRepository.save(movie);
    }
}
