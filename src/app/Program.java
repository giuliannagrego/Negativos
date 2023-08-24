package app;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vet = new int[n];

        System.out.println();
        System.out.println("Digite em números inteiros, que estejam entre -10 à 10: ");

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vet[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Números negativos: ");

        for (int j : vet) {
            if (j < 0 && j >= -10) {
                System.out.println(j);
            }
        }

        sc.close();
    }
}