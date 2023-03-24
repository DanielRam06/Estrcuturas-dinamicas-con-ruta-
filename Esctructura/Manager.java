package Esctructura;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.File;
import java.nio.file.Paths;

public class Manager {
	  private List<Integer> numerosPares;
	    private List<Integer> numerosImpares;

	    private String obtenerRutaEscritorio() {
	        String rutaEscritorio = System.getProperty("user.home") + File.separator + "Desktop";
	        return rutaEscritorio;
	    }

	    public void guardarEnArchivo(String nombreArchivo, List<Integer> datos) {
	        String rutaEscritorio = obtenerRutaEscritorio();
	        String rutaArchivo = Paths.get(rutaEscritorio, nombreArchivo).toString();
	        try (FileWriter writer = new FileWriter(rutaArchivo)) {
	            for (Integer number : datos) {
	                writer.write(number.toString() + "\n");
	            }
	        } catch (IOException e) {
	            System.err.println("Error al guardar el archivo: " + e.getMessage());
	        }
	    }

	    public void ejecutar() {
	        Fibonacci fibonacci = new Fibonacci();
	        List<Integer> secuenciaFibonacci = fibonacci.generarSecuencia();

	        Splitter splitter = new Splitter();
	        numerosPares = splitter.obtenerNumerosPares(secuenciaFibonacci);
	        numerosImpares = splitter.obtenerNumerosImpares(secuenciaFibonacci);

	        guardarEnArchivo("Nupares.txt", numerosPares);
	        guardarEnArchivo("Nuimpares.txt", numerosImpares);
	    }

	    public void imprimirArchivo(String filename) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
	            String linea;
	            while ((linea = reader.readLine()) != null) {
	                System.out.println(linea);
	            }
	        } catch (IOException e) {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	        }
	    }
	}