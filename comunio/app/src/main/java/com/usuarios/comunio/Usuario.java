package com.usuarios.comunio;

/**
 * Created by Dany on 16/10/2015.
 */
public class Usuario extends aUsuario{
    public Usuario (String nick , String pass){
        super (nick);
        this.setPassword(pass);
    }

    @Override
    public boolean equals(Object o) {
        return (this.getNick().equals(((Usuario) o).getNick()) && this.getPassword().equals(((Usuario) o).getPassword()));
    }
}
