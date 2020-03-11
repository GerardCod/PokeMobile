package com.gerardo.iutlr.pokemobile.model.interactor;

import com.gerardo.iutlr.pokemobile.model.repository.ApiRepository;
import com.gerardo.iutlr.pokemobile.model.repository.PokemonApiRepository;
import com.gerardo.iutlr.pokemobile.presenter.PokemonPresenter;

/**
 * This class is a PokemonInteractor implementation to ease the comunication between the presentation layer and the model layer
 * @author Gerardo Aguilar
 */
public class PokemonInteractorImpl implements PokemonInteractor {
    private PokemonPresenter pokemonPresenter;
    private ApiRepository apiRepository;

    /**
     *
     * @param pokemonPresenter It's a PokemonPresenter interface instance to do the link between the data source and the UI
     */
    public PokemonInteractorImpl(PokemonPresenter pokemonPresenter) {
        this.pokemonPresenter = pokemonPresenter;
        this.apiRepository = new PokemonApiRepository(pokemonPresenter);
    }

    /**
     * This method uses an ApiRepository instance to search the pokemon.
     * @param pokemonName It's the name of the pokemon that the user wants to know.
     */
    @Override
    public void searchPokemonApi(String pokemonName) {
        this.apiRepository.searchPokemon(pokemonName);
    }
}
