package com.example.netflix.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//@Entity
//@Table(name = "movies")
public class Movie {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "movie_id")
    private Long movie_id;
//
//    @NotNull
//    @Column(name = "movie_name")
    private String movie_name;

//    @NotNull
//    @Column(name = "type")
    private String type;

//    @Column(name = "subscriber_id")
    private Long subscriber_id;

//    @NotNull
//    @Column(name = "category_id")
    private Long category_id;

    public Movie(@NotNull String movie_name, @NotNull String type, @NotNull Long category_id) {
        this.movie_name = movie_name;
        this.type = type;
        this.category_id = category_id;
    }

    public Long getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Long movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSubscriber_id() {
        return subscriber_id;
    }

    public void setSubscriber_id(Long subscriber_id) {
        this.subscriber_id = subscriber_id;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", movie_name='" + movie_name + '\'' +
                ", type='" + type + '\'' +
                ", subscriber_id=" + subscriber_id +
                ", category_id=" + category_id +
                '}';
    }
}
