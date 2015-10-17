package com.comunio.grupo8.comunio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.jugadores.comunio.ListaJugadores;
import com.usuarios.comunio.ListaUsuarios;
import com.usuarios.comunio.Usuario;
import com.usuarios.comunio.aUsuario;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final ListaUsuarios users = new ListaUsuarios ();
        ListaJugadores jugodres = new ListaJugadores();
        users.add(new Usuario("Dany","hola"));

        this.findViewById(R.id.usuarioEditText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.usuarioEditText)).setText("");
            }
        });

        this.findViewById(R.id.contrasenaEditText).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.contrasenaEditText)).setText("");
            }
        });
        this.findViewById(R.id.entrarButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nick=((TextView) findViewById(R.id.usuarioEditText)).getText().toString();
                String pass=((TextView) findViewById(R.id.contrasenaEditText)).getText().toString();
                aUsuario usuarioIntrod = new Usuario(nick,pass);
                boolean error=users.contains(usuarioIntrod);
                Log.i("prueba identificacion", "El usuario introducido es valido: " + error);
            }
        });
    }
}
