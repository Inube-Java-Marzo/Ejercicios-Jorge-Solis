import java.util.Scanner;

public class ParOImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero entero:");
        int numero = sc.nextInt();

        // Verificamos si el numero es par o impar
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }

        // Verificamos si el numero es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El numero es positivo");
        } else if (numero < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }

        sc.close();
    }
}