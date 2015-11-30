package com.comunio.grupo8.comunio;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.ViewFlipper;

import com.jugadores.comunio.BandaDerecha;
import com.jugadores.comunio.BandaIzquierda;
import com.jugadores.comunio.Defensa;
import com.jugadores.comunio.Delantero;
import com.jugadores.comunio.ListaJugadores;
import com.jugadores.comunio.Portero;
import com.usuarios.comunio.Usuario;
import com.usuarios.comunio.aUsuario;
import com.utils.comunio.ComunicadorMercado;
import com.utils.comunio.ComunicadorUsuarioLogged;
import com.utils.comunio.ComunicadorUsuarios;
import com.utils.comunio.JugadoresAdapter;

/**
 * Created by David on 14/11/2015.
 */
public class MAlineacion extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        ViewFlipper v=(ViewFlipper) findViewById(R.id.flipper);

        ListaJugadores list = ComunicadorUsuarioLogged.getUser().getLista();
        ListaJugadores ldelantero = new ListaJugadores();
        ListaJugadores lizquierda = new ListaJugadores();
        ListaJugadores lderecha = new ListaJugadores();
        ListaJugadores ldefensa = new ListaJugadores();
        ListaJugadores lportero = new ListaJugadores();

        for (int i = 0; i<list.size();i++){
                if(list.get(i) instanceof Delantero){
                    ldelantero.add(list.get(i));
                }
        }
        for (int i = 0; i<list.size();i++){
            if(list.get(i)instanceof BandaIzquierda){
                lizquierda.add(list.get(i));
            }
        }
        for (int i = 0; i<list.size();i++){
            if(list.get(i) instanceof BandaDerecha){
                lderecha.add(list.get(i));
            }
        }
        for (int i = 0; i<list.size();i++){
            if(list.get(i) instanceof Defensa){
                ldefensa.add(list.get(i));
            }
        }
        for (int i = 0; i<list.size();i++){
            if(list.get(i)instanceof Portero){
                lportero.add(list.get(i));
            }
        }

        final Spinner delview = (Spinner) findViewById(R.id.delantero);
        final Spinner bizqview = (Spinner) findViewById(R.id.bandaizquierda);
        final Spinner bderview = (Spinner) findViewById(R.id.bandaderecha);
        final Spinner defview = (Spinner) findViewById(R.id.defensa);
        final Spinner portview = (Spinner) findViewById(R.id.portero);

        final JugadoresAdapter adapterdel = new JugadoresAdapter(this,
                R.layout.recuadro_jugadores, ldelantero.getJugadores());

        adapterdel.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final JugadoresAdapter adapterbizq = new JugadoresAdapter(this,
                R.layout.recuadro_jugadores, lizquierda.getJugadores());

        adapterbizq.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final JugadoresAdapter adapterbder = new JugadoresAdapter(this,
                R.layout.recuadro_jugadores, lderecha.getJugadores());

        adapterbder.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final JugadoresAdapter adapterdef = new JugadoresAdapter(this,
                R.layout.recuadro_jugadores, ldefensa.getJugadores());

        adapterdef.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        final JugadoresAdapter adapterpor = new JugadoresAdapter(this,
                R.layout.recuadro_jugadores, lportero.getJugadores());

        adapterpor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        delview.setAdapter(adapterdel);
        bizqview.setAdapter(adapterbizq);
        bderview.setAdapter(adapterbder);
        defview.setAdapter(adapterdef);
        portview.setAdapter(adapterpor);
        v.setDisplayedChild(4);

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.jugadores, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_noticias) {
            Intent news=new Intent(this,MNews.class);
            startActivity(news);
            finish();
        } else if (id == R.id.nav_clasificacion) {
            Intent clasf=new Intent(this,MClasificacion.class);
            startActivity(clasf);
            finish();
        } else if (id == R.id.nav_alineacion) {
            //Activity actual
        } else if (id == R.id.nav_equipo) {
            Intent jug=new Intent(this,MEquipo.class);
            startActivity(jug);
            finish();
        } else if (id == R.id.nav_mercado) {
            Intent jug=new Intent(this,MMercado.class);
            startActivity(jug);
            finish();
        } else if (id == R.id.nav_jugadores) {
            Intent jug=new Intent(this,MJugadores.class);
            startActivity(jug);
            finish();
        } else if (id == R.id.nav_ajustes_cuenta) {
            //Start ajustes activity
        } else if (id == R.id.nav_cierre_sesion) {
            Intent log=new Intent(this,UserLoginActivity.class);
            finish();
            startActivity(log);
        } else if (id == R.id.nav_salir_app) {
            finish();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                finishAffinity();
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
