import java.util.Scanner;

public class MenuFinal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while(opcion != 4){

            System.out.println("\n--- MENU ---");
            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Restar dos numeros");
            System.out.println("3. Multiplicar dos numeros");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");

            opcion = sc.nextInt();

            switch(opcion){

                case 1:
                    System.out.println("Ingresa el primer numero:");
                    int a = sc.nextInt();

                    System.out.println("Ingresa el segundo numero:");
                    int b = sc.nextInt();

                    System.out.println("Resultado: " + (a + b));
                    break;

                case 2:
                    System.out.println("Ingresa el primer numero:");
                    int c = sc.nextInt();

                    System.out.println("Ingresa el segundo numero:");
                    int d = sc.nextInt();

                    System.out.println("Resultado: " + (c - d));
                    break;

                case 3:
                    System.out.println("Ingresa el primer numero:");
                    int e = sc.nextInt();

                    System.out.println("Ingresa el segundo numero:");
                    int f = sc.nextInt();

                    System.out.println("Resultado: " + (e * f));
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }

        sc.close();
    }
}