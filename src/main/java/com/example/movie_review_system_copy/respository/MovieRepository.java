package com.example.movie_review_system_copy.respository;


import com.example.movie_review_system_copy.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Integer> {


}
