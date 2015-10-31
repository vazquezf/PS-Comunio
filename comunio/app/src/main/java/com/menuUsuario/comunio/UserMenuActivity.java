package com.menuUsuario.comunio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.comunio.grupo8.comunio.R;
import com.usuarios.comunio.ListaUsuarios;
import com.usuarios.comunio.Usuario;
import com.utils.comunio.AlertUtils;
import com.utils.comunio.ComunicadorUsuarioLogged;
import com.utils.comunio.ComunicadorUsuarios;


public class UserMenuActivity extends AppCompatActivity implements View.OnClickListener {


    private ListaUsuarios listU;
    private Usuario actualUser;
    private TextView userNameScreen;
    private Button noticias, jugadores, alineación, mercado, clasificacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        listU = ComunicadorUsuarios.getUsuarios();
        actualUser = (Usuario) ComunicadorUsuarioLogged.getUser();

        userNameScreen = (TextView) findViewById(R.id.userNameTextScreen);

        //Ponemos el nombre del usuario en pantalla
        userNameScreen.setText(actualUser.getNick() + "!");

        AlertUtils noti = new AlertUtils(this);
        noti.notificacion("Bienvenido a su panel de usuario. Seleccione cualquiera de las herramientas");

        noticias = (Button) findViewById(R.id.newsButton);
        clasificacion = (Button) findViewById(R.id.classification_button);

        noticias.setOnClickListener(this);
        clasificacion.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case (R.id.newsButton):
                ComunicadorUsuarios.setUsuarios(listU);
                ComunicadorUsuarioLogged.setUser(actualUser);
                Intent news = new Intent(this, NewsActivity.class);
                startActivity(news);
                break;
            case (R.id.classification_button):
                ComunicadorUsuarios.setUsuarios(listU);
                ComunicadorUsuarioLogged.setUser(actualUser);
                Intent clasif = new Intent(this, ClasificationActivity.class);
                startActivity(clasif);
                break;
        }
    }
}
