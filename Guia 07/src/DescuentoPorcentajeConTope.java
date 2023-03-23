public class DescuentoPorcentajeConTope extends Descuento {
    //Atributos
    float tope;

    //Constructor

    public DescuentoPorcentajeConTope(float bas,float top) {
        this.base=bas;
        this.tope=top;
    }

    //Metodos
    @Override
    protected void calcularDescuento() throws DescuentosException{
        float aux = (tope/100);
        this.tp= base-(base*aux);
        if(base==0 || tp<0){
            throw new DescuentosException(base,tp);
        }
    }
}