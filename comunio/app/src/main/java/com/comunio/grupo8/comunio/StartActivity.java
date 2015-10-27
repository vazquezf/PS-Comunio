package com.comunio.grupo8.comunio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.usuarios.comunio.ListaUsuarios;
import com.utils.comunio.ComunicadorUsuarios;

/* listU son los usuarios en la app. Cada actividad tiene unos atributos que seran los principales objetos
de cada una de ellas
 *
 */
public class StartActivity extends AppCompatActivity {

    private ListaUsuarios listU = new ListaUsuarios();


    protected void startLogin(ListaUsuarios u){
        Intent login = new Intent(this, UserLoginActivity.class);
       // Pasa al comunicador la lista que posteriormente recogemos en la siguiente activity
        ComunicadorUsuarios.setUsuarios(listU);
        startActivity(login);
    }

    protected void startRegister(ListaUsuarios u){
        Intent register = new Intent(this, RegisterActivity.class);
        // Pasa al comunicador la lista que posteriormente recogemos en la siguiente activity
        ComunicadorUsuarios.setUsuarios(listU);
        startActivity(register);
    }

    protected ListaUsuarios getListU(){
        return this.listU;
    }

    protected void setListU(ListaUsuarios u){
        this.listU = u;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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