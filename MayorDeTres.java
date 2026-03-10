import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero:");
        int num1 = sc.nextInt();

        System.out.println("Ingresa el segundo numero:");
        int num2 = sc.nextInt();

        System.out.println("Ingresa el tercer numero:");
        int num3 = sc.nextInt();

        int mayor = num1;

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        System.out.println("El numero mayor es: " + mayor);

        // Verificamos si hay números iguales
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Hay numeros iguales");
        } else {
            System.out.println("Todos los numeros son diferentes");
        }

        sc.close();
    }
}