public class DescuentoPorcentajeConTope extends Descuento {
    //Atributos
    float tope;

    //Constructor

    public DescuentoPorcentajeConTope(float top) {
        this.tope=top;
    }

    //Metodos
    @Override
    protected float calcularDescuento(float base){
        float aux = (tope/100);
        return (base*aux);
     //   this.tp= base-(base*aux);
    }
}