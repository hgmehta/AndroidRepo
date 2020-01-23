package com.example.retrofitexample;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IDataService {

    @GET("E14trR2lD")
    Call<Pokemon> getPokemons();
}
