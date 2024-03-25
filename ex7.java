//7. Faça um programa que leia dois vetores de 5 elementos cada e verifique se elessão iguais ou não.
//Para serem iguais, todos os elementos dos dois vetores devemcoincidir


import java.util.Scanner;


public class Ex7 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tamanho = 5;




        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];


        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }


        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }


        boolean iguais = true;
        for (int i = 0; i < tamanho; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }


        if (iguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }
    }
}

