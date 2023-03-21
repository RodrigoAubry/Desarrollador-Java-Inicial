abstract class Descuento  {

    //Atrivutos
    protected float tp;
    protected float desc;
    protected float base;

    //Metodos

    public float getTp() {
        return tp;
    }

    protected abstract void calcularDescuento() throws DescuentoSobre0Exception;
}