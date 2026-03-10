import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int contador = 0;
        String respuesta = "si";

        while(respuesta.equals("si")) {

            System.out.println("Ingresa un numero:");
            int numero = sc.nextInt();

            suma = suma + numero;
            contador++;

            System.out.println("¿Quieres ingresar otro numero? (si/no)");
            respuesta = sc.next();
        }

        System.out.println("La suma total es: " + suma);
        System.out.println("Ingresaste " + contador + " numeros.");

        sc.close();
    }
}