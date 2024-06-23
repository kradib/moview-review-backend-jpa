package com.example.movie_review_system_copy.respository;


import com.example.movie_review_system_copy.dto.CreateMovieRequest;
import com.example.movie_review_system_copy.model.Movie;
import com.example.movie_review_system_copy.model.Review;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
@Slf4j
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
                .reviews(new ArrayList<>())
                .build();
        movies.add(movie);
        return movie;
    }

    public void updateMovie(final int movieId, Review review) {
        Movie movie = getAMovie(movieId);
        log.info("Fetched the movie: {}", movie);
        if(movie == null) {
            log.error("The requested id does not exist");
        } else {
            List<Review> reviews = movie.getReviews();
            reviews.add(review);
            movie.setReviews(reviews);
        }
    }

}
