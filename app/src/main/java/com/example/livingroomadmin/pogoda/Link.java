package com.example.livingroomadmin.pogoda;



import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;


public interface Link {
    //@FormUrlEncoded
    @GET("/data/2.5/weather?q=Odessa&APPID=deb6872f452c6fd884dd84212a611f33")
    //Call<Object> Read(@FieldMap Map<String,String> map);
    Call <main> Read ();
}
