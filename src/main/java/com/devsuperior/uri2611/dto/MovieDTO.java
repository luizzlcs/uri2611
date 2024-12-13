package com.devsuperior.uri2611.dto;

import com.devsuperior.uri2611.projection.MovieProjectionMin;

public class MovieDTO {
    private Long id;
    private String name;

    public MovieDTO() {
    }

    public MovieDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MovieDTO(MovieProjectionMin projection) {
        id = projection.getId();
        name = projection.getName();

    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MovieDTO [id=" + id + ", name=" + name + "]";
    }

    

}
