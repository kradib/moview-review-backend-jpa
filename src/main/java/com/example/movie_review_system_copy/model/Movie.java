package com.example.movie_review_system_copy.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class Movie {

    @NonNull
    private int id;

    @NonNull
    private String title;
    private String trailerLink;
    private String poster;
    private List<Review> reviews;

}
