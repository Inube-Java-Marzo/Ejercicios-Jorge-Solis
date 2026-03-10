import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(50) + 1;
        int intento = 0;
        int contador = 0;

        while(intento != numeroSecreto){

            System.out.println("Adivina el numero entre 1 y 50:");
            intento = sc.nextInt();

            contador++;

            if(intento < numeroSecreto){
                System.out.println("Un poco mas alto");
            } 
            else if(intento > numeroSecreto){
                System.out.println("Un poco mas bajo");
            } 
            else{
                System.out.println("Adivinaste el numero.");
            }
        }

        System.out.println("Numero de Intentos: " + contador);

        sc.close();
    }
}