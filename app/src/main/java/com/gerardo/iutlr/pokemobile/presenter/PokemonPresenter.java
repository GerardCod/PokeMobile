package com.gerardo.iutlr.pokemobile.presenter;

import com.gerardo.iutlr.pokemobile.model.pokemon.Pokemon;

/**
 * This interface represents the presentation layer where the interactions from the UI are managed to get back a response from the PokeAPI
 * @author Gerardo Aguilar
 */
public interface PokemonPresenter {
    /**
     * This method receives the pokemon name that the user wants to know
     * @param pokemonName the name of the pokemon that the user wants to know.
     */
    void searchPokemon(String pokemonName);

    /**
     * this method gets back the pokemon data from the PokeAPI and shows it.
     * @param pokemon the data from the API
     */
    void showPokemon(Pokemon pokemon);
}
