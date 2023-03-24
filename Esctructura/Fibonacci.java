package Esctructura;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public List<Integer> generarSecuencia() {
        List<Integer> secuencia = new ArrayList<>();
        int a = 0;
        int b = 1;

        while (b <= 1400000) {
            secuencia.add(b);
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
        return secuencia;
    }
}