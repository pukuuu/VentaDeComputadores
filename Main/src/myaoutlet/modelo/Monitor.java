package myaoutlet.modelo;

public class Monitor {
    private final int idMonitor;
    private String marca;
    private double tamanno;
    private static int contadorMonitores;

    private Monitor() {
        idMonitor = ++contadorMonitores;
    }

    public Monitor(String marca, double tamanno){
        this();
        this.marca = marca;
        this.tamanno = tamanno;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor= " + idMonitor +
                ", marca=' " + marca + '\'' +
                ", tamanno=' " + tamanno + '\'' +
                " }";
    }
}
