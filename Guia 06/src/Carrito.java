public class Carrito{

    //Atributos
    private float totalBas=0;
    private Producto[] productos;
    private float totalAPagar;

    //Constructor

    public Carrito(){
        this.productos=new Producto[3];
    }

    //Metodos

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public float getTotalBas() {
        return totalBas;
    }

    public void calcularTotalBase(){
        for (int n = 0; n<3; n++) {
            this.totalBas+=productos[n].getPrecioBase();
        }
    }
    public float totalAPagar(String args,float desc,float tope) {
        switch (args) {
            case "f":
                System.out.println("Hay descuento fijo de $"+desc);
                DescuentoFijo df = new DescuentoFijo(desc);
                totalAPagar= (totalBas - df.calcularDescuento(totalBas));
            break;
            case "p":
                if (tope < desc) {
                    System.out.println("Hay descuento del "+desc+"%");
                    DescuentoPorcentajeConTope dpct = new DescuentoPorcentajeConTope(tope);
                    totalAPagar= (totalBas-dpct.calcularDescuento(totalBas));
                } else {
                    System.out.println("Hay descuento del "+desc+"%");
                    DescuentoPorcentaje dp = new DescuentoPorcentaje(desc);
                    totalAPagar= (totalBas - dp.calcularDescuento(totalBas));
                }
                break;
        }
       return totalAPagar;
    }
}