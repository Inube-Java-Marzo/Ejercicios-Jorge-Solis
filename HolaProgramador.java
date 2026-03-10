import java.util.Scanner;

public class HolaProgramador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        String nombre = sc.nextLine();

        System.out.println("Escribe tu edad:");
        int edad = sc.nextInt();

        int nacimiento = 2026 - edad;

        System.out.println("Hola, " + nombre + ". Tienes " + edad + " años. ¡Bienvenido a Java!");
        System.out.println("Naciste en el año " + nacimiento);
    }
}