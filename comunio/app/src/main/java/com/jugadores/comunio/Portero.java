package com.jugadores.comunio;

/**
 * Created by Dany on 16/10/15.
 */
public class Portero extends aJugadores {
    public Portero (String name, String team, int valor){
        super(name,team,valor);
    }
    public Portero (String name, String team, int valor,int foto){
        super(name,team,valor,foto);
    }
    public Portero (String name, String team, int valor,String est){
        super(name,team,valor,est);
    }
    public Portero (String name, String team, int valor,int foto,String est){
        super(name,team,valor,foto,est);
    }
}
