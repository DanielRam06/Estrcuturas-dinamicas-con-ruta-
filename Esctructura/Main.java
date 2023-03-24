package Esctructura;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
	        Manager manager = new Manager();
	        manager.ejecutar();
	        
//extra para poder ver que se guardo en los archivos
	        System.out.println("Seleccione una opción:");
	        System.out.println("1. Imprimir números pares");
	        System.out.println("2. Imprimir números impares");
	        System.out.print("Opción: ");
	        Scanner scanner = new Scanner(System.in);
	        int opcion = scanner.nextInt();

	        switch (opcion) {
	            case 1:
	                manager.imprimirArchivo("Nupares.txt");
	                break;
	            case 2:
	                manager.imprimirArchivo("Nuimpares.txt");
	                break;
	            default:
	                System.out.println("Opción inválida");
	        }

	        scanner.close();
	    }
	}