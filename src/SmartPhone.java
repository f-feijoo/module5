public class SmartPhone extends SmartDevice{
    boolean traeAccesorios;
    String companiaServicio;

    public SmartPhone(){};

    public SmartPhone(boolean traeAccesorios, String companiaServicio, String so, int tamanioPantalla, String tipoPantalla, double precio, String marca, String modelo){
        super(so, tamanioPantalla, tipoPantalla, precio, marca, modelo);
        this.traeAccesorios = traeAccesorios;
        this.companiaServicio = companiaServicio;
    }
}
