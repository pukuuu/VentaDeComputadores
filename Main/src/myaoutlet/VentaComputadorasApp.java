package myaoutlet;


import myaoutlet.modelo.Computadora;
import myaoutlet.modelo.Monitor;
import myaoutlet.modelo.Raton;
import myaoutlet.modelo.Teclado;

public class VentaComputadorasApp {
    public static void main(String[] args) {
        //crear objetos
        Raton ratonLenovo = new Raton("USB", "Lenovo");
        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");
        System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("Lenovo", 24);
        System.out.println(monitorLenovo);

        //creamos un objeto computadora
        Computadora computadora = new Computadora("Computadora Lenovo", monitorLenovo, tecladoLenovo, ratonLenovo);
        System.out.println(computadora);

    }
}
