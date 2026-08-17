package com.url.shortener.controller;

import com.url.shortener.models.UrlMapping;
import com.url.shortener.service.UrlMappingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RedirectController {
    private UrlMappingService urlMappingService;
    public ResponseEntity<void> redirect(@PathVariable String shortUrl)
    {
        UrlMapping urlMapping = urlMappingService.getOriginalUrl(shortUrl);
        
    }

}
