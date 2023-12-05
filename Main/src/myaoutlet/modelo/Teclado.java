package myaoutlet.modelo;

public class Teclado extends DispositivoEntrada{
    public Teclado(String tipoDeEntrada, String marca) {
        super(tipoDeEntrada, marca);
        idTeclado = ++contadorTeclado;
    }

    private final int idTeclado;
    private static int contadorTeclado;


    @Override
    public String toString() {
        return "Teclado{"+
                "idTeclado= " + idTeclado +
                " }" + super.toString();
    }
}
