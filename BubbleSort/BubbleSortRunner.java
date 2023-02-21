package BubbleSort;

import SelectionSort.SelectionSort;

import java.util.Arrays;

public class BubbleSortRunner {
    public static void main(String[] args) {
        int []arr1 = {3,1,4,5,8,6,2};
        System.out.println("Sort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr1));
        System.out.println("************************");
        System.out.println("BubbleSort işlemi sonrası : ");
        BubbleSort.bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("***************************");
    }
}
