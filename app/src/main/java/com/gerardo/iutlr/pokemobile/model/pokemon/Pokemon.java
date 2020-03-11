package com.gerardo.iutlr.pokemobile.model.pokemon;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Pokemon {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("sprites")
    @Expose
    private Sprite sprite;

    @SerializedName("types")
    @Expose
    private List<Types> types;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sprite getSprite() {
        return sprite;
    }

    public void setSprite(Sprite sprite) {
        this.sprite = sprite;
    }

    public List<Types> getTypes() {
        return types;
    }

    public void setTypes(List<Types> types) {
        this.types = types;
    }
}
