
package multiplicacionfor;

import java.util.Scanner;

public class MultiplicacionFor {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero para generar la tabla de multiplicacion: ");
        int numero = scanner.nextInt();

        System.out.println("Tabla de multiplicación para " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}