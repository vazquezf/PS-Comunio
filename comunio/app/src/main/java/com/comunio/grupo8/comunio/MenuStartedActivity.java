package com.comunio.grupo8.comunio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.usuarios.comunio.ListaUsuarios;
import com.utils.comunio.ComunicadorUsuarios;

public class MenuStartedActivity extends AppCompatActivity {
    // Contiene los usuarios registrados en el sistema
    private ListaUsuarios listU;

    protected void startLogin(ListaUsuarios u){
        Intent login = new Intent(this, UserLoginActivity.class);
        ComunicadorUsuarios.setUsuarios(listU);
        startActivity(login);
    }

    protected void startRegister(ListaUsuarios u){
        Intent register = new Intent(this, RegisterActivity.class);
        ComunicadorUsuarios.setUsuarios(listU);
        startActivity(register);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        listU = ComunicadorUsuarios.getUsuarios();

        Button buttonRegister = (Button) findViewById(R.id.button_register);
        Button buttonLogin = (Button) findViewById(R.id.button_login);

        buttonRegister.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startRegister(listU);
                    }
                }
        );

        buttonLogin.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startLogin(listU);
                    }
                }
        );

    }
}
