package com.mycompany.examenfinalipc1202500233;

public class ExamenFinalipc1202500233 {

    public static void main(String[] args) {
        Multimedia cancion1 = new Cancion("Song 2", 180, "Blur");
        Multimedia cancion2 = new Cancion("Lady", 180, "Modjo");
        Multimedia cancion3 = new Cancion("Broken", 180, "Blur");
        Playlist miPlaylist = new Playlist();
        miPlaylist.agregarCancion(cancion1);
        miPlaylist.agregarCancion(cancion2);
        miPlaylist.agregarCancion(cancion3);
        
        miPlaylist.mostrarPlaylist();
    }
}
