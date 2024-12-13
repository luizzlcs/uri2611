package com.devsuperior.uri2611.dto;

public class GenreDTO {
    private Long id;
    private String description;

    public GenreDTO(){}

    public GenreDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    };

    
    
}
