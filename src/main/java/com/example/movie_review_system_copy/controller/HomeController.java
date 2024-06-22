package com.example.movie_review_system_copy.controller;

import com.example.movie_review_system_copy.model.Movie;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;


//when we say an API
// it would have a URI
//URI -> basic URL(localhost:8080) + end point(/movie)
//localhost:8080/movie/{id}
//lh:8080/movie/create

@RestController
@RequestMapping("/") //localhost:8080/movie
public class HomeController {

    @GetMapping("/")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello");
    }




}
