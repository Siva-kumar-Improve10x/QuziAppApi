package com.example.quziappapi;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.quziappapi.models.OnServiceApi;
import com.example.quziappapi.models.QuziAppApi;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void getCurdData() throws IOException {
        OnServiceApi serviceApi = new QuziAppApi().createQuziApi();
        Call<List<QuziAPP>> call = serviceApi.getQuziAppData();
        List<QuziAPP> list = call.execute().body();
        assertNotNull(list);
        assertFalse(list.isEmpty());
        System.out.println(new Gson().toJson(list));
    }
}