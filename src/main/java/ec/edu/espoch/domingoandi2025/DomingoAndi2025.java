
package ec.edu.espoch.domingoandi2025;

import Clases.Calculadora;
import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class DomingoAndi2025 {

    public static void main(String[] args) {
        Calculadora objCalculadora = new Calculadora();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("MENÚ CALCULADORA ---");
            System.out.println("1. Sumar un número");
            System.out.println("2. Deshacer última operación");
            System.out.println("3. Rehacer última operación deshecha");
            System.out.println("4. Mostrar resultados Actual");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Sumar");
                    objCalculadora.Suma(5);
                    objCalculadora.Suma(15);
                    break;

                case 2:
                    System.out.println("DesHacer");
                    objCalculadora.desHacer();
                    break;

                case 3:
                    System.out.println("Reahacer");
                    objCalculadora.reHacer();
                    break;

                case 4:
                    System.out.println("Mostrar Resultado final");
                    objCalculadora.Suma(10);
                    break;
                case 5:
                    System.out.println("Gracias por utilizar este sistema");
                    break;
             default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
  
      