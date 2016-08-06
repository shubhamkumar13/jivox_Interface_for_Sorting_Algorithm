package com.company;

/**
 * Created by shubham on 6/8/16.
 */
public class bblsort implements sortAlgo {
    @Override
    int[] arrayVal;
    
    public void inputArray(int[] inputArray) {
        arrayVal=new arrayVal[inputArray.length];
        for (int i = 0; i < ; i++) {
            
        }
    }

    @Override
    public void sortArray() {
        int n = arrayVal.length;
        int temp = 0;

        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){

                if(arrayVal[j-1] > arrayVal[j]){
                    //swap the elements!
                    temp = arrayVal[j-1];
                    arrayVal[j-1] = arrayVal[j];
                    arrayVal[j] = temp;
                }

            }

    }

    @Override
    public void printArray() {
            for (int i = 0; i < arrayVal.length ; i++) {
                System.out.print(arrayVal[i]+",");

            }

    }
}
