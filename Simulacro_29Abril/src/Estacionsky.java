public class Estacionsky {

    private int numeroPistas;
    private int numeroEsquiadores;
    private String nombreEstacion;

    public Estacionsky(int numeroPistas, int numeroEsquiadores, String nombreEstacion) {
        this.numeroPistas = numeroPistas;
        this.numeroEsquiadores = numeroEsquiadores;
        this.nombreEstacion = nombreEstacion;
    }

    public Estacionsky() {

    }

    public int calcularRecaudado(){


        return 50 * this.numeroEsquiadores;
    }
}
