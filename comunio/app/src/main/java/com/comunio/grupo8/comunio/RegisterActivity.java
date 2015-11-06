package com.comunio.grupo8.comunio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.usuarios.comunio.ListaUsuarios;
import com.usuarios.comunio.Usuario;
import com.utils.comunio.AlertUtils;
import com.utils.comunio.ComunicadorUsuarios;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {


    ListaUsuarios listU;
    EditText userReg, userPass1, userPass2;
    Button regUserButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        listU = ComunicadorUsuarios.getUsuarios();
        userReg = (EditText) findViewById(R.id.NameEditText);
        userPass1 = (EditText) findViewById(R.id.passwordEditText);
        userPass2 = (EditText) findViewById(R.id.passwordEditText2);


        regUserButton = (Button) findViewById(R.id.registerUserButton);

        regUserButton.setOnClickListener(this);

     }




    @Override
    public void onClick(View v) {
        //Creamos un objeto AlertUtils
        AlertUtils noti = new AlertUtils(this);
        switch (v.getId()){
            case (R.id.registerUserButton):
                String user = userReg.getText().toString().trim();
                Editable pass1 = userPass1.getText();
                Editable pass2 = userPass2.getText();
                String password = pass1.toString();
                String password2 = pass2.toString();
                if(!user.contentEquals("")) {
                    if (password.contentEquals(password2)) {
                        Usuario newUser = new Usuario(user, password);
                        if (!listU.contains(newUser)) {
                            listU.add(newUser);
                            ComunicadorUsuarios.setUsuarios(listU);
                            noti.notificacion("El usuario ha sido registrado con éxito");
                            Intent menu = new Intent (this, MenuStartedActivity.class);
                            startActivity(menu);


                        } else {
                            noti.error("El usuario introducido ya existe");
                        }
                    } else {
                        noti.error("Las contraseñas no coinciden");
                    }
                }
                else{
                    noti.error("No ha introducido ningún nombre");
                }

                break;

        }
    }

    public void onBackPressed(){
        Intent menu = new Intent (this, MenuStartedActivity.class);
        startActivity(menu);
        finish();
    }
}
