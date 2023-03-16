abstract class Descuento {

    //Atrivutos
    float tp;
    protected float desc;
    protected float base;

    //Metodos

    public float getTp() {
        return tp;
    }

    protected abstract void calcularDescuento();
}