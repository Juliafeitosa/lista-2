//6. Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetorcom 5 pesos e calcule a média ponderada do aluno.
//Média ponderada = nota1 * peso1 + nota2 * peso2 + nota3 * peso3peso1 + peso2 + peso3


import java.util.Scanner;


public class Ex6 {
    public static void mediaPonderada(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tamanho = 5;


        double[] notas = new double[tamanho];
        double[] pesos = new double[tamanho];


 
        System.out.println("Digite as 5 notas do aluno:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }


        System.out.println("Digite os 5 pesos correspondentes às notas:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Peso " + (i + 1) + ": ");
            pesos[i] = scanner.nextDouble();
        }




        double somaNotas = 0;
        double somaPesos = 0;
        for (int i = 0; i < tamanho; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        double mediaPonderada = somaNotas / somaPesos;




        System.out.println("A média ponderada do aluno é: " + mediaPonderada);
    }
}
