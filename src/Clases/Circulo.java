package Clases;

public class Circulo extends FiguraGeo implements Animable{

    private double radio;

    Circulo (String id, double radio){
        super(id);

        this.radio = radio;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro(){
        return 2 * Math.PI * radio;
    }

    @Override
    public void mover(){
        System.out.printf("Mira como me muevo para ser un círculo\n");
    }
}
