package br.ucsal.topicos.insert;

import java.util.Random;

class QuickSort {
    public static void main(String[] args) {
        int vet[] = criarVetor(100);

        vet = quickSort(vet, 0, vet.length - 1);

        for (int i = 0; i < vet.length; i++) {

            System.out.print(vet[i] + " ");
        }
    }

    public static int[] quickSort(int arr[], int low, int hight) {


        if (low < hight) {
           int pi = partion(arr, low, hight);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, hight);
        }


        return arr;
    }

    public static int partion(int arr[], int low, int hight) {
        int pivot = arr[hight];
        int i = low - 1;
        int aux = 0;

        for (int j = low; j <= hight - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                aux = arr[j];
                arr[j] = arr[i];
                arr[i] = aux;
            }
        }

        aux = arr[i + 1];
        arr[i + 1] = arr[hight];
        arr[hight] = aux;

        return i + 1;
    }

    public static int[] criarVetor(int tamanho) {
        Random rd = new Random();
        int vetor[] = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(10);
            System.out.print(vetor[i] + " ");
        }
        System.out.println(" ");
        return vetor;
    }

}