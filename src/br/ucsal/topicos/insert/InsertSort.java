package br.ucsal.topicos.insert;

import java.util.Random;

class InsertSort {

    public static int count;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        double dataSize = 1024 * 1024;

        System.out.println(mediaInsert(1d) + "\t" + (System.currentTimeMillis() - start) + " " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / dataSize);
        start = System.currentTimeMillis();
        System.out.println(mediaInsert(10d) + "\t" + (System.currentTimeMillis() - start) + " " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / dataSize);
        start = System.currentTimeMillis();
        System.out.println(mediaInsert(100d) + "\t" + (System.currentTimeMillis() - start) + " " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / dataSize);
        start = System.currentTimeMillis();
        System.out.println(mediaInsert(1000d) + "\t" + (System.currentTimeMillis() - start) + " " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / dataSize);

    }

    public static int[] criarVetor(int tamanho){
        Random rd = new Random();
        int vetor[] = new int[tamanho];
        for (int i = 0; i < vetor.length; i++ ){
            vetor[i] = rd.nextInt(1000);
        }

        return vetor;
    }

    public static int[] insertSort(int vetor[]){
        count = 0;

        for (int i = 0; i < vetor.length; i++ ){
            count++;
            for (int j = 0; j < vetor.length - 1; j++ ){
                count++;
                if(vetor[i] < vetor[j]){
                    count++;
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }

        }
        count++;
        return vetor;
    }

    public static Double mediaInsert(Double tamanho){
        Double soma = 0d;

        for(int i = 0; i <= tamanho; i++){

            int vetor[] = criarVetor(1000);
            insertSort(vetor);
            soma += (double)count;
        }

        return soma / tamanho;
    }
}

