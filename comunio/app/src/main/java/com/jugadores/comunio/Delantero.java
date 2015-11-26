package com.jugadores.comunio;

import android.graphics.drawable.Drawable;

/**
 * Created by Dany on 16/10/15.
 */
public class Delantero extends aJugadores {
    public Delantero (String name, String team, int valor,int foto){
        super(name,team,valor,foto);
    }
    public Delantero (String name, String team, int valor){
        super(name,team,valor);
    }
    public Delantero (String name, String team, int valor,String est){
        super(name,team,valor,est);
    }
    public Delantero (String name, String team, int valor,int foto,String est){
        super(name,team,valor,foto,est);
    }
}
