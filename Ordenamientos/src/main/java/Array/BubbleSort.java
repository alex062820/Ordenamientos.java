/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Alex Santos
 */

public class BubbleSort {
    public int sort1(int[] array){
        // Contador, cuenta cuántas veces se han comparado
        int count = 0;
        int k,flag = array.length,temp;
                 
        while(flag > 0){
                        
            k = flag;
                        
            flag = 0;
            for(int i = 1; i < k; i++){
                count++;
                if(array[i] < array[i - 1]){
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    flag = i;
                }
            }
        }
        return count;
    }
    public int sort2(int[] array){
        int count = 0,temp;
        for(int i = 0; i < array.length; i ++){
            for(int j = i + 1; j < array.length; j ++){
                count ++;
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
 }
        }
        return count;
    }
 
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] array = new int[]{1,4,2,3,5};
        System.out.println(bs.sort1(array));
        printArray(array);
        array = new int[]{1,4,2,3,5};
        System.out.println(bs.sort2(array));
        printArray(array);
    }
    public static void  printArray(int[] array){
        for(int item : array){
            System.out.print(item + " ");
        }
        System.out.println();
    }
}