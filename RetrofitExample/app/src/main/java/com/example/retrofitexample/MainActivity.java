package com.example.retrofitexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Pokeadapter pokeadapter;
    ArrayList<Pokemon_> pokemons;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IDataService service = RetrofitClient.getRetrofitInstance().create(IDataService.class);

        Call<Pokemon> call = service.getPokemons();

        call.enqueue(new Callback<Pokemon>() {
            @Override
            public void onResponse(Call<Pokemon> call, Response<Pokemon> response) {
                Pokemon pokemon = response.body();
                try {
                    pokemons = new ArrayList<>(pokemon.getPokemon());
                    generateRecyclerView(pokemons);
                }catch (NullPointerException exception){

                }

            }

            @Override
            public void onFailure(Call<Pokemon> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "Something Went Wrong!" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }

    public void generateRecyclerView(ArrayList<Pokemon_> pokemons){
        pokeadapter = new Pokeadapter(pokemons, getApplicationContext());

        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);

        RecyclerView recyclerView = findViewById(R.id.recycle_poke);

        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(pokeadapter);
    }

}
