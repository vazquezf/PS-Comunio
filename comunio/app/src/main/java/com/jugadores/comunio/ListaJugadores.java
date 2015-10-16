package com.jugadores.comunio;

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
}
