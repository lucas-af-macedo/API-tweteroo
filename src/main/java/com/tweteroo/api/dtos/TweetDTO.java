package com.tweteroo.api.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data // getters e setters
public class TweetDTO {

	@NotBlank
    private Long userId;

	@NotBlank
    private String text;
}