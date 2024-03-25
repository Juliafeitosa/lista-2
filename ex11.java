//11. Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteirosde tamanho igual a 5.
//Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 +8*9 = 140


import java.util.Scanner;


public class Ex11 {
    public static void veotres(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;


        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];


        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scanner.nextInt();
        }


        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetorB[i] = scanner.nextInt();
        }


        int produtoEscalar = 0;
        for (int i = 0; i < tamanho; i++) {
            produtoEscalar += vetorA[i] * vetorB[i];
        }


        System.out.println("O produto escalar entre os vetores A e B é: " + produtoEscalar);
    }
}

