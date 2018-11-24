public class PruebaPais {
    public static void main(String[] args) {
        //Descomentar para probar una vez resuelto
        PaisEuropeo espanya=new PaisEuropeo("España",1000);
        PaisEuropeo reinoUnido=new PaisEuropeo("Reino Unido",3000,"uk");

        espanya.aportar(3000);
        reinoUnido.aportar(5000);
        System.out.println("Hay " + PaisEuropeo.getFondoComun() + " en el fondo común");
        espanya.retirar(9000);
        System.out.println("Hay " + PaisEuropeo.getFondoComun() + " en el fondo común");
        System.out.println(espanya.getNombre() + " es de catagoría " + espanya.getCategoria());

        System.out.println("La media de la población de "+espanya.getNombre()+" y "+reinoUnido.getNombre()+" es: "+PaisEuropeo.mediaPoblacion(espanya, reinoUnido));

    }
}
