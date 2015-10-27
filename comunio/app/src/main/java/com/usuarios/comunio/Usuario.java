package com.usuarios.comunio;

import java.io.Serializable;

/**
 * Created by Dany on 16/10/2015.
 */
public class Usuario extends aUsuario implements Serializable{
    public Usuario (String nick , String pass){
        super (nick);
        this.setPassword(pass);
    }

    @Override
    public boolean equals(Object o) {
        return (this.getNick().contentEquals(((Usuario) o).getNick()));
    }
}
