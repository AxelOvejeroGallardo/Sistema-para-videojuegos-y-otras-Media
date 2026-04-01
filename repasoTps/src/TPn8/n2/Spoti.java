package TPn8.n2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Spoti implements iReproduccion{
    ArrayList <Cancion> album = new ArrayList<>();

    @Override
    public String reproducir(int pos) {
        if(album.get(pos).getInvitado() != null){
            return "Cancion reproduciendo: " + album.get(pos).getNombreCancion() +
                    " nombre album: " + album.get(pos).getAlbum().getTitulo() +
                    " genero: " + album.get(pos).getGenero() +
                    " artista principal: " + album.get(pos).getAlbum().getPrincipal() +
                    " artista invitado: " + album.get(pos).getInvitado();
        }else {
            return "Cancion reproduciendo: " + album.get(pos).getNombreCancion() +
                    " nombre album: " + album.get(pos).getAlbum().getTitulo() +
                    " genero: " + album.get(pos).getGenero() +
                    " nombre artista:" + album.get(pos).getAlbum().getPrincipal();
        }
    }

    @Override
    public void aniadirCancion(Cancion cancion) {
        album.add(cancion);
    }

    @Override
    public boolean eliminarCancion(){
        int i = 0;
        for(Cancion cancion : album){
            System.out.println(i);
            System.out.println(cancion.getNombreCancion());
            i++;
        }
        System.out.println("Ingrese una posicion para eliminar");
        Scanner sk = new Scanner(System.in);
        int pos = sk.nextInt();
        return (album.remove(pos)!= null);
    }
    @Override
    public String verMiLista() {
        return album.toString();
    }


}
