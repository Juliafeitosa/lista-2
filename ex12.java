//12. Elabore um programa que leia um vetor de 12 elementos apresente na tela oproduto dos elementos
// pares positivos (desconsiderar o zero). Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840


import java.util.Scanner;


public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tamanho = 12;


        int[] vetor = new int[tamanho];


        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }


        int produto = 1;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] > 0 && vetor[i] % 2 == 0) {
                produto *= vetor[i];
            }
        }


        System.out.println("O produto dos elementos pares positivos é: " + produto);
    }
}

