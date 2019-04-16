package br.ucsal.topicos.insert;

public class MergeSort {

    public static void main(String[] args) {

    }

    public static int[] mergeSort(int array[], int p, int r){

        if (p < r) {
            int q = (p+r)/2;
            mergeSort(array, p, q);
            mergeSort(array, q+1, r);

        }


        return array;
    }


}
