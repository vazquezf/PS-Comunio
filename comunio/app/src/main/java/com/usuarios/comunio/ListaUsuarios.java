package com.usuarios.comunio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Dany on 16/10/2015.
 */
public class ListaUsuarios implements Serializable{
    private ArrayList<aUsuario> users;


    public ListaUsuarios (){
        this.users = new ArrayList();
    }

    public ArrayList<aUsuario> getUsers(){
        return this.users;
    }

    public void setUsers(ArrayList<aUsuario> users){
        this.users = users;
    }
    public boolean add (aUsuario usr){
        return this.users.add(usr);
    }

    public Object[] toArray() {
        return users.toArray();
    }

    public void clear() {
        users.clear();
    }

    public void ensureCapacity(int minimumCapacity) {
        users.ensureCapacity(minimumCapacity);
    }

    public void trimToSize() {
        users.trimToSize();
    }

    public aUsuario set(int index, aUsuario object) {
        return users.set(index, object);
    }

    public boolean removeAll(Collection<?> collection) {
        return users.removeAll(collection);
    }

    public boolean containsAll(Collection<?> collection) {
        return users.containsAll(collection);
    }

    public boolean contains(Object object) {
        return users.contains(object);
    }

    public Iterator<aUsuario> iterator() {
        return users.iterator();
    }

    public <T> T[] toArray(T[] contents) {
        return users.toArray(contents);
    }

    public boolean retainAll(Collection<?> collection) {
        return users.retainAll(collection);
    }

    public int size() {
        return users.size();
    }

    public aUsuario get(int index) {
        return users.get(index);
    }

    public int indexOf(Object object) {
        return users.indexOf(object);
    }

    public boolean isEmpty() {
        return users.isEmpty();
    }

    public List<aUsuario> subList(int start, int end) {
        return users.subList(start, end);
    }

    public ListIterator<aUsuario> listIterator(int location) {
        return users.listIterator(location);
    }

    public int lastIndexOf(Object object) {
        return users.lastIndexOf(object);
    }

    public aUsuario remove(int index) {
        return users.remove(index);
    }

    public boolean remove(Object object) {
        return users.remove(object);
    }

    public boolean addAll(int index, Collection<? extends aUsuario> collection) {
        return users.addAll(index, collection);
    }

    public ListIterator<aUsuario> listIterator() {
        return users.listIterator();
    }

    public boolean addAll(Collection<? extends aUsuario> collection) {
        return users.addAll(collection);
    }

    public aUsuario findUser(Usuario usuario){
        Iterator<aUsuario> iter = this.users.iterator();
        boolean encontrado = false;
        aUsuario userAux;
        aUsuario foundUser = null;
        while(iter.hasNext() && (!encontrado)){
            userAux = iter.next();
            if(usuario.equals(userAux)){
               foundUser = userAux;
                encontrado = true;
            }
        }
        return foundUser;
    }
}
