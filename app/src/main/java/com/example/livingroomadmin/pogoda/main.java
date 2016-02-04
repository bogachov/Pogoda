package com.example.livingroomadmin.pogoda;


import com.google.gson.internal.LinkedTreeMap;

public class main {
    private String base;
    private LinkedTreeMap <String, float> main;

    public main (String base, LinkedTreeMap main) {
        super();

        this.main = main;
        this.base = base;
    }

   public String get () {
       return this.base;
   }
}
