package com.usuarios.comunio;

import com.jugadores.comunio.ListaJugadores;

import java.io.Serializable;

/**
 * Created by Dany on 16/10/15.
 */
public abstract class aUsuario implements Serializable {
    private ListaJugadores lista;
    private String nick;
    private String password;

    public aUsuario(String nick){
        lista=new ListaJugadores();
        this.nick=nick;
    }

    @Override
    public boolean equals(Object o) {
        return this.getNick().equals(((Usuario) o).getNick());
    }

    public ListaJugadores getLista() {
        return lista;
    }

    public void setLista(ListaJugadores lista) {
        this.lista = lista;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
