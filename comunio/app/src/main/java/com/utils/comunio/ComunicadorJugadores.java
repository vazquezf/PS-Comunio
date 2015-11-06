package com.utils.comunio;

import com.jugadores.comunio.ListaJugadores;

/**
 * Created by Carlos on 26/10/2015.
 *
 * Esta clase es utilizada como intermediaria para pasar los datos de una actividad a otra
 */
public class ComunicadorJugadores {
    private static ListaJugadores jugadores=new ListaJugadores();

    public static void setJugadores(ListaJugadores jug){
        jugadores = jug;
    }

    public static ListaJugadores getJugadores(){
        return jugadores;
    }

}
