package br.ucsal.topicos.insert;

public class MergeSort {

    public static void main(String[] args) {

    }

    public static int[] mergeSort(int array[], int p, int r) {

        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q + 1, r);

        }
        return array;
    }

    public static void merge(int array[], int p, int q, int r){
        int i =0 , k = 0;
        int j = q+1;
        while (i <= q && j <= r){
            if (array[i] <= array[j]){

            }
        }
    }

}
