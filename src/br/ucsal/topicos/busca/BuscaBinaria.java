package br.ucsal.topicos.busca;

import java.util.Random;

public class BuscaBinaria {


    public static int countOrdenar;
    public static int count;

    public static void main(String args[]) {
        System.out.println(mediaBusca(1d) + "\t");
        System.out.println(mediaBusca(10d) + "\t");
        System.out.println(mediaBusca(100d) + "\t");
        System.out.println(mediaBusca(1000d) + "\t");
        System.out.println(mediaBusca(10000d) + "\t");

    }

    public static int buscaBinaria(int x , int vetor[]){
        count = 0;
        int inf = 0;
        int sup = vetor.length;
        int meio = 0;

        while(inf <= sup){
            count++;
            meio = inf + ((sup-inf)/2);
            if(x == vetor[meio]){
                count++;
                return meio;

            }
            else if(x > vetor[meio]){
                count++;
                inf = meio + 1;
            }
            else{
                count++;
                sup = meio -1;
            }
        }
        count++;
        return 0;

    }

    public static int[] criarVetor(int tamanho){
        Random rd = new Random();
        int vetor[] = new int[tamanho];
        for (int i = 0; i < vetor.length; i++ ){
            vetor[i] = rd.nextInt(1000);
            //System.out.print(vetor[i] + " ");
        }

        return vetor;
    }

    public static int[] ordenarVetor(int vetor[]){
        countOrdenar = 0;

        for (int i = 0; i < vetor.length; i++ ){
            countOrdenar++;
            for (int j = 0; j < vetor.length - 1; j++ ){
                countOrdenar++;
                if(vetor[i] < vetor[j]){
                    countOrdenar++;
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }

        }
        countOrdenar++;
        return vetor;
    }

    public static Double mediaBusca(Double tamanho){
        Random rd = new Random();
        Double soma = 0d;

        for(int i = 0; i <= tamanho; i++){

            int x = rd.nextInt(100);

            int vetor[] = criarVetor(1000);
            vetor = ordenarVetor(vetor);

            buscaBinaria(x, vetor);

            soma += (double)count;
        }

        return soma / tamanho;
    }
}
