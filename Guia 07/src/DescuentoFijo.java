public class DescuentoFijo extends Descuento{

    //Constructor
    public DescuentoFijo(float bas, float des) {
        this.desc=des;
        this.base=bas;
    }

    //Metodos

    @Override
    protected void calcularDescuento() throws DescuentoSobre0Exception,DescuentoNegativoException{
        this.tp=(base-desc);
        if(base==0){
            throw new DescuentoSobre0Exception();
        }else{
            if(tp<0){
            throw new DescuentoNegativoException();
            }
        }

    }
}