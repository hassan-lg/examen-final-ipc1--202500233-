package com.mycompany.examenfinalipc1202500233;

public abstract class Multimedia {
    private String titulo;
    private int duracion;
    
    public Multimedia(String titulo, int duracion){
        this.titulo = titulo;
        this.duracion = duracion;
    }
    public abstract void reproducir();
    
}
