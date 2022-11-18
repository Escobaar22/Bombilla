public class Bombilla {
    private boolean estado;
    private int potencia;
    private String color;
    private float horas;

    public Bombilla (Bombilla b){
        this.estado=b.estado;
        this.potencia=b.potencia;
        this.color=b.color;
        this.horas=b.horas;
    }
    public Bombilla (String color, int potencia){
        this.color=color;
        this.horas=10;
        this.potencia=potencia;
        this.estado=false;
    }
    public Bombilla (boolean estado, float horas){
        this.estado=estado;
        if(horas>0 && horas<=10){
            this.estado=true;
        } else {
            this.estado=false;
        }
    }

}
