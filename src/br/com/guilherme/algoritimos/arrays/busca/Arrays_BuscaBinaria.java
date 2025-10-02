package br.com.guilherme.algoritimos.arrays.busca;

import java.util.Scanner;

public class Arrays_BuscaBinaria {
    public static void main(String[] args) {
        /*
            Busca binária - Utiliza-se de uma antigo conceito, chamada dividir para conquistar, seu funcionamento é básico,
            consiste na ideia de dividir o vetor na metade e salvar seu elemento central, e comparar se o elemento que eu busco
            é maior, menor ou igual, caso seja maior ou menor nos ja conseguimos descartar metade do vetor, e repete esse processo
            até encontrar o elemento ou não. Caso seja igual ao elemento que busca para a função e retorna o indicie do elemento.

            -> Para funcionar esse tipo de busca o vetor deve estar ordenado.
         */

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5]; // Criando um array

        // Adicionando valores ao vetor 'numeros' atraves do Scanner
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o valor na posição " + i + ": ");
            numeros[i] = sc.nextInt();
        }

        ordernarVetor(numeros); // Chama a função e retorna o vetor ordenado

        System.out.println();

        // Inicio Busca Binária
        // Melhor Caso:
        // Pior Caso:
        System.out.print("Digite o elemento que deseja buscar: ");
        int numeroBusca = sc.nextInt();

        int resultado = -1;
        int inicio = 0;
        int fim = numeros.length - 1;
        int meio;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (numeros[meio] < numeroBusca) {
                inicio = meio + 1;
            } else if (numeros[meio] > numeroBusca) {
                fim = meio - 1;
            } else if (numeros[meio] == numeroBusca) {
                resultado = meio;
                break;
            }
        }
        // Fim Busca Binária

        System.out.println();

        if (resultado < 0) {
            System.out.println("Elemento não encontrado.");
        } else {
            System.out.println(String.format("O número %d está na posição %d.", numeroBusca, resultado));
        }


        sc.close();
    }

    // Cria esse método para imprimir o array todas as vezes que precisarmos, para não perdemos tempo e performance reescrevendo o mesmo código
    private static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void ordernarVetor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int indicieDoMenor = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[indicieDoMenor]) {
                    indicieDoMenor = j;
                }
            }
            int aux = array[indicieDoMenor];
            array[indicieDoMenor] = array[i];
            array[i] = aux;
        }
    }

}
