package com.gerardo.iutlr.pokemobile.presenter;

import com.gerardo.iutlr.pokemobile.model.interactor.PokemonInteractor;
import com.gerardo.iutlr.pokemobile.model.interactor.PokemonInteractorImpl;
import com.gerardo.iutlr.pokemobile.model.pokemon.Pokemon;
import com.gerardo.iutlr.pokemobile.view.PokemonView;

/**
 * This class is the implementation of PokemonPresenter interface. It needs both instances of PokemonView and PokemonInteractor interfaces
 * for the research and to show the pokemon data in the screen.
 * @author Gerardo Aguilar
 */
public class PokemonPresenterImpl implements PokemonPresenter {
    private PokemonView pokemonView;
    private PokemonInteractor pokemonInteractor;

    /**
     *
     * @param pokemonView it's the PokemonView instance
     */
    public PokemonPresenterImpl(PokemonView pokemonView) {
        this.pokemonView = pokemonView;
        this.pokemonInteractor = new PokemonInteractorImpl(this);
    }

    /**
     *
     * @param pokemonName the name of the pokemon that the user wants to know.
     */
    @Override
    public void searchPokemon(String pokemonName) {
        this.pokemonInteractor.searchPokemonApi(pokemonName);
    }

    /**
     *
     * @param pokemon the data from the API
     */
    @Override
    public void showPokemon(Pokemon pokemon) {
        this.pokemonView.showPokemon(pokemon);
    }
}
