//5. Elabore um programa que leia 5 números do teclado e os armazene em um vetor.
//Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezesque o número n aparece no vetor.




import java.util.Scanner;


public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tamanho = 5;


        int[] vetor = new int[tamanho];


        System.out.println("Digite 5 números para o vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }


        System.out.print("Digite o número n: ");
        int n = scanner.nextInt();


        int quantidade = 0;
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == n) {
                quantidade++;
            }
        }


        System.out.println("O número " + n + " aparece " + quantidade + " vezes no vetor.");
    }
}

