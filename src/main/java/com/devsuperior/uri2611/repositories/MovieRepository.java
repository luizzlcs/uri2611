package com.devsuperior.uri2611.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.uri2611.dto.MovieDTO;
import com.devsuperior.uri2611.entities.Movie;
import com.devsuperior.uri2611.projection.MovieProjectionMin;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Query(nativeQuery = true, value = "SELECT movies.id, movies.name " 
            + "FROM movies "
            + "INNER JOIN genres ON genres.id = movies.id_genres " 
            + "WHERE genres.description = :genreName")
    List<MovieProjectionMin> seach1(String genreName);


    @Query("SELECT new com.devsuperior.uri2611.dto.MovieDTO(obj.id, obj.name) " 
            + "FROM Movie obj "
            + "WHERE obj.genre.description = :genreName")
    List<MovieDTO> seach2(String genreName);

} 
