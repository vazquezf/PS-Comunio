package com.jugadores.comunio;

import android.widget.ArrayAdapter;

import com.comunio.grupo8.comunio.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Dany on 16/10/15.
 */
public class ListaJugadores {
    private ArrayList<aJugadores> jugadores;

    public ListaJugadores(){
        jugadores=new ArrayList();
    }

    public boolean add(aJugadores object) {
        return jugadores.add(object);
    }

    public ArrayList<aJugadores> getJugadores(){
        return jugadores;
    }

    public void setJugadores(ArrayList<aJugadores> jugadores) {
        this.jugadores = jugadores;
    }

    public boolean removeAll(Collection<?> collection) {
        return jugadores.removeAll(collection);
    }

    public aJugadores set(int index, aJugadores object) {
        return jugadores.set(index, object);
    }

    public int size() {
        return jugadores.size();
    }

    public boolean addAll(Collection<? extends aJugadores> collection) {
        return jugadores.addAll(collection);
    }

    public boolean isEmpty() {
        return jugadores.isEmpty();
    }

    public List<aJugadores> subList(int start, int end) {
        return jugadores.subList(start, end);
    }

    public int lastIndexOf(Object object) {
        return jugadores.lastIndexOf(object);
    }

    public void clear() {
        jugadores.clear();
    }

    public Object[] toArray() {
        return jugadores.toArray();
    }

    public ListIterator<aJugadores> listIterator(int location) {
        return jugadores.listIterator(location);
    }

    public boolean retainAll(Collection<?> collection) {
        return jugadores.retainAll(collection);
    }

    public void add(int index, aJugadores object) {
        jugadores.add(index, object);
    }

    public <T> T[] toArray(T[] contents) {
        return jugadores.toArray(contents);
    }

    public void trimToSize() {
        jugadores.trimToSize();
    }

    public boolean addAll(int index, Collection<? extends aJugadores> collection) {
        return jugadores.addAll(index, collection);
    }

    public boolean remove(Object object) {
        return jugadores.remove(object);
    }

    public ListIterator<aJugadores> listIterator() {
        return jugadores.listIterator();
    }

    public int indexOf(Object object) {
        return jugadores.indexOf(object);
    }

    public boolean contains(Object object) {
        return jugadores.contains(object);
    }

    public boolean containsAll(Collection<?> collection) {
        return jugadores.containsAll(collection);
    }

    public void ensureCapacity(int minimumCapacity) {
        jugadores.ensureCapacity(minimumCapacity);
    }

    public aJugadores get(int index) {
        return jugadores.get(index);
    }

    public Iterator<aJugadores> iterator() {
        return jugadores.iterator();
    }

    public aJugadores remove(int index) {
        return jugadores.remove(index);
    }

    public void cargarJugadores (){
        ArrayList<aJugadores> list=this.getJugadores();
        list.add(new BandaDerecha("Luka Modric du pene scarlata", "Real Madrid", 5000000, R.drawable.modric,"lesionado"));
        list.add(new BandaDerecha("Toni kross","Real Madrid",4000000, R.drawable.kross,"lesionado"));
        list.add(new BandaDerecha("Andres Iniesta","Barcelona FC",5000000, R.drawable.iniesta));
        list.add(new BandaDerecha("Sergio Busquets","Barcelona FC",4000000, R.drawable.busquets));
        list.add(new BandaDerecha("Ivan Rakitic","Barcelona FC",6000000, R.drawable.rakitic,"lesionado"));
        list.add(new BandaDerecha("Koke Resurreccion","Atletico de Madrid",5000000, R.drawable.koke));
        list.add(new BandaDerecha("Gabi","Atletico de Madrid",4000000, R.drawable.gabi));
        list.add(new BandaDerecha("Dani Parejo","Valencia",4000000, R.drawable.parejo));
        list.add(new BandaIzquierda("Andre Gomes","Valencia",5000000, R.drawable.andre_gomes));
        list.add(new BandaIzquierda("Pablo Piatti","Valencia",4500000, R.drawable.piatti));
        list.add(new BandaIzquierda("Bruno Soriano","Villareal",4000000, R.drawable.bruno_soriano,"lesionado"));
        list.add(new BandaIzquierda("Jonathan dos Santos","Villareal",4500000, R.drawable.dos_santos));
        list.add(new BandaIzquierda("Samuel Castillejo","Villareal",4000000, R.drawable.castillejo));
        list.add(new BandaIzquierda("BeÒat","Athletic de Bilbao",4000000, R.drawable.benyat));
        list.add(new BandaIzquierda("Ever Banega","Sevilla",3000000, R.drawable.banega));
        list.add(new Portero("Keylor Navas","Real madrid",4000000, R.drawable.keylor_navas));
        list.add(new Portero("Kiko casilla","Real madrid",2400000, R.drawable.casilla));
        list.add(new Portero("Ter stegen","Barcelona FC",3000000, R.drawable.ter_stegen));
        list.add(new Portero("Claudio Bravo","Barcelona FC",4000000, R.drawable.claudio_bravo));
        list.add(new Portero("Jan Oblak","Atletico de Madrid",4000000, R.drawable.oblak,"lesionado"));
        list.add(new Portero("Sergio Asenjo","Villareal",3500000, R.drawable.asenjo));
        list.add(new Portero("Diego Alves","valencia",5000000, R.drawable.alves,"lesionado"));
        list.add(new Portero("Gorka Iraizoz","Athletic de Bilbao",3000000, R.drawable.iraizoz));
        list.add(new Portero("Beto","Sevilla",4000000, R.drawable.beto));
        list.add(new Portero("Guaita","Getafe",3000000, R.drawable.guaita));
        list.add(new Defensa("Sergio Ramos","Real madrid",9000000, R.drawable.ramos));
        list.add(new Defensa("Pepe","Real madrid",5000000, R.drawable.pepe,"lesionado"));
        list.add(new Defensa("Raphael Varane","Real madrid",4000000, R.drawable.varane,"lesionado"));
        list.add(new Defensa("Gerard Pique","Barcelona FC",5000000, R.drawable.pique));
        list.add(new Defensa("Jeremy Mathieu","Barcelona FC",3000000, R.drawable.mathieu));
        list.add(new Defensa("Dani Alves","Barcelona FC",3000000, R.drawable.alves));
        list.add(new Defensa("Filipe luis","Atletico de Madrid",4000000, R.drawable.filipe));
        list.add(new Defensa("Diego Godin","Atletico de Madrid",6000000, R.drawable.godin));
        list.add(new Defensa("JuanFran Torres","Atletico de Madrid",5000000, R.drawable.torres));
        list.add(new Defensa("Mateo Musacchio","Villareal",3000000, R.drawable.musacchio,"lesionado"));
        list.add(new Defensa("Eric Bailly","Villareal",3000000, R.drawable.bailly));
        list.add(new Defensa("Mario Gaspar","Villareal",2000000, R.drawable.mario_gaspar));
        list.add(new Defensa("shkodran Mustafi","valencia",4000000, R.drawable.mustafi));
        list.add(new Defensa("Jose Luis Gaya","valencia",5000000, R.drawable.gaya,"lesionado"));
        list.add(new Defensa("Joao Cancelo","valencia",3000000, R.drawable.cancelo));
        list.add(new Defensa("Lucas orban","valencia",2000000, R.drawable.orban));
        list.add(new Defensa("Ibai Gomez","Athletic de Bilbao",4000000, R.drawable.ibai));
        list.add(new Defensa("Daniel Carrico","Sevilla",4000000, R.drawable.carrico));
        list.add(new Defensa("Adil Rami","Sevilla",3000000, R.drawable.rami));
        list.add(new Defensa("Alexis Ruano","Getafe",2000000, R.drawable.alexis));
        list.add(new Delantero("Cristiano Ronaldo","Real madrid",12000000, R.drawable.cr7,"lesionado"));
        list.add(new Delantero("Karim Benzema","Real madrid",10000000, R.drawable.benzema,"lesionado"));
        list.add(new Delantero("Gareth Bale","Real madrid",10000000, R.drawable.bale));
        list.add(new Delantero("Lionel Messi","Barcelona FC",12000000, R.drawable.messi));
        list.add(new Delantero("Luis Suarez","Barcelona FC",10000000, R.drawable.luis_suarez));
        list.add(new Delantero("Neymar jr","Barcelona FC",10000000, R.drawable.neymar));
        list.add(new Delantero("Fernando Torres","Atletico de Madrid",5000000, R.drawable.torres));
        list.add(new Delantero("Jackson Martinez","Atletico de Madrid",5000000, R.drawable.jackson));
        list.add(new Delantero("Antoine Griezzmann","Atletico de Madrid",5000000, R.drawable.griezmann));
        list.add(new Delantero("Alvaro Negredo","valencia",5000000, R.drawable.negredo));
        list.add(new Delantero("Paco Alcacer","valencia",6000000, R.drawable.alcacer,"lesionado"));
        list.add(new Delantero("Roberto Soldado","Villareal",6000000, R.drawable.soldado));
        list.add(new Delantero("Leo Baptistao","Villareal",5000000, R.drawable.baptistao));
        list.add(new Delantero("Aritz Aduriz","Athletic de Bilbao",7000000, R.drawable.aduriz));
        list.add(new Delantero("Iker Muniain","Athletic de Bilbao",5000000, R.drawable.muniain,"lesionado"));
        list.add(new Delantero("IÒaki Williams","Athletic de Bilbao",6000000, R.drawable.williams));
        list.add(new Delantero("Paco Alcacer","valencia",6000000, R.drawable.alcacer,"lesionado"));
        list.add(new Delantero("Roberto Soldado","Villareal",6000000, R.drawable.soldado));
        list.add(new Delantero("Leo Baptistao","Villareal",5000000, R.drawable.baptistao));
        list.add(new Delantero("Aritz Aduriz","Athletic de Bilbao",7000000, R.drawable.aduriz));
        list.add(new Delantero("Iker Muniain","Athletic de Bilbao",5000000, R.drawable.muniain,"lesionado"));
        list.add(new Delantero("IÒaki Williams","Athletic de Bilbao",6000000, R.drawable.williams));
        this.setJugadores(list);
    }

    public void cargarJugadoresMercado(){
        ArrayList<aJugadores> list=this.getJugadores();
        list.add(new BandaDerecha("Luka Modric du pene scarlata", "Real Madrid", 5000000, R.drawable.modric,"lesionado"));
        list.add(new BandaDerecha("Toni kross","Real Madrid",4000000,R.drawable.kross,"lesionado"));
        list.add(new BandaDerecha("Andres Iniesta","Barcelona FC",5000000,R.drawable.iniesta));
        list.add(new BandaDerecha("Sergio Busquets","Barcelona FC",4000000,R.drawable.busquets));
        list.add(new BandaIzquierda("Andre Gomes","Valencia",5000000,R.drawable.andre_gomes));
        list.add(new BandaIzquierda("Pablo Piatti","Valencia",4500000,R.drawable.piatti));
        list.add(new BandaIzquierda("Bruno Soriano","Villareal",4000000,R.drawable.bruno_soriano,"lesionado"));
        list.add(new BandaIzquierda("Jonathan dos Santos","Villareal",4500000,R.drawable.dos_santos));
        list.add(new Portero("Keylor Navas","Real madrid",4000000,R.drawable.keylor_navas));
        list.add(new Portero("Kiko casilla","Real madrid",2400000,R.drawable.casilla));
        list.add(new Portero("Ter stegen","Barcelona FC",3000000,R.drawable.ter_stegen));
        list.add(new Portero("Claudio Bravo","Barcelona FC",4000000,R.drawable.claudio_bravo));
        list.add(new Defensa("Sergio Ramos","Real madrid",9000000,R.drawable.ramos));
        list.add(new Defensa("Pepe","Real madrid",5000000,R.drawable.pepe,"lesionado"));
        list.add(new Defensa("Raphael Varane","Real madrid",4000000,R.drawable.varane,"lesionado"));
        list.add(new Defensa("Gerard Pique","Barcelona FC",5000000,R.drawable.pique));
        list.add(new Defensa("Jeremy Mathieu","Barcelona FC",3000000,R.drawable.mathieu));
        list.add(new Delantero("Paco Alcacer","valencia",6000000,R.drawable.alcacer,"lesionado"));
        list.add(new Delantero("Roberto Soldado","Villareal",6000000,R.drawable.soldado));
        list.add(new Delantero("Leo Baptistao","Villareal",5000000,R.drawable.baptistao));
        list.add(new Delantero("Aritz Aduriz","Athletic de Bilbao",7000000,R.drawable.aduriz));
        list.add(new Delantero("Iker Muniain","Athletic de Bilbao",5000000,R.drawable.muniain,"lesionado"));
        list.add(new Delantero("IÒaki Williams","Athletic de Bilbao",6000000,R.drawable.williams));
    }

    public void cargarJugadoresUsuario(){

    }

}
