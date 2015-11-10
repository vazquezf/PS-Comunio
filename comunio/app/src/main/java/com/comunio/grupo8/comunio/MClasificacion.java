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
import android.widget.ViewFlipper;

import com.utils.comunio.ComunicadorClasifUpdate;

public class MClasificacion extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

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
        v.setDisplayedChild(1);
        if (ComunicadorClasifUpdate.getUpdate()==true){
            v.setDisplayedChild(3);
        }
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
            //Actividad Actual
        } else if (id == R.id.nav_alineacion) {
            //Alineacion
        } else if (id == R.id.nav_equipo) {
            //Equipo
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
