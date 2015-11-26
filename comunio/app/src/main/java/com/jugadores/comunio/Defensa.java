package com.jugadores.comunio;

/**
 * Created by Dany on 16/10/15.
 */
public class Defensa extends aJugadores {
    public Defensa (String name, String team, int valor){
        super(name,team,valor);
    }
    public Defensa (String name, String team, int valor,int foto){
        super(name,team,valor,foto);
    }
    public Defensa (String name, String team, int valor,String est){
        super(name,team,valor,est);
    }
    public Defensa (String name, String team, int valor,int foto,String est){
        super(name,team,valor,foto,est);
    }
}
