package com.utils.comunio;

import android.app.Activity;
import android.support.v7.app.AlertDialog;

/**
 * Created by Carlos on 26/10/2015.
 * Se utiliza para mostrar ventanas de alerta
 */
public class AlertUtils{

    private Activity actividadActual;

    public AlertUtils(Activity act){
        this.actividadActual = act;
    }

    public void error(String error){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(actividadActual).create();
        alertDialog.setTitle("Error");
        alertDialog.setMessage(error);
        alertDialog.show();
    }

    public void notificacion(String notification){
        AlertDialog alertDialog;
        alertDialog = new AlertDialog.Builder(actividadActual).create();
        alertDialog.setTitle("");
        alertDialog.setMessage(notification);
        alertDialog.show();
    }
}
