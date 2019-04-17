package br.ucsal.topicos.insert;

import java.util.Random;

class QuickSort {

    public static int count;

    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        double dataSize = 1024 * 1024;

        System.out.println(executarQuickSort(1) + "\t" + (System.currentTimeMillis() - start) + " " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / dataSize);
        start = System.currentTimeMillis();
        System.out.println(executarQuickSort(10) + "\t" + (System.currentTimeMillis() - start) + " " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / dataSize);
        start = System.currentTimeMillis();
        System.out.println(executarQuickSort(100) + "\t" + (System.currentTimeMillis() - start) + " " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / dataSize);
        start = System.currentTimeMillis();
        System.out.println(executarQuickSort(1000) + "\t" + (System.currentTimeMillis() - start) + " " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / dataSize);

    }

    public static int[] quickSort(int arr[], int low, int hight) {

        if (low < hight) {
            count++;
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
            count++;
            if (arr[j] <= pivot) {
                count++;
                i++;
                aux = arr[j];
                arr[j] = arr[i];
                arr[i] = aux;
            }
        }

        aux = arr[i + 1];
        arr[i + 1] = arr[hight];
        arr[hight] = aux;

        count++;
        return i + 1;
    }

    public static int[] criarVetor(int tamanho) {
        Random rd = new Random();
        int vetor[] = new int[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(1000);
        }
        return vetor;
    }

    public static double executarQuickSort(int x) {
        Double soma = 0d;
        count = 0;

        for (int i = 0; i <= x; i++) {

            int vetor[] = criarVetor(1000);
            quickSort(vetor, 0, vetor.length - 1);
            soma += (double) count;
        }

        return soma / (double) x;
    }

}