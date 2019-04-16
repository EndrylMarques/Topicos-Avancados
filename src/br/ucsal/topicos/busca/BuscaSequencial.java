package br.ucsal.topicos.busca;

import java.util.Random;

public class BuscaSequencial {


        public static int count;
        public static void main(String[] args) {

            System.out.println(mediaBusca(1d) + "\t");
            System.out.println(mediaBusca(10d) + "\t");
            System.out.println(mediaBusca(100d) + "\t");
            System.out.println(mediaBusca(1000d) + "\t");
            System.out.println(mediaBusca(10000d) + "\t");

        }

        public static int buscaSequencial(int x, int vetor[]){
            count = 0;

            for(int i = 0; i < vetor.length; i++){
                count ++;
                if(vetor[i] == x){
                    count ++;
                    return vetor[i];
                }
                count ++;
            }
            return 0;
        }

        public static int[] inteirarVetor(Random rd){
            int vetor [] = new int[1000];

            for(int i = 0; i < vetor.length; i++){
                vetor[i] = rd.nextInt(100);
            }
            return vetor;
        }

        public static Double mediaBusca(Double tamanho){

            Random rd = new Random();

            Double soma = 0d;

            for(int i = 0; i <= tamanho; i++){
                int x = rd.nextInt(100);
                int vetor [] = inteirarVetor(rd);
                buscaSequencial(x, vetor);
                soma += (double)count;
            }
            return soma / tamanho;
        }
    }

