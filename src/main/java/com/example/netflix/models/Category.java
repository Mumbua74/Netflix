package com.example.netflix.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//@Entity
//@Table(name = "categories")
public class Category {

//    @Id
//    @NotNull
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "category_id")
    private Long catrgory_id;

//    @NotNull
//    @Column(name = "category_name")
    private String category_name;

    public Category(@NotNull String category_name) {
        this.category_name = category_name;
    }

    public Long getCatrgory_id() {
        return catrgory_id;
    }

    public void setCatrgory_id(Long catrgory_id) {
        this.catrgory_id = catrgory_id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catrgory_id=" + catrgory_id +
                ", category_name='" + category_name + '\'' +
                '}';
    }
}
