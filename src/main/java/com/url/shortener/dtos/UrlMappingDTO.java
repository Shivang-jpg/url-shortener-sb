package com.url.shortener.dtos;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UrlMappingDTO {
    private String username;
    private long id;
    private String originalUrl;
    private String shortUrl;
    private LocalDateTime createdDate;
    private int clickCount;
}
