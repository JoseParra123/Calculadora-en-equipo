import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Escribe el primer número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Escribe el segundo número: ");
        double num2 = teclado.nextDouble();

        System.out.println("Multiplicación: " + (num1 * num2));

        if (num2 != 0) {
            System.out.println("División: " + (num1 / num2));
        } else {
            System.out.println("No se puede dividir entre cero.");
        }

        teclado.close();
    }
}