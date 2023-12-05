package myaoutlet.modelo;

public class Raton extends DispositivoEntrada{

    public Raton(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idRaton = ++contadorRatones;
    }

    private final int idRaton;
    private static int contadorRatones;

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton +
                '}' + super.toString();
    }
}
