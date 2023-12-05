package myaoutlet;


import myaoutlet.modelo.Monitor;
import myaoutlet.modelo.Raton;
import myaoutlet.modelo.Teclado;

public class Main {
    public static void main(String[] args) {
        //crear objetos
        Raton ratonLenovo = new Raton("USB", "Lenovo");
        System.out.println(ratonLenovo);

        Teclado tecladoLenovo = new Teclado("USB", "Lenovo");
        System.out.println(tecladoLenovo);

        Monitor monitorLenovo = new Monitor("HDMI", 24);
        System.out.println(monitorLenovo);

        }
    }
