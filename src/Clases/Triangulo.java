package Clases;

public class Triangulo extends FiguraGeo{
    private double lado1, lado2, lado3;



    Triangulo(String id, double lado1, double lado2, double lado3) throws Exception{

        super("Triángulo");

        if(!check(lado1, lado2, lado3)){

            throw new Exception("Medidas de lados inorrectos, no se trata de un triángulo\n");

        }

        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;

    }

    private boolean check(double lado1, double lado2, double lado3){
        if((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2 || (lado2 + lado3) <= lado1){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public double area(){
        double semiperimetro = perimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    @Override
    public double perimetro(){
        return lado1 + lado2 + lado3;
    }
}
