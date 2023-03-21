public class DescuentoFijo extends Descuento{

    //Constructor
    public DescuentoFijo(float bas, float des) {
        this.desc=des;
        this.base=bas;
    }

    //Metodos

    @Override
    protected void calcularDescuento() throws DescuentoSobre0Exception {
        if(base==0){
            throw new DescuentoSobre0Exception();
        }
        this.tp=(base-desc);
    }
}