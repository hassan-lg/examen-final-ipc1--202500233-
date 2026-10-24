package com.mycompany.examenfinalipc1202500233;


public class Cancion extends Multimedia{
    private String artista;
    public Cancion(String titulo, int duracion, String artista) {
        super(titulo, duracion);
        this.artista = artista;
        
    }
    @Override 
    public void reproducir (){
        System.out.println("Reproduciendo");
    }
}

