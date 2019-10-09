package com.example.netflix.services;

import com.example.netflix.models.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findAll();

    Movie findById(Long moveiId);

    Movie createMovie(Movie movie);

}
