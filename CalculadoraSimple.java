import java.util.Scanner;

public class CalculadoraSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el primer numero:");
        double num1 = sc.nextDouble();

        System.out.println("Ingresa el segundo numero:");
        double num2 = sc.nextDouble();

        System.out.println("\nElige una operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");

        int opcion = sc.nextInt();

        switch(opcion) {

            case 1:
                System.out.println("Resultado: " + (num1 + num2));
                break;

            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;

            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;

            case 4:
                if(num2 == 0){
                    System.out.println("Error: no se puede dividir entre 0");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;

            default:
                System.out.println("Opcion no valida");
        }

        sc.close();
    }
}