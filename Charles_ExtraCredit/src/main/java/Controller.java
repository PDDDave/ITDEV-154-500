
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
public class Controller {
    View view = new View();
    Algorithms algs = new Algorithms();
    private final int ARR_CONTENT_BOUND = 100;
    private final int RAND_ARR_UP_BOUND = 1001;
    private final int RAND_ARR_LOW = 100;
    private int[] arr10 = new int[10];
    private int[] arr100 = new int[100];  
    private int[] arr1k = new int[1000];
    private int[] randArrOne;
    private int[] randArrTwo;
    private int[] randArrThree;
    
    
    void go() {
        boolean cont = true;
        String answer = "";
        
        createArrays();
        view.salutation();
        
        do{
           view.welcome();
           answer = view.inString();
           switch(answer){
               case "1":
                   view.printString(algs.testOne(arr10, arr100, arr1k));
                   break;
               case "2":
                   view.printString(algs.testTwo(randArrOne, randArrTwo, randArrThree));
                   break;
               case "999":
                   view.bye();
                default:
                    view.printString("Error: Unknown Input");
           }
               
        }while(cont);
        
        
        
    }

    private void createArrays() {
       algs.populateStructure(arr10, ARR_CONTENT_BOUND);
       algs.populateStructure(arr100, ARR_CONTENT_BOUND);
       algs.populateStructure(arr1k, ARR_CONTENT_BOUND);
       
       randArrOne = createRandomArray();
       randArrTwo = createRandomArray();
       randArrThree = createRandomArray();
    }

    private int[] createRandomArray() {
        int[] randomArray;
        Random rand = new Random();
        int arrSize = rand.nextInt(RAND_ARR_UP_BOUND - RAND_ARR_LOW) + RAND_ARR_LOW; //generates number between  RAND_ARR_LOW and RAND_ARR_LOW_UP
        randomArray = new int[arrSize];
        
        algs.populateStructure(randomArray, ARR_CONTENT_BOUND);
        return randomArray;
    }

    public int getARR_CONTENT_BOUND() {
        return ARR_CONTENT_BOUND;
    }

    public int getRAND_ARR_UP_BOUND() {
        return RAND_ARR_UP_BOUND;
    }
            

    public int getRAND_ARR_LOW() {
        return RAND_ARR_LOW;
    }

    
}
