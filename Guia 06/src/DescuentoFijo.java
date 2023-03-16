public class DescuentoFijo extends Descuento{
    public DescuentoFijo(float bas, float des) {
        this.desc=des;
        this.base=bas;
    }

    //Metodos

    @Override
    protected void calcularDescuento(){
        this.tp=(base-desc);
    }
}

