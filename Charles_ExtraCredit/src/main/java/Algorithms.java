
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
        String msg = "";
        String before = "Before:\n";
        String after = "\nAfter:\n";
        String line = "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n";
        String tenTime1 = "";
        String hundredTime1 = "";
        String kiloTime1 = "";
        String tenTime2 = "";
        String hundredTime2 = "";
        String kiloTime2 = "";
        String tenTime3 = "";
        String hundredTime3 = "";
        String kiloTime3 = "";
        
        long start, stop;
        long delta;
        double seconds;
        
        
        msg+= "Test One A: Pivot Array[0]: \n";
        
        
        //time arr
        msg += (before + Arrays.toString(arr10));
        start = System.nanoTime();
        quickSortZero(arr10, 0, arr10.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        tenTime1 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr10) + line);
        
        msg += (before + Arrays.toString(arr100));
        start = System.nanoTime();
        quickSortZero(arr100, 0, arr100.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        hundredTime1 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr100) + line);
        
        msg += (before + Arrays.toString(arr1k));
        start = System.nanoTime();
        quickSortZero(arr1k, 0, arr1k.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        kiloTime1 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr1k)+ line);
        
        msg+= line + line;
        
        msg += (before + Arrays.toString(arr10));
        start = System.nanoTime();
        quickSortDivided(arr10, 0, arr10.length -1, 2);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        tenTime2 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr10) + line);
        
        msg += (before + Arrays.toString(arr100));
        start = System.nanoTime();
        quickSortDivided(arr100, 0, arr100.length -1, 2);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        hundredTime2 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr100) + line);
        
        msg += (before + Arrays.toString(arr1k));
        start = System.nanoTime();
        quickSortDivided(arr1k, 0, arr1k.length -1, 2);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        kiloTime2 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr1k)+ line);
        
        msg+= line + line;
        
        msg += ("Array size: " + Integer.toString(arr10.length) + "\n" +before + Arrays.toString(arr10));
        start = System.nanoTime();
        quickSort(arr10, 0, arr10.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        tenTime3 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr10) + line);
        
        msg += ("Array size: " + Integer.toString(arr100.length) + "\n" +before + Arrays.toString(arr100));
        start = System.nanoTime();
        quickSortZero(arr100, 0, arr100.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        hundredTime3 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr100) + line);
        
        msg += ("Array size: " + Integer.toString(arr1k.length) + "\n" +before + Arrays.toString(arr1k));
        start = System.nanoTime();
        quickSortZero(arr1k, 0, arr1k.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        kiloTime3 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arr1k)+ line);
             
        
        
        msg += line + line + "\n"
                + "Times for " + arr10.length + " length array:\n"
                + "\t Pivot Array[0]: " + tenTime1 + "\n"
                + "\t Pivot size divided by 2: " + tenTime2 + "\n"
                + "\t Pivot array size: " + tenTime3;
        msg += line + line + "\n"
                + "Times for " + arr100.length + " length array:\n"
                + "\t Pivot Array[0]: " + hundredTime1 + "\n"
                + "\t Pivot size divided by 2: " + hundredTime2 + "\n"
                + "\t Pivot array size: " + hundredTime3;
        msg += line + line + "\n"
                + "Times for " + arr1k.length + " length array:\n"
                + "\t Pivot Array[0]: " + kiloTime1 + "\n"
                + "\t Pivot size divided by 2: " + kiloTime2 + "\n"
                + "\t Pivot array size: " + kiloTime3;
        return msg;
    }

    String testTwo(int[] arrOne, int[] arrTwo,int[] arrThree) {
        String msg = "";
        String before = "Before:\n";
        String after = "\nAfter:\n";
        String line = "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n";
        String tenTime1 = "";
        String hundredTime1 = "";
        String kiloTime1 = "";
        String tenTime2 = "";
        String hundredTime2 = "";
        String kiloTime2 = "";
        String tenTime3 = "";
        String hundredTime3 = "";
        String kiloTime3 = "";
        
        long start, stop;
        long delta;
        double seconds;
        
        
        msg+= "Test One A: Pivot Array[0]: \n";
        
        
        //time arr
        msg += (before + Arrays.toString(arrOne));
        start = System.nanoTime();
        quickSortZero(arrOne, 0, arrOne.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        tenTime1 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrOne) + line);
        
        msg += (before + Arrays.toString(arrTwo));
        start = System.nanoTime();
        quickSortZero(arrTwo, 0, arrTwo.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        hundredTime1 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrTwo) + line);
        
        msg += (before + Arrays.toString(arrThree));
        start = System.nanoTime();
        quickSortZero(arrThree, 0, arrThree.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        kiloTime1 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrThree)+ line);
        
        msg+= line + line;
        
        msg += (before + Arrays.toString(arrOne));
        start = System.nanoTime();
        quickSortDivided(arrOne, 0, arrOne.length -1, 2);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        tenTime2 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrOne) + line);
        
        msg += (before + Arrays.toString(arrTwo));
        start = System.nanoTime();
        quickSortDivided(arrTwo, 0, arrTwo.length -1, 2);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        hundredTime2 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrTwo) + line);
        
        msg += (before + Arrays.toString(arrThree));
        start = System.nanoTime();
        quickSortDivided(arrThree, 0, arrThree.length -1, 2);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        kiloTime2 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrThree)+ line);
        
        msg+= line + line;
        
        msg += ("Array size: " + Integer.toString(arrOne.length) + "\n" +before + Arrays.toString(arrOne));
        start = System.nanoTime();
        quickSort(arrOne, 0, arrOne.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        tenTime3 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrOne) + line);
        
        msg += ("Array size: " + Integer.toString(arrTwo.length) + "\n" +before + Arrays.toString(arrTwo));
        start = System.nanoTime();
        quickSortZero(arrTwo, 0, arrTwo.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        hundredTime3 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrTwo) + line);
        
        msg += ("Array size: " + Integer.toString(arrThree.length) + "\n" +before + Arrays.toString(arrThree));
        start = System.nanoTime();
        quickSortZero(arrThree, 0, arrThree.length -1);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        kiloTime3 = Double.toString(seconds);
        msg+= (after + Arrays.toString(arrThree)+ line);
             
        
        
        msg += line + line + "\n"
                + "Times for " + arrOne.length + " length array:\n"
                + "\t Pivot Array[0]: " + tenTime1 + "\n"
                + "\t Pivot size divided by 2: " + tenTime2 + "\n"
                + "\t Pivot array size: " + tenTime3;
        msg += line + line + "\n"
                + "Times for " + arrTwo.length + " length array:\n"
                + "\t Pivot Array[0]: " + hundredTime1 + "\n"
                + "\t Pivot size divided by 2: " + hundredTime2 + "\n"
                + "\t Pivot array size: " + hundredTime3;
        msg += line + line + "\n"
                + "Times for " + arrThree.length + " length array:\n"
                + "\t Pivot Array[0]: " + kiloTime1 + "\n"
                + "\t Pivot size divided by 2: " + kiloTime2 + "\n"
                + "\t Pivot array size: " + kiloTime3;
        return msg;
    }
    

    
    private void quickSortDivided(int[] array, int lowIndex, int highIndex,int divisor){
        if(lowIndex >= highIndex) {
            return;
        }
        int pivot = array[(array.length/divisor)];
        
        int leftPointer = partition(array, lowIndex, highIndex, pivot);
        
        
        quickSort(array, lowIndex, leftPointer -1);
        quickSort(array, leftPointer +1, highIndex);
    }
    
    private void quickSortZero(int[] array, int lowIndex, int highIndex){
        
        if(lowIndex >= highIndex) {
            return;
        }
        int pivot = array[0];
        
        int leftPointer = partition(array, lowIndex, highIndex, pivot);
        
        
        quickSort(array, lowIndex, leftPointer -1);
        quickSort(array, leftPointer +1, highIndex);
    }

    private void quickSort(int[] array, int lowIndex, int highIndex) {
       
        if(lowIndex >= highIndex) {
            return;
        }
        int pivot = array[highIndex];
        
        int leftPointer = partition(array, lowIndex, highIndex, pivot);
        
        
        quickSort(array, lowIndex, leftPointer -1);
        quickSort(array, leftPointer +1, highIndex);
    }
    
    private static int partition(int[] array, int lowIndex, int highIndex, int pivot){
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
        
        return leftPointer;
    }
    
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
