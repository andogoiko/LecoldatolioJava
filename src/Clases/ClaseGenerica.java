package Clases;

public class ClaseGenerica<ALGO, OTROALGO> {
    private ALGO obj1;
    private  OTROALGO obj2;

    public ClaseGenerica(ALGO obj1, OTROALGO obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public ALGO getObj1() {
        return obj1;
    }

    public void setObj1(ALGO obj1) {
        this.obj1 = obj1;
    }

    public OTROALGO getObj2() {
        return obj2;
    }

    public void setObj2(OTROALGO obj2) {
        this.obj2 = obj2;
    }
}
