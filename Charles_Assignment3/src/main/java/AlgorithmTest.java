
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class AlgorithmTest {
    private Scanner keyboard = new Scanner(System.in);
    private final int UPPER_BOUND = 100;
    private Integer[] arr100 = new Integer[100];  //have to use Integer instead of int due to "confusing primitive array argument to varargs method" error.
    private Integer[] arr1k = new Integer[1000];  //the above error caused my lists to not print as expected, see https://stackoverflow.com/questions/25409103/why-does-netbeans-warn-about-passing-int-to-vararg
    private ArrayList<Integer> list100 = new ArrayList();
    private ArrayList<Integer> list1k = new ArrayList();
    
    public void go() {
        PopulateStructure(arr100);
        PopulateStructure(arr1k);
        
        CopyData(arr100,list100);
        CopyData(arr1k, list1k);
        
        System.out.println(SelectSortTest(arr100,list100));
        System.out.println(SelectSortTest(arr1k, list1k));
        
        System.out.println("Press Enter to continue");
        keyboard.nextLine();
        
        System.out.println(InsertionSortTest(arr100, list100));
        System.out.println(InsertionSortTest(arr1k, list1k));
    }
    
    private void PopulateStructure(Integer[] arr) {
        Random rand = new Random();
        for(int i =0; i < arr.length; i++){
            arr[i] = rand.nextInt(UPPER_BOUND);
        }
    }

    public List getList100() {
        return list100;
    }

    public void setList100(ArrayList list100) {
        this.list100 = list100;
    }

    public List getList1k() {
        return list1k;
    }

    public void setList1k(ArrayList list1k) {
        this.list1k = list1k;
    }

    private void CopyData(Integer[] arr, List list) {
        Collections.addAll(list, arr);
        
        String m = arr.length + " length Array: \n" + Arrays.toString(arr)+"\n\n"
                + list.size() + " length ArrayList: \n" + list.toString();
        
        System.out.println(m);
        System.out.println("Press Enter to continue..");
        keyboard.nextLine();
    }

    public Integer[] getArr100() {
        return arr100;
    }

    public void setArr100(Integer[] arr100) {
        this.arr100 = arr100;
    }

    public Integer[] getArr1k() {
        return arr1k;
    }

    public void setArr1k(Integer[] arr1k) {
        this.arr1k = arr1k;
    }

    private String SelectSortTest(Integer[] arr, ArrayList<Integer> list) {
        String result;
        String m;
        long start, stop;
        long delta;
        double seconds;
        
        //time arr
        start = System.nanoTime();
        result = SelectSort(arr);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        m = "\n\nThe " + arr.length + " entry Array took " + seconds + " for selection Sort:\n"
                + result + "\n\n";
        
        
        //time list
        start = System.nanoTime();
        result = SelectSort(list);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        m += "The " + list.size() + " entry ArrayList took " + seconds + " for selection sort:\n"
                + result + "\n\n";
        
        return m;
        
    }
    
    private String InsertionSortTest(Integer[] arr, ArrayList<Integer> list){
        String result;
        String m;
        long start, stop;
        long delta;
        double seconds;
        
        //time arr
        start = System.nanoTime();
        result = InsertionSort(arr);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        m = "\n\nThe " + arr.length + " entry Array took " + seconds + " for insertion Sort:\n"
                + result + "\n\n";
        
        
        //time list
        start = System.nanoTime();
        result = InsertionSort(list);
        stop = System.nanoTime();
        delta = (stop - start);
        seconds = (double) delta / 1_000_000_000.0;
        m += "The " + list.size() + " entry ArrayList took " + seconds + " for insertion sort:\n"
                + result + "\n\n";
        
        return m;
    }
    
    private String SelectSort(Integer [] arr) {
        
        
        for(int j=0;j <= arr.length -1; j++){
            int minDex = j;
            
            for (int i = j + 1; i < arr.length; i++){
                if (arr[i] < arr[minDex]){
                    minDex = i;
                }
            }
            if(minDex !=j)
            SelSwap(minDex, j, arr);
        }
        return Arrays.toString(arr);
    }
    
        private String SelectSort(ArrayList<Integer> list) {
        
        
        for(int j=0;j <= list.size() -1; j++){
            int minDex = j;
            
            for (int i = j + 1; i < list.size(); i++){
                if (list.get(i) < list.get(minDex)){
                    minDex = i;
                }
            }
            if(minDex !=j)
            SelSwap(minDex, j, list);
        }
        return list.toString();
    }
        
    private String InsertionSort(Integer[] arr){
        for(int i = 1; i < arr[i -1]; i++ ){
            int j = i;
            
            while(j > 0 && arr[j - 1] > arr[j]){
                SelSwap (i,j,arr);
            }
        }
        
        return Arrays.toString(arr);
    }
    
    private String InsertionSort(ArrayList<Integer> list){
        for (int i = 1; i < list.get(i -1); i++){
            int j = i;
            
            while(j > 0 && list.get(i -1) > list.get(i)){
                SelSwap(i,j,list);
            }
        }
        return list.toString();
    }

    private void SelSwap(int minDex, int o, Integer[] arr) {
        int temp = arr[minDex];
        arr[minDex] = arr[o];
        arr[o] = temp;        
    }
    
    private void SelSwap(int minDex, int o, ArrayList<Integer> list) {
        int temp = list.get(minDex);
        list.set(minDex, list.get(o));
        list.set(o, temp);      
    }    
}
