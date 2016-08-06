package com.company;

/**
 * Created by shubham on 6/8/16.
 */
public class heapSort implements sortAlgo{
    int[] arrayVal;
    int total;

    @Override
    public void inputArray(int[] inputArray) {
        arrayVal = new int[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            arrayVal[i]=inputArray[i];
        }

    }


    public int compareTo(int a , int b){
        if(a>b){
            return 1;
        }
        else if(a<b){
            return -1;
        }
        else{
            return 0;
        }
    }

    public void swap(int[] arr,int a,int b){
        int tmp = arrayVal[a];
        arrayVal[a]=arrayVal[b];
        arrayVal[b]=tmp;

    }

    public void heapify(int[] arr,int i){
        int lft = i * 2;
        int rgt = lft + 1;
        int grt = i;

        if (lft <= total && compareTo(arr[lft],arr[grt]) > 0) grt = lft;
        if (rgt <= total && compareTo(arr[rgt],arr[grt]) > 0) grt = rgt;
        if (grt != i) {
            swap(arr, i, grt);
            heapify(arr, grt);
        }

    }

    @Override
    public void sortArray() {
        total = arrayVal.length -1;

        for (int i = total / 2; i >= 0; i--)
            heapify(arrayVal, i);

        for (int i = total; i > 0; i--) {
            swap(arrayVal, 0, i);
            total--;
            heapify(arrayVal, 0);
        }
    }

    @Override
    public void printArray() {
        for (int i=0;i<arrayVal.length;i++){
            System.out.print(arrayVal[i]+",");

        }
        System.out.println();
    }
}
