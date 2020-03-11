package com.gerardo.iutlr.pokemobile.model.repository;

import com.gerardo.iutlr.pokemobile.model.pokemon.Pokemon;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * This interface describes the requests necessaries for the comunication between the API and the app.
 * @author Gerardo Aguilar
 */
public interface PokemonWebService {
    String BSE_URL = "https://pokeapi.co/api/v2/";

    /**
     * This method does the request towards PokeAPI to get back the pokemon data
     * @param pokemonName It's the name of the pokemon that the user wants to know
     * @return Call<Pokemon> Callback that manages the API response
     */
    @GET("pokemon/{name}")
    Call<Pokemon> getPokemon(@Path("name") String pokemonName);
}
