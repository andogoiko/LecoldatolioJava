package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Principal {

    public static void main (String[] args){

        //instanciamos un objeto random

        Random random = new Random();

        //ListaFiguras lista = new ListaFiguras();

        ListaFiguras lista = ListaFiguras.getInstance();


        for (int x = 0; x < 150; x++){

            Rectangulo rect = new Rectangulo("Rectángulo", random.nextDouble() * 100, random.nextDouble() * 100);

            lista.anyadirFigura(rect);

            double areaRect = Math.round(rect.area() * 100.00) / 100.00;
            double perimetroRect = Math.round(rect.perimetro() * 100.00) / 100.00;

        }

        for (int x = 0; x < 150; x++){

            Triangulo trian = null;

            try {

                trian = new Triangulo("Triángulo", random.nextDouble() * 100, random.nextDouble() * 100, random.nextDouble() * 100);

                lista.anyadirFigura(trian);

                double areaTri = Math.round(trian.area() * 100.00) / 100.00;
                double perimetroTri = Math.round(trian.perimetro() * 100.00) / 100.00;

                //System.out.printf("Triangulo Nº%d:, superficie: %.2f, perimetro: %.2f\n", x, areaTri,perimetroTri);

            }catch (Exception e){
                //System.out.printf(e.getMessage());

                //si peta que salte al siguiente bucle

                continue;
            }

        }

        for (int x = 0; x < 150; x++){

            Circulo circ = new Circulo("Círculo", random.nextDouble() * 100);

            lista.anyadirFigura(circ);

            double areacirc = Math.round(circ.area() * 100.00) / 100.00;
            double perimetrocirc = Math.round(circ.perimetro() * 100.00) / 100.00;

            //System.out.printf("Rectangulo Nº%d:, superficie: %.2f, perimetro: %.2f\n", x, areaRect,perimetroRect);
        }

        System.out.printf("Cantidad de objeto geométricos: %s", lista.size());

        /*for (int x = 0; x < lista.size(); x++){
            FiguraGeo obj = lista.get(x); // dispatching dinámico (al vuelo ve qué figura geometrica es e invoca el métido Overrideado)

            System.out.printf(" Nº%d:, superficie: %.2f, perimetro: %.2f\n", x, obj.area(), obj.perimetro());

        }*/

        lista.forEach(obj -> {
                System.out.printf("(Lista 1) Figura geométrica: %s, superficie: %.2f, perimetro: %.2f\n", obj.getId(), obj.area(), obj.perimetro());
                if((obj.getId() == "Rectángulo" ||obj.getId() == "Círculo") && obj instanceof Animable){
                     ((Animable) obj).mover();
                }
            }
        );

        ClaseGenerica<Integer, String> algo = new ClaseGenerica(1, "dos");
        ClaseGenerica<String, Integer> algo2 = new ClaseGenerica("uno", 2);

        ArrayList<ClaseGenerica> alGenerico = new ArrayList<>();
        alGenerico.add(algo);
        alGenerico.add(algo2);

    }


}
