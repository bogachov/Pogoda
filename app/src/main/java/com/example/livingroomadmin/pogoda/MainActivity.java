package com.example.livingroomadmin.pogoda;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {


    private final String URL ="http://api.openweathermap.org";
    private Gson gson = new GsonBuilder().create();
    private Retrofit retrofit = new Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .baseUrl(URL)
            .build();

    private Link initf = retrofit.create(Link.class);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        Call<main> call = initf.Read();

        try {
            retrofit2.Response<main> response = call.execute();
            Map<String,String> map = gson.fromJson(response.body().toString(),Map.class);
/*
            for (Map.Entry e: map.entrySet()){
                System.out.println(e.getKey() + " " + e.getValue());

                if (e.getKey().equals("text")) {
                    System.out.println(e.getValue().getClass().getName());

                    ArrayList item = (ArrayList) e.getValue();
                    transleted.setText(item.get(0).toString());
                }
            }
            */
        } catch (IOException e) {
            e.printStackTrace();
        }

        //private Link intf = retrofit.create(Link.class);
        //private final String KEY = "trnsl.1.1.20160124T203710Z.efeae9fa7d11b60b.a778df7a6360ec8b746bea3e60c536ebd3dc378a";





    }


}


