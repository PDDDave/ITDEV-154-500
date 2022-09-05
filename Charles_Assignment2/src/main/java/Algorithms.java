
import java.text.DecimalFormat;
import java.util.Arrays;

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

    public String a1(int arr[]) {
        return binarySearch(arr,3);
    }

    public String a2(int arr[]) {
        return ascSort(arr);
    }

    public void a3(int i) {
        countdown(i);
    }

    public void a4() {
        greet("Jay");
    }

    public int a5() {
        return factorial(4);
    }

    public void a6() {
        fibonacci();
    }

    private String binarySearch(int [] list, int item) {
        int low = 0;
        int high = list.length;
        int mid;
        int guess;
        
        while(low <= high){
             mid = (low + high) / 2;
             guess =list[mid];
             
             if(guess == item){
                 return String.valueOf(mid);
             }
             
             if(guess > item){
                 high = mid -1;
             }
             else{
                 low = mid + 1;
             }
        }
        return "No Result Found";
    }

    private String ascSort(int [] arr) {
        
        
        for(int j=0;j <= arr.length -1; j++){
            int minDex = j;
            
            for (int i = j + 1; i < arr.length; i++){
                if (arr[i] < arr[minDex]){
                    minDex = i;
                }
            }
            swap(minDex, j, arr);
        }
        return Arrays.toString(arr);
    }

    private void swap(int minDex, int o, int[] arr) {
        int temp = arr[minDex];
        arr[minDex] = arr[o];
        arr[o] = temp;        
    }

    private void countdown(int i) {
        System.out.println(i);
        if (i <= 0){
        }
        else{
            countdown(i-1);
        }
    }

    private void greet(String name) {
        System.out.println("hello, " + name + "!");
        greet2(name);
        System.out.println("getting ready to say bye...");
        bye();
    }

    private void greet2(String name) {
        System.out.println("how are you, " + name + "?");
    }

    private void bye() {
        System.out.println("ok bye!");
    }

    private int factorial(int x) {
        if (x == 1){
            return 1;
        }
        else{
            return(x * factorial(x-1));
        }
    }

    private void fibonacci() {
        DecimalFormat df = new DecimalFormat("#,###,###,###,##0.00");
        
        int N = 5;
        long start, stop;
        long delta;
        double seconds;
        
        for (int i=1; i<=10; i++){
            start = System.nanoTime();
            long fib = fibv1(N*i);
            stop = System.nanoTime();
            delta = (stop - start);
            seconds = (double) delta/1_000_000_000.0;
            System.out.println("and takes " + seconds + " seconds\n");
        }
    }

    static long fibv1(int n) {
        if (n <= 1) return n;
        return fibv1(n-1) + fibv1(n-2);
    }


    
}
