//3. Faça um programa que leia em um vetor uma sequência finita de números digitadospelo usuário.
//Crie um segundo vetor que armazene o dobro de cada número doprimeiro vetor e depois apresente os valores deste vetor.


import java.util.Scanner;


public class Ex3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor1 = new int[tamanho];

        System.out.println("Digite os números para o primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
        }




        int[] vetor2 = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = vetor1[i] * 2;
        }




        System.out.println("Valores do segundo vetor (dobro dos valores do primeiro vetor):");
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Posição " + i + ": " + vetor2[i]);
        }
    }
}
