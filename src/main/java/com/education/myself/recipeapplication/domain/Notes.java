package com.education.myself.recipeapplication.domain;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Notes {

    private Recipe recipe;
    private String recipeNotes;
}
