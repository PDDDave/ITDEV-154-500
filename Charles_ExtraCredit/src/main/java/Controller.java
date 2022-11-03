
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
    private Integer[] arr10 = new Integer[10];
    private Integer[] arr100 = new Integer[100];  
    private Integer[] arr1k = new Integer[1000];
    private Integer[] randArrOne;
    private Integer[] randArrTwo;
    private Integer[] randArrThree;
    
    
    void go() {
        boolean cont = true;
        String answer = "";
        
        createArrays();
        
        do{
           view.welcome();
           answer = view.inString();
           switch(answer){
               case "1":
                   view.printString(algs.testOne());
                   break;
               case "2":
                   view.printString(algs.testTwo());
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
       
       createRandomArray(randArrOne);
       createRandomArray(randArrTwo);
       createRandomArray(randArrThree);
    }

    private void createRandomArray(Integer[] randomArray) {
        Random rand = new Random();
        int arrSize = rand.nextInt(RAND_ARR_UP_BOUND - RAND_ARR_LOW) + RAND_ARR_LOW; //generates number between  RAND_ARR_LOW and RAND_ARR_LOW_UP
        randomArray = new Integer[arrSize];
        
        algs.populateStructure(randomArray, ARR_CONTENT_BOUND);
    }

    public Integer[] getArr10() {
        return arr10;
    }

    public void setArr10(Integer[] arr10) {
        this.arr10 = arr10;
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

    public Integer[] getRandArrOne() {
        return randArrOne;
    }

    public void setRandArrOne(Integer[] randArrOne) {
        this.randArrOne = randArrOne;
    }

    public Integer[] getRandArrTwo() {
        return randArrTwo;
    }

    public void setRandArrTwo(Integer[] randArrTwo) {
        this.randArrTwo = randArrTwo;
    }

    public Integer[] getRandArrThree() {
        return randArrThree;
    }

    public void setRandArrThree(Integer[] randArrThree) {
        this.randArrThree = randArrThree;
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
