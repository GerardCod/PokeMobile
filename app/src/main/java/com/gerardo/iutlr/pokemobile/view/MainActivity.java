package com.gerardo.iutlr.pokemobile.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gerardo.iutlr.pokemobile.R;
import com.gerardo.iutlr.pokemobile.model.pokemon.Pokemon;
import com.gerardo.iutlr.pokemobile.model.pokemon.Type;
import com.gerardo.iutlr.pokemobile.model.pokemon.Types;
import com.gerardo.iutlr.pokemobile.presenter.PokemonPresenter;
import com.gerardo.iutlr.pokemobile.presenter.PokemonPresenterImpl;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.picasso.Picasso;

/**
 * This app is made with the MVP (Model - View - Presenter) architecture.
 * @author Gerardo Aguilar
 */
public class MainActivity extends AppCompatActivity implements PokemonView{
    private EditText edtSearchPokemon;
    private ImageView pokemonImage;
    private TextView pokemonName;
    private TextView pokemonType;
    private FloatingActionButton btnSearch;
    private PokemonPresenter pokemonPresenter;
    private String types;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtSearchPokemon = findViewById(R.id.edtSearchPokemon);
        pokemonImage = findViewById(R.id.pokemonImg);
        pokemonName = findViewById(R.id.pokemonName);
        pokemonType = findViewById(R.id.pokemonType);
        btnSearch = findViewById(R.id.btnSearch);
        pokemonPresenter = new PokemonPresenterImpl(this);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!TextUtils.isEmpty(edtSearchPokemon.getText())) {
                    searchPokemon(edtSearchPokemon.getText().toString());
                    edtSearchPokemon.getText().clear();
                } else {
                    Toast.makeText(MainActivity.this, "Enter a pokemon name, please.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    /**
     * This one is the implementation of PokemonView method and gets the pokemon name from the EditText when the user push the search button
     * @param pokemonName the name of the pokemon that we want to know its information.
     */
    @Override
    public void searchPokemon(String pokemonName) {
        this.pokemonPresenter.searchPokemon(pokemonName);
    }

    /**
     * When the Activity gets back the pokemon data from the presenter, it shows the data in the ImagaView and TextViews int the Activity CardView.
     * But, firstly, this method checks if the data is different of null.
     * @param pokemon pokemon searched data
     */
    @Override
    public void showPokemon(Pokemon pokemon) {
        if (pokemon != null) {
            types = "";
            Picasso.get().load(pokemon.getSprite().getFrontDefault()).into(pokemonImage);
            pokemonName.setText(pokemon.getName());
            for (Types type: pokemon.getTypes()) {
                types += type.getType().getName() + " ";
            }
            pokemonType.setText(types);
        }
    }
}
