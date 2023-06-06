package com.example.quziappapi.models;

import com.example.quziappapi.QuziAPP;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface OnServiceApi {
    @GET("renuTodo")
    Call<List<QuziAPP>> getQuziAppData();


}
