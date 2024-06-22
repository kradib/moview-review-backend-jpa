package com.example.movie_review_system_copy.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreateReviewRequest {

    private String userName;
    private String reviewBody;

}
