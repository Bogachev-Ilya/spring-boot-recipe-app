package com.education.myself.recipeapplication.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
//    private Difficulty difficulty;
    private Byte[] image;
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
}
