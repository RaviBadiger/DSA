package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array){
        for(int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {44,66,3,2,78,4,1};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
