package com.gerardo.iutlr.pokemobile.model.repository;

import com.gerardo.iutlr.pokemobile.model.pokemon.Pokemon;
import com.gerardo.iutlr.pokemobile.presenter.PokemonPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * This class is the ApiRepository implementation that does the requests to PokeApi.
 * @author Gerardo Aguilar
 */
public class PokemonApiRepository implements ApiRepository {
    private PokemonPresenter pokemonPresenter;
    private PokemonWebService pokemonWebService;

    public PokemonApiRepository(PokemonPresenter pokemonPresenter) {
        this.pokemonPresenter = pokemonPresenter;
        this.pokemonWebService = PokemonServiceSingleton.getConnection().create(PokemonWebService.class);
    }


    @Override
    public void searchPokemon(String pokemonName) {
        pokemonWebService.getPokemon(pokemonName).enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                if (response.isSuccessful()) {
                    pokemonPresenter.showPokemon(response.body());
                }
            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                pokemonPresenter.showPokemon(null);
                t.printStackTrace();
            }
        });
    }
}
