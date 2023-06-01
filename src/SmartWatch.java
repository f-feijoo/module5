public class SmartWatch extends SmartDevice{
    String colorMalla;
    String forma;

    public SmartWatch(){};

    public SmartWatch(String colorMalla, String forma, String so, int tamanioPantalla, String tipoPantalla, double precio, String marca, String modelo){
        super(so, tamanioPantalla, tipoPantalla, precio, marca, modelo);
        this.colorMalla = colorMalla;
        this.forma = forma;
    };
}
