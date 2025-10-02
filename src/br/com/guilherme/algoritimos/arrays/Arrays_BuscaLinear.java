package br.com.guilherme.algoritimos.arrays;

import java.util.Scanner;

public class Arrays_BuscaLinear {
    public static void main(String[] args) {
        /*
            Busca linear - Método de busca que consiste em percorrer todo o vetor comparando elemento por elemento ate
                          encontrar ou não o valor desejado.
         */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5]; // Criando um array

        // Adicionando valores ao vetor 'numeros' atraves do Scanner
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor na posição " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        // Inicio Busca Linear
        System.out.print("\nDigite o valor a ser buscado: ");
        int numeroBusca = sc.nextInt();

        int indicieBusca = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBusca) {
                indicieBusca = i;
            }
        }

        if (indicieBusca >= 0) {
            System.out.println(String.format("O valor %d que você procura está no indice: %d", numeroBusca, indicieBusca));
        } else {
            System.out.println("Elemento não encontrado!");
        }
        // Fim Busca Linear

        System.out.println("\nVetor: ");
        imprimirArray(numeros); // Exibição dos valores do vetor 'numeros'

        sc.close();
    }

    // Cria esse método para imprimir o array todas as vezes que precisarmos, para não perdemos tempo e performance reescrevendo o mesmo código
    private static void imprimirArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
