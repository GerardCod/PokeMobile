package com.gerardo.iutlr.pokemobile.model.repository;

/**
 * This interface does the search to API.
 * @author Gerardo Aguilar
 */
public interface ApiRepository {

    /**
     * This method executes the search to API given a pokemon name.
     * @param pokemonName It's the name of the pokemon that the user wants to know.
     */
    void searchPokemon(String pokemonName);
}
