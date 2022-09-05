
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
public class Controller {
    View v = new View();
    Algorithms a = new Algorithms();
    
    public void go(){
        boolean cont = true;
        
        do{
            intro();
            chooseAlgorithm(v.inInt());
            
        }
        while(cont = true);
        
        
        
    }

    private void intro() {
        v.welcome();
    }

    private void chooseAlgorithm(int inInt) {
        switch (inInt){
                case 1:
                    int arr1[] = new int[]{1,3,5,7,9};
                    v.printString(a.a1(arr1));
                    break;
                case 2:
                    int arr2[] = new int[]{10,3,6,2,5};
                    v.printString("Unsorted: \t" + Arrays.toString(arr2));
                    v.printString("Sorted:   \t" + a.a2(arr2));
                    break;
                case 3:
                    a.a3(10);
                    break;
                case 4:
                    a.a4();
                    break;
                case 5:
                    long start, stop;
                    long delta;
                    double seconds;
                    start = System.nanoTime();
                    v.printString(String.valueOf(a.a5()));
                    stop = System.nanoTime();
                    delta = (stop - start);
                    seconds = (double) delta/1_000_000_000.0;
                    v.printString("\nProcess takes " + seconds + " seconds");
                    break;
                case 6:
                    a.a6();
                    break;
                case 999:
                    v.bye();
                    break;
        }
    
    }

}
