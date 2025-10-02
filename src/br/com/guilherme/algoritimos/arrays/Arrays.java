package br.com.guilherme.algoritimos.arrays;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Arrays (Vetores): Estrutura que permite agrupar dados do mesmo tipo da forma mais 'primitiva'.
        // Precisa definir a quantidade de elementos a ser subdivididos.
        // Ex: TipoDoDado[] nomeVariavel = new TipoDoDado[número de elementos]
        // O 'new' serve para instanciar um objeto no Java ou seja um objeto do tipo Array.
        // Os Arrays eles são indexados ou seja todo elemento adicionado no array recebe um valor. Começando do valor 0 ate (posição - 1)

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5]; // Criando um array

        // Adicionando valores ao vetor 'numeros' atraves do Scanner
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor na posição " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nVetor: ");
        // Exibição dos valores do vetor 'numeros'
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }


        sc.close();
    }
}
