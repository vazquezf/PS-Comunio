package com.jugadores.comunio;

import android.graphics.drawable.Drawable;

/**
 * Created by Dany on 16/10/15.
 */
public abstract class aJugadores{
    private String name;
    private String team;
    private int valor;
    private String estado;
    private int foto;

    public aJugadores(String nom,String equ, int dinero,int foto){
        this.name=nom;
        this.team=equ;
        this.valor=dinero;
        this.estado="En forma";
        this.foto=foto;
    }
    public aJugadores(String nom,String equ, int dinero){
        this.name=nom;
        this.team=equ;
        this.valor=dinero;
        this.estado="En forma";
    }
    public aJugadores(String nom,String equ, int dinero,int foto,String est){
        this.name=nom;
        this.team=equ;
        this.valor=dinero;
        this.estado=est;
        this.foto=foto;
    }
    public aJugadores(String nom,String equ, int dinero,String est){
        this.name=nom;
        this.team=equ;
        this.valor=dinero;
        this.estado=est;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    @Override
    public boolean equals(Object o) {
        boolean iguales= true;
        iguales=iguales && (this.name.equals(((aJugadores) o).name));
        iguales=iguales && (this.estado.equals(((aJugadores) o).estado));
        iguales=iguales && (this.team.equals(((aJugadores) o).team));
        iguales=iguales && (this.valor==((aJugadores) o).valor);
        return iguales;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
