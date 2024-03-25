// 1Construa um programa que leia em um vetor uma sequência de 5 números digitadospelo usuário,
// calcule a média e apresente na tela quais valores são menores, iguaisou superiores à média.


import java.util.Scanner;


public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[5];
        double soma = 0;

        System.out.println("Digite 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }


        double media = soma / 5;
        System.out.println("Média: " + media);




        System.out.println("Valores menores que a média:");
        for (int num : vetor) {
            if (num < media) {
                System.out.println(num);
            }
        }


        System.out.println("Valores iguais à média:");
        for (int num : vetor) {
            if (num == media) {
                System.out.println(num);
            }
        }


        System.out.println("Valores superiores à média:");
        for (int num : vetor) {
            if (num > media) {
                System.out.println(num);
            }
        }
    }
}
