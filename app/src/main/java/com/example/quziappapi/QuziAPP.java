package com.example.quziappapi;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuziAPP {

    @SerializedName("_id")
    private String id;

    private Module module;

    private List<Question> questions;

}
