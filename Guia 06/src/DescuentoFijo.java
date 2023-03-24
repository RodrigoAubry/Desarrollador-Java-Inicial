public class DescuentoFijo extends Descuento {

    //Constructor
    public DescuentoFijo(float des) {
        this.desc = des;
    }

    //Metodos

    @Override
    protected float calcularDescuento(float base) {
        return desc;
    }
}

