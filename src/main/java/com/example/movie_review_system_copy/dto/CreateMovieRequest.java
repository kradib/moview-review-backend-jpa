package com.example.movie_review_system_copy.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CreateMovieRequest {

    private String title;
    private String trailerLink;
    private String posterLink;
}
