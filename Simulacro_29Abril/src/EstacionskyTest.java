import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)

public class EstacionskyTest {

    private int numeroPistas;
    private int numeroEsquiadores;
    private String nombreEstacion;
    private int totalEsperado;

    public EstacionskyTest(int numeroPistas, int numeroEsquiadores, String nombreEstacion, int totalEsperado) {
        this.numeroPistas = numeroPistas;
        this.numeroEsquiadores = numeroEsquiadores;
        this.nombreEstacion = nombreEstacion;
        this.totalEsperado = totalEsperado;
    }

    @Parameterized.Parameters

    public static Collection<Object []> datosCollection () {
        return Arrays.asList(new Object [][] {
                {4, 5, "BaldeSky", 250},
                {5, 7, "Binaes", 350},
                {2, 6, "Madrid", 300},
                {6, 10, "Solaris", 500}
        });
    }


@Test

public void testCalcularTotal() {
    Estacionsky estacion= new
            Estacionsky(numeroPistas,numeroEsquiadores,nombreEstacion);
    int totalFinalCalculado = estacion.calcularRecaudado();
    assertEquals("La prueba es erronea",totalEsperado, totalFinalCalculado);
}

}