package com.usuarios.comunio;

import com.jugadores.comunio.ListaJugadores;

/**
 * Created by Dany on 16/10/15.
 */
public abstract class aUsuario {
    private ListaJugadores lista;
    private String nick;
    private String password;

    public aUsuario(String nick){
        lista=new ListaJugadores();
        this.nick=nick;
    }

    @Override
    public boolean equals(Object o) {
        return this.nick==((aUsuario) o).nick;
    }
}
