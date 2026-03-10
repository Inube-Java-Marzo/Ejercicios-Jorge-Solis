import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int numero = sc.nextInt();

        System.out.println("¿Hasta que numero quieres la tabla?");
        int limite = sc.nextInt();

        for(int i = 1; i <= limite; i++){
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        sc.close();
    }
}