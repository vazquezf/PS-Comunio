package com.utils.comunio;

import com.usuarios.comunio.aUsuario;

/**
 * Created by Carlos on 03/11/2015.
 */
public class ComunicadorClasifUpdate {

    private static boolean isUpdated = false;

    public static void setUpdated(boolean update){
        isUpdated = update;
    }

    public static boolean getUpdate(){
        return isUpdated;
    }
}
