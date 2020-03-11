package com.gerardo.iutlr.pokemobile.model.repository;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * This class is the singleton for the requests to API
 */
public class PokemonServiceSingleton {
    private static Retrofit retrofit;

    /**
     * It returns a retrofit object to manage the connection
     * @return Retrofit it's the connection with the API
     */
    public static Retrofit getConnection() {
        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(PokemonWebService.BSE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
