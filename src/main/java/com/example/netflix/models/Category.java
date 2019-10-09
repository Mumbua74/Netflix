package com.example.netflix.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private Long catrgoryId;

    @NotNull
    @Column(name = "categor_name")
    private String categoryName;

    public Category(@NotNull String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getCatrgoryId() {
        return catrgoryId;
    }

    public void setCatrgoryId(Long catrgoryId) {
        this.catrgoryId = catrgoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "catrgoryId=" + catrgoryId +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
