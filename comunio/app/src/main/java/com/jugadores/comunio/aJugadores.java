package com.jugadores.comunio;

/**
 * Created by Dany on 16/10/15.
 */
public abstract class aJugadores {
    private String name;
    private String team;
    private int valor;
    private String estado;

    public aJugadores(String nom,String equ, int dinero){
        this.name=nom;
        this.team=equ;
        this.valor=dinero;
        this.estado="En forma";
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

    @Override
    public boolean equals(Object o) {
        boolean iguales= true;
        iguales=iguales && (this.name==((aJugadores) o).name);
        iguales=iguales && (this.estado==((aJugadores) o).estado);
        iguales=iguales && (this.team==((aJugadores) o).team);
        iguales=iguales && (this.valor==((aJugadores) o).valor);
        return iguales;
    }
}
