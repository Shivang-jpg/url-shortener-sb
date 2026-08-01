package com.url.shortener.service;

import com.url.shortener.dtos.UrlMappingDTO;
import com.url.shortener.models.UrlMapping;
import com.url.shortener.models.User;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UrlMappingService {

    public UrlMappingDTO createShortUrl(String originalUrl, User user) {
      String shortURl = generateShortUrl();
        UrlMapping urlMapping = new UrlMapping();
        urlMapping.setOriginalUrl(originalUrl);
        urlMapping.setUser(user);
        urlMapping.setOriginalUrl(originalUrl);
        urlMapping.setShortUrl(shortURl);
        urlMapping.setCreatedAt(LocalDateTime.now());
    }

    private String generateShortUrl()
    {
        return "";
    }
}
