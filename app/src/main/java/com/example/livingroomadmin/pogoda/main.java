package com.example.livingroomadmin.pogoda;


import com.google.gson.internal.LinkedTreeMap;

public class main {
    private String base;
    private LinkedTreeMap <String, String> main;

    public main (String base, LinkedTreeMap<String, String> main) {
        super();

        this.main = main;
        this.base = base;
    }

   public String get () {

       return this.main.get("temp");

   }
}
