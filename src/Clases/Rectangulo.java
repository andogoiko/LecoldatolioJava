package Clases;

public class Rectangulo extends FiguraGeo implements Animable{

    private double height, width;

    Rectangulo(String id, double height, double width){
        super("Rectángulo");

        this.height = height;
        this.width =width;
    }

    @Override
    public double area(){
        return height *  width;
    }

    @Override
    public double perimetro(){
        return 2 * height + 2 * width;
    }

    @Override
    public void mover(){
        System.out.printf("Mira como me muevo para ser un rectángulo\n");
    }

    //System.out.println("sabías que esto es un rectánculo");
}
