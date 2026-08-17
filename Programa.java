import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== CALCULADORA =====");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        System.out.print("Elige una operación: ");
        int opcion = scanner.nextInt();

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (opcion == 1) {
            System.out.println("Resultado: " + SumaResta.suma(numero1, numero2));

        } else if (opcion == 2) {
            System.out.println("Resultado: " + SumaResta.resta(numero1, numero2));

        } else if (opcion == 3) {
            System.out.println("Resultado: " +
                    MultiplicacionDivision.multiplicacion(numero1, numero2));

        } else if (opcion == 4) {
            System.out.println("Resultado: " +
                    MultiplicacionDivision.division(numero1, numero2));

        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}


