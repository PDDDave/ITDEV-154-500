
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

     
    
    public void populateStructure(Integer[] arr, int upperBound) {
        
        Random rand = new Random();
        for(int i =0; i < arr.length; i++){
        arr[i] = rand.nextInt(upperBound);
        }
    }

    public String testOne() {
        return "TEST ONE!!";
    }

    String testTwo() {
        return "TEST TWO!!";
    }
    
}
