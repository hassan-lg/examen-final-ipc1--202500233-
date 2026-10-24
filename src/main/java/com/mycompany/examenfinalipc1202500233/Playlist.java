package com.mycompany.examenfinalipc1202500233;

public class Playlist {
    private NodoDoble cabeza;
    private NodoDoble cola;
    private NodoDoble actual;
    private int tamanio;
    public Playlist(){
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
        this.tamanio = 0;
    }
    public void agregarCancion(Cancion c){
        NodoDoble nuevoNodo = new NodoDoble(c);
        if (cabeza == null){
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            actual = nuevoNodo;
        } else{
                cola.siguiente = nuevoNodo;
                nuevoNodo.anterior = cola;
                cola = nuevoNodo;
                
        }
        tamanio++;
    }
    public void mostrarPlaylist(){
        if (cabeza == null) {
            System.out.println("La playlist está vacía.");
            return;
        }

        System.out.println("Playlist con " + tamanio + " canciones");
        NodoDoble auxiliar = cabeza;
        
        while (auxiliar != null) {
            
            auxiliar.dato.reproducir(); 
            auxiliar = auxiliar.siguiente; 
        }
    }
}
