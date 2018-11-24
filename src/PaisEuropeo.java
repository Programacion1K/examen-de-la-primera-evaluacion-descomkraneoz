public class PaisEuropeo {

    private final String nombre;
    private int poblacion;
    private final String dominio;

    private static int cantidadRetirada;
    private static int cantidadAportada;




    public PaisEuropeo(String nombre, int poblacion, String dominio) {
        this.nombre = nombre;
        this.poblacion = poblacion;
        this.dominio = dominio;
    }

    public PaisEuropeo(String nombre, int poblacion) {
        this.nombre=nombre;
        this.poblacion=poblacion;
        dominio=nombre.substring(0,2).toLowerCase();
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoblacion() {
        return poblacion;
    }


    public int aportar(int cantidad) {
        cantidadAportada=cantidadAportada+cantidad;
        return cantidadAportada;
    }


    public int retirar(int cantidad) {
        cantidadRetirada=cantidadRetirada+cantidad;
        return cantidadRetirada;
    }

    public static int getFondoComun() {
        int saldo;
        saldo=PaisEuropeo.cantidadAportada-PaisEuropeo.cantidadRetirada;
        return saldo;
    }


    public String getCategoria() {
       int saldo=getFondoComun();

        if (saldo>100000){
           return "A";
       }
       else if(saldo>=0 && saldo<=100000){
           return "B";
       }else {
           return "C";
       }
    }

    public static double mediaPoblacion(PaisEuropeo p, PaisEuropeo q) {
        int suma=p.getPoblacion()+q.getPoblacion();

        return suma/2.0;
    }

}
