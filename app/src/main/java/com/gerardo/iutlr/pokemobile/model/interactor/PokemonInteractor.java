package com.gerardo.iutlr.pokemobile.model.interactor;

/**
 * This interface has the responsability of tho choose what data source to use.
 * The data source can be either an API or a local database sqlite
 * @author Gerardo Aguilar
 */
public interface PokemonInteractor {
    /**
     * This method receives a pokemon name to send it to the API
     * @param pokemonName It's the name of the pokemon that the user wants to know.
     */
    void searchPokemonApi(String pokemonName);
}
