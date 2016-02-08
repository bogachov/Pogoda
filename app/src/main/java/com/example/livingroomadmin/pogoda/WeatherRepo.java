package com.example.livingroomadmin.pogoda;

import android.os.StrictMode;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

/**
 * Created by fructus on 08.02.16.
 *
 */




public class WeatherRepo {


    String s;

    private final String URL ="http://api.openweathermap.org";
    private Gson gson = new GsonBuilder().create();
    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(URL)
            .build();

    private Link initf = retrofit.create(Link.class);


        Call<main> call = initf.Read();

   public String  get() {

       StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
       StrictMode.setThreadPolicy(policy);

       try {
           retrofit2.Response<main> response = call.execute();
           s = (response.body().get());


       } catch (IOException e) {
           e.printStackTrace();
       }
       return s;
   }

    private Link intf = retrofit.create(Link.class);
    private final String KEY = "trnsl.1.1.20160124T203710Z.efeae9fa7d11b60b.a778df7a6360ec8b746bea3e60c536ebd3dc378a";
}
