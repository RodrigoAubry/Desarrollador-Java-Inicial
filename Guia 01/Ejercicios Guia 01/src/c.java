public class c {
    public static void main(String[] args) {
        int numeroInicio = 5;
        int numeroFin = 14;
        String pi ="Par";
        while (numeroInicio <= numeroFin) {
            if(pi.equals("Par")) {
                if (numeroInicio % 2 == 0) {
                    System.out.println(numeroInicio);
                }
            }else{if(numeroInicio % 2 !=0) {
                System.out.println(numeroInicio);
            }
            }
            numeroInicio++;
        }
    }
}
