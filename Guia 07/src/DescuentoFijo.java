public class DescuentoFijo extends Descuento{

    //Constructor
    public DescuentoFijo(float bas, float des) {
        this.desc=des;
        this.base=bas;
    }

    //Metodos

    @Override
    protected void calcularDescuento() throws DescuentosException{
        this.tp=(base-desc);
        if(base==0 || tp<0){
            throw new DescuentosException(base);
        }
    }
}