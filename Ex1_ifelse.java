
// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
import java.util.Scanner;

public class Ex1_ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        if (valor >= 0) {
            System.out.println("O valor é positivo!");

        } else {
            System.out.println("O valor é negativo!");

        }

        sc.close();

    }

}