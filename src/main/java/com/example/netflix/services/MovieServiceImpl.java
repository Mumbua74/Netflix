package com.example.netflix.services;

import com.example.netflix.MovieNotFoundException;
import com.example.netflix.models.Movie;
import com.example.netflix.repositories.MovieRepository;

import java.util.List;

public class MovieServiceImpl implements MovieService
{
    private final MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(Long moveiId) {
        return movieRepository.findById(moveiId).orElseThrow(()->
                new MovieNotFoundException("Movie with id" + moveiId + "not found"));
    }

    @Override
    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }
}
