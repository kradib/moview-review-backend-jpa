package com.example.movie_review_system_copy.respository;


import com.example.movie_review_system_copy.dto.CreateMovieRequest;
import com.example.movie_review_system_copy.model.Movie;
import com.example.movie_review_system_copy.model.Review;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private final List<Movie> movies;

    public MovieRepository() {
        this.movies = new ArrayList<>();
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public Movie getAMovie(int id) {
        for (Movie movie : movies) {
            if (movie.getId() == id) {
                return movie;
            }
        }
       return null;
    }

    public Movie createMovie(final CreateMovieRequest createMovieRequest) {
        final Movie movie = Movie.builder()
                .id(movies.size())
                .title(createMovieRequest.getTitle())
                .trailerLink(createMovieRequest.getTrailerLink())
                .poster(createMovieRequest.getPosterLink())
                .build();
        movies.add(movie);
        return movie;
    }

    public int updateMovie(final int movieId, final Review review) {
        return 1;
    }


}
