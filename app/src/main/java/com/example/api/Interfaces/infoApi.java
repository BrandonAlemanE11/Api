package com.example.api.Interfaces;
import com.example.api.DTO.informacion;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface infoApi {
    @GET("fact")
    public Call<informacion> find(@Path("fact") String fact);
}
