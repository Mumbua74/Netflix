package com.example.netflix.repositories;

import com.example.netflix.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository  {
    List<Movie> findAll();

    Object findById(Long moveiId);

    Movie save(Movie movie);
}
