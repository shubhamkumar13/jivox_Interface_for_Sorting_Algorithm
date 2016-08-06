package com.company;

import com.company.heapSort;

public class Main {

    public static void main(String[] args) {
	// write your code here
                heapSort obj1 = new heapSort();
                int[] arr={12,3,2,7,2};
                obj1.inputArray(arr);
                obj1.sortArray();
                obj1.printArray();

                bblsort obj2 = new bblsort();
                obj2.inputArray(arr);
                obj2.sortArray();
                obj2.printArray();
    }
}
