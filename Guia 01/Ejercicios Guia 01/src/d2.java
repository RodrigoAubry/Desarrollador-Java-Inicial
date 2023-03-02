public class d2 {
    public static void main(String[] args) {
        float ingresoMensual = 500000;
        int cantidadVeiculos = 0;
        int inmuebles = 2;
        String embarc = "no";
        String aeronave ="no";
        String titularAS ="no";

        if(ingresoMensual>=489083||cantidadVeiculos>=3||inmuebles>=3||embarc=="si"||aeronave=="si"||titularAS=="si"){
            System.out.println("Pertenece al segmento de ingresos altos");
        }else{System.out.println("No pertenece al segmento de ingresos altos");}
    }
}
