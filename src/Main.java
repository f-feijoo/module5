public class Main {
    public static void main(String[] args) {
        SmartPhone iphone11 = new SmartPhone(true, "Movistar", "iOs", 6, "AMOLED", 650, "Apple", "Iphone 11");
        System.out.println(iphone11.traeAccesorios);
        System.out.println(iphone11.companiaServicio);
        System.out.println(iphone11.so);
        System.out.println(iphone11.tamanioPantalla);
        System.out.println(iphone11.tipoPantalla);
        System.out.println(iphone11.precio);
        System.out.println(iphone11.marca);
        System.out.println(iphone11.modelo);

        SmartWatch iwatch = new SmartWatch("negro", "Circular", "iOs", 2, "AMOLED", 250, "Apple", "iWatch 6");
        System.out.println(iwatch.colorMalla);
        System.out.println(iwatch.forma);
        System.out.println(iwatch.so);
        System.out.println(iwatch.tamanioPantalla);
        System.out.println(iwatch.tipoPantalla);
        System.out.println(iwatch.precio);
        System.out.println(iwatch.marca);
        System.out.println(iwatch.modelo);
    }
}