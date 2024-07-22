package aula5;

import java.util.Random;

public class MergeSort {
    public static void merge (int[] n, int left , int middle , int right){
        int [] helper = new int[n.length];
        for (int i = left; i <= right;i++){
            helper[i] = n[i];
        }

        int i = left;
        int j = middle + 1;
        int k = left;

        while (i <= middle && j <= right) {
            if (helper[i] <= helper[j]) {
                n[k] = helper[i];
                i++;
            } else {
                n[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            n[k] = helper[i];
            i++;
            k++;
        }
        while (j <= right) {
            n[k] = helper[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] n, int left, int right){
        if (left >= right){
            return;
        }else {
            int middle =(left+right) / 2;
            mergeSort(n,left,middle);
            mergeSort(n, middle+1, right);

            merge(n,left,middle,right);
        }
    }

    public static void main(String[] args) {
        int[] test = new int[10000];
        Random rand = new Random();

        for (int i = 0; i < test.length; i++) {
            test[i] = rand.nextInt(); // Gera um número inteiro aleatório
        }

        mergeSort(test,0, (test.length-1));

        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i] + " / ");
        }
        System.out.println(test.length);
    }
}
