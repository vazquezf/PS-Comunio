package com.utils.comunio;

import com.usuarios.comunio.ListaUsuarios;

/**
 * Created by Carlos on 26/10/2015.
 *
 * Esta clase es utilizada como intermediaria para pasar los datos de una actividad a otra
 */
public class ComunicadorUsuarios {

    private static ListaUsuarios usuarios;


    public static void setUsuarios(ListaUsuarios us){
        usuarios = us;
    }

    public static ListaUsuarios getUsuarios(){
        return usuarios;
    }
}
