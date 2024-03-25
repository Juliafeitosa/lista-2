//9. Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor Cde acordo com as seguintes regras:a.
// Os elementos das posições pares de C são os elementos das posições pares de A;b.
//Os elementos das posições ímpares de C são os elementos das posições ímpares de B


import java.util.Scanner;


public class Ex9 {
    public static void main(String[] args) {
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


        int[] vetorC = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) { // Posição par
                vetorC[i] = vetorA[i];
            } else { // Posição ímpar
                vetorC[i] = vetorB[i];
            }
        }


        System.out.println("Vetor C:");
        System.out.println(Arrays.toString(vetorC));
    }
}
