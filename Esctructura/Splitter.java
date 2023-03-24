package Esctructura;
import java.util.ArrayList;
import java.util.List;

public class Splitter {

    public List<Integer> obtenerNumerosPares(List<Integer> numeros) {
        List<Integer> numerosPares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }
        }
        return numerosPares;
    }

    public List<Integer> obtenerNumerosImpares(List<Integer> numeros) {
        List<Integer> numerosImpares = new ArrayList<>();
        for (Integer numero : numeros) {
            if (numero % 2 != 0) {
                numerosImpares.add(numero);
            }
        }
        return numerosImpares;
    }
}
