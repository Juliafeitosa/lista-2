//10. Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copieos elementos de A em B de forma invertida.
// Ou seja, o primeiro elemento de A é oúltimo elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assimpor diante.


import java.util.Scanner;


public class Ex10 {
    public static void for(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int tamanho = 5;


        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];


 
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetorA[i] = scanner.nextInt();
        }


        for (int i = 0; i < tamanho; i++) {
            vetorB[i] = vetorA[tamanho - 1 - i];
        }


        System.out.println("Vetor A: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
       
        System.out.println("Vetor B (cópia de A invertida): ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}

