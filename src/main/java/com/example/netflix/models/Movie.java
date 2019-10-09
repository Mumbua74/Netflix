package com.example.netflix.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private Long movieId;

    @NotNull
    @Column(name = "movie_name")
    private String movieName;

    @NotNull
    @Column(name = "type")
    private String type;

    @Column(name = "subscriber_id")
    private Long subscriberId;

    @NotNull
    @Column(name = "category_id")
    private Long categoryId;

    public Movie(@NotNull String movieName, @NotNull String type, Long subscriberId, @NotNull Long categoryId) {
        this.movieName = movieName;
        this.type = type;
        this.subscriberId = subscriberId;
        this.categoryId = categoryId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", type='" + type + '\'' +
                ", subscriberId=" + subscriberId +
                ", categoryId=" + categoryId +
                '}';
    }
}
