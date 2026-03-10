import java.util.Scanner;

public class ContadorNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        int N = sc.nextInt();

        int suma = 0;

        for(int i = 1; i <= N; i++){
            System.out.println(i);
            suma = suma + i;
        }

        System.out.println("La suma total es: " + suma);

        sc.close();
    }
}