
import java.util.Arrays;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vvard
 */
public class Algorithms {

     
    
    public void populateStructure(int[] arr, int upperBound) {
        
        Random rand = new Random();
        for(int i =0; i < arr.length; i++){
        arr[i] = rand.nextInt(upperBound);
        }
    }

    public String testOne(int[] arr10, int[] arr100, int[] arr1k) {
        
        System.out.println("Before:");
        System.out.println(Arrays.toString(arr10));
        
        quickSort(arr10, 0, arr10.length -1);
        
        System.out.println("After:");
        System.out.println(Arrays.toString(arr10));
        //quickSort(arr100, arr100[0], arr100.length -1, arr100.length);
        //quickSort(arr1k, arr1k[0], arr1k.length -1, arr1k.length);
        
        return "";
    }

    String testTwo() {
        return "TEST TWO!!";
    }

    private void quickSort(int[] array, int lowIndex, int highIndex) {
       
        if(lowIndex >= highIndex) {
            return;
        }
        int pivot = array[highIndex];
        
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        
        while(leftPointer < rightPointer){
            
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            
            while(array[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            
            swap(array, leftPointer, rightPointer);
        }
        swap(array, leftPointer, highIndex);
        
        quickSort(array, lowIndex, leftPointer -1);
        quickSort(array, leftPointer +1, highIndex);
    }
    
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
