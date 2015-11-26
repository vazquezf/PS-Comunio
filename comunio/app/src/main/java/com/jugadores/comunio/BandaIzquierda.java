package com.jugadores.comunio;

/**
 * Created by David on 15/11/2015.
 */
public class BandaIzquierda extends aJugadores {
    public BandaIzquierda (String name, String team, int valor){
        super(name,team,valor);
    }
    public BandaIzquierda (String name, String team, int valor,int foto){
        super(name,team,valor,foto);
    }
    public BandaIzquierda (String name, String team, int valor,String est){
        super(name,team,valor,est);
    }
    public BandaIzquierda (String name, String team, int valor,int foto,String est){
        super(name,team,valor,foto,est);
    }
}