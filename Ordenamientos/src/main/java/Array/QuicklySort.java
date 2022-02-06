/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

/**
 *
 * @author Alex Santos
 */

public class QuicklySort {
    private int count = 0;
    public int position(int[] array, int low, int hight){
        while(low < hight){
            while(array[hight] >= array[low] && low < hight){
                count ++;
                hight --;
            }
            int key = array[low];
            array[low] = array[hight];
            array[hight] = key;
 
            while (array[low] <= array[hight] && low < hight){
                count ++;
                low ++;
            }
            key = array[hight];
            array[hight] = array[low];
            array[low] = key;
        }
        return low;
    }
    public void sort(int[] array, int low, int high){
        if(low >= high){
            return;
        }
        int index = position(array,low,high);
        sort(array,low,index - 1);
        sort(array,index + 1, high);
    }
 
    public static void main(String[] args) {
        int[] array = new int[]{1,5,4,6,2,3,8,7,8,9};
        QuicklySort qs = new QuicklySort();
        qs.sort(array,0,array.length - 1);
        System.out.println(qs.count);
        BubbleSort.printArray(array);
 
        BubbleSort bs = new BubbleSort();
        array = new int[]{1,5,4,6,2,3,8,7,8,9};
        System.out.println(bs.sort2(array));
        BubbleSort.printArray(array);
    }
}