package myaoutlet;


import myaoutlet.modelo.Computadora;
import myaoutlet.modelo.Monitor;
import myaoutlet.modelo.Raton;
import myaoutlet.modelo.Teclado;
import myaoutlet.servicio.Orden;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        //crear objetos
        Raton ratonLenovo = new Raton("USB", "Lenovo");
        //System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");
        //System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("Lenovo", 24);
        //System.out.println(monitorLenovo);

        //creamos un objeto computadora
        Computadora computadoraLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        //System.out.println(computadoraLenovo);

        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("USB", "Dell");
        Raton ratonDell = new Raton("USB", "Dell");
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        Monitor monitorMac = new Monitor("Apple", 13);
        Teclado tecladoMac = new Teclado("BT", "Apple");
        Raton ratonMac = new Raton("BT", "Apple");
        Computadora computadoraMac = new Computadora("Macbook 13 pulgadas", monitorMac, tecladoMac, ratonMac);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraLenovo);
        orden1.agregarComputadora(computadoraDell);
        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(computadoraMac);
        orden2.agregarComputadora(computadoraDell);
        orden2.agregarComputadora(computadoraLenovo);
        System.out.println();
        orden2.mostrarOrden();
    }
}
