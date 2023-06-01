public class SmartDevice {
    String so;
    int tamanioPantalla;
    String tipoPantalla;
    double precio;
    String marca;
    String modelo;

    public SmartDevice(){};

    public SmartDevice(String so, int tamanioPantalla, String tipoPantalla, double precio, String marca, String modelo){
        this.so = so;
        this.tamanioPantalla = tamanioPantalla;
        this.tipoPantalla = tipoPantalla;
        this.precio = precio;
        this.marca = marca;
        this.modelo = modelo;
    };
}
