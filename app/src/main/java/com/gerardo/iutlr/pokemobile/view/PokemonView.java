package com.gerardo.iutlr.pokemobile.view;

import com.gerardo.iutlr.pokemobile.model.pokemon.Pokemon;
/**
 * This interface represents the actions in the UI that can be executed by the user.
 * @author Gerardo Aguilar
 * @version 0.0.1
 * */
public interface PokemonView {

    /**
     * The method searchPokemon receive the name of the pokemon that the user wants to know
     * @param pokemonName the name of the pokemon that we want to know its information.
     */
    void searchPokemon(String pokemonName);

    /**
     * This method receives the pokemon searched data.
     * @param pokemon pokemon searched data
     */
    void showPokemon(Pokemon pokemon);
}
