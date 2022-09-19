package Clases;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaFiguras implements Iterable<FiguraGeo>{

    private static ArrayList<FiguraGeo> lista;

    private static ListaFiguras instance;

    private ListaFiguras(){
        lista = new ArrayList<FiguraGeo>();
    }

    public static ListaFiguras getInstance(){

        if(instance == null){
            instance = new ListaFiguras();
        }

        return instance;

    }

    public static void anyadirFigura(FiguraGeo figu){
        lista.add(figu);
    }

    public static FiguraGeo obtenerFigura(int i){
        return lista.get(i);
    }

    public static int size(){
        return lista.size();
    }

    @Override
    public Iterator iterator() {
        return lista.iterator();
    }


}
