
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
        String m = "Welcome to the Extra Credit app!\n"
                + "Which Experiment would you like to run? *Enter corresponding number 1|2  Enter 999 to QUIT*\n"
                + "1. Using arrays of size 10,100, and 100\n"
                + "2. Using three arrays of random size between 100 and 1000";
               
        
        printString(m);
    }

    public void bye() {
        printString("Thank you for checking out these algorithms!");
        System.exit(0);
    }
    
}
