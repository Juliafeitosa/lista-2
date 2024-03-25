//8. Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa aconcatenação de A e B, ou seja,
// C contém os elementos de A seguidos dos elementosde B


import java.util.Arrays;


public class Ex8 {
    public static void main (String[] args) {
 
        int[] vetorj = {1, 2, 3, 4, 5};
        int[] vetorf = {6, 7, 8, 9, 10};


        int tamanhoC = vetorj.length + vetorf.length;


        int[] vetorC = new int[tamanhoC];


        for (int i = 0; i < vetorj.length; i++) {
            vetorC[i] = vetorj[i];
        }
        for (int i = 0; i < vetorf.length; i++) {
            vetorC[vetorj.length + i] = vetorf[i];
        }


        System.out.println("Vetor C (concatenação de A e B): " + Arrays.toString(vetorC));
    }
}
