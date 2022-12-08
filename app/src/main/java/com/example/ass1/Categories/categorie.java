package com.example.ass1.Categories;

import com.example.ass1.R;

public class categorie {
    private String name;

    public categorie(String name) {
        this.name=name;
    }

    public static final categorie[] categories= {
            new categorie("Scarf"),
            new categorie("Cardigan For Kids"),
            new categorie("Cardigan For Adults"),
            new categorie("Bag"),
            new categorie("Mini Bag"),
            new categorie("Quilt"),
};

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name ;
    }
}
