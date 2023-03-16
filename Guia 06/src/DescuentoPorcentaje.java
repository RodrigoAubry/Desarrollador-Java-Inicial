public class DescuentoPorcentaje extends Descuento {
    public DescuentoPorcentaje(float bas, float des) {
        this.base=bas;
        this.desc=des;
    }

    //Metodos

    @Override
    protected void calcularDescuento(){
        float aux = (desc/100);
        this.tp= base*aux;
    }
}
