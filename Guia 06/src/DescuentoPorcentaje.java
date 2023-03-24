public class DescuentoPorcentaje extends Descuento {

    //Constructor
    public DescuentoPorcentaje(float des) {
        this.desc=des;
    }

    //Metodos

    @Override
    protected float calcularDescuento(float base){
        float aux = (desc/100);
        return (base*aux);
       // this.tp= base-(base*aux);
    }
}
