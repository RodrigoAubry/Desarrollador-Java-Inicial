public class DescuentoPorcentaje extends Descuento {

    //Constructor
    public DescuentoPorcentaje(float bas, float des) {
        this.base=bas;
        this.desc=des;
    }

    //Metodos

    @Override
    protected void calcularDescuento()throws DescuentoSobre0Exception,DescuentoNegativoException{
        float aux = (desc/100);
        this.tp= base-(base*aux);
        if(base==0){
            throw new DescuentoSobre0Exception();
        }else {
            if (tp<0){
                throw new DescuentoNegativoException();
            }
        }

    }
}