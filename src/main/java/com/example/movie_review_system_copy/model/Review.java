package com.example.movie_review_system_copy.model;


import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class Review {

    private int reviewId;
    private String reviewBody;
    private String userName;
    private Instant createdAt;
    private Instant updateAt;

}
