package com.url.shortener.models;

import jakarta.persistence.*;
        import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Url_Mapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String originalUrl;
    private String shortUrl;
    private int clickCount = 0;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "urlMapping")
    private List<ClickEvent> clickEvents;
}