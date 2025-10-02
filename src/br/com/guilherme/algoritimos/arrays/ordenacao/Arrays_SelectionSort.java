package br.com.guilherme.algoritimos.arrays.ordenacao;

import java.util.Scanner;

public class Arrays_SelectionSort {
    public static void main(String[] args) {
        /*
            Selection sort - É um algoritimo de ordenação, que visa deslocar os elementos de
            maior valor a direita, e os de menor valor a esquerda (caso sua lógica seja crescente).

            -> Funcionamento: Percorre um loop ate encontrar o menor elemento dentro do vetor,
             e coloca ele na primeira posição, e o elemento que se encontra nela, vai para a posição que o menor
             elemento estava, até que o vetor esteja inteiramente ordenado. OBS: Seguindo uma lódica de ordenação crescente.

            -> Quem dita a lógica de ordenação é o programador, é necessário apenas entender como ele funciona.

         */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5]; // Criando um array

        // Adicionando valores ao vetor 'numeros' atraves do Scanner
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor na posição " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nVetor desordenado: ");
        imprimirArray(numeros); // Exibição dos valores do vetor 'numeros'

        // Inicio Selection Sort
        // Melhor Caso: Caso o vetor ja esteja ordenado (n² vezes)
        // Caso Médio: Caso o vetor esteja com a metade ordenada (n² vezes)
        // Pior Caso: Caso o vetor esteja totalmente desordenado (n² vezes)
        for (int i = 0; i < numeros.length; i++) {
            int indicieDoMenor = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indicieDoMenor]) {
                    indicieDoMenor = j;
                }
            }
            int aux = numeros[indicieDoMenor];
            numeros[indicieDoMenor] = numeros[i];
            numeros[i] = aux;
        }
        // Fim Selection Sort

        System.out.println("\nVetor ordenado: ");
        imprimirArray(numeros);

        sc.close();
    }

    // Cria esse método para imprimir o array todas as vezes que precisarmos, para não perdemos tempo e performance reescrevendo o mesmo código
    private static void imprimirArray(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}

