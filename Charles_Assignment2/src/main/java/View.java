
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vvard
 */
public class View {
    Scanner keyboard = new Scanner(System.in);
    
    public int inInt(){
        int i = keyboard.nextInt();
        clearBuf();
        return i;
    }
    
    public void clearBuf(){
    keyboard.nextLine();
    }    
    
    public void enterToCont(){
        System.out.println("\n\nPress enter to continue....");
        keyboard.nextLine();
    }    
    
    public void printString(String outPut){
        System.out.println(outPut);
    }
    
    public void waitASec() throws InterruptedException{
    Thread.sleep(1000);
    }
    public String inString(){
        return keyboard.nextLine().toLowerCase();
    }
    
    public void welcome(){
        String m = "Welcome to Assignment 2, please enter the number of the corresponding an algorithm to execute:\n"
                + "1.\t2.\t3.\t4.\t5.\t6.\t 999 to EXIT";
        
        printString(m);
    }

    public void bye() {
        printString("Thank you for checking out these algorithms!");
        System.exit(0);
    }
    
}
