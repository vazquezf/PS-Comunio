package com.utils.comunio;

import com.usuarios.comunio.aUsuario;

/**
 * Created by Carlos on 27/10/2015.
 */
public class ComunicadorUsuarioLogged {

    private static aUsuario user;

    public static void setUser(aUsuario u){
        user = u;
    }

    public static aUsuario getUser(){
        return user;
    }
}
