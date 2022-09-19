package Clases;

public abstract class FiguraGeo {

    private String id;

    public FiguraGeo(String id){
        this.id = id;
    }

    public abstract double area();

    public abstract double perimetro();

    public String getId(){
        return id;
    }
}
