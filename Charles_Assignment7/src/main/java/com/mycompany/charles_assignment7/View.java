/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.charles_assignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author vvard
 */
public class View {
    String filePath = "booka.dat";
    Scanner keyboard = new Scanner(System.in);
    String title = "                                                                                                                                                           \n" +
"                                                                                                                                                           \n" +
"DDDDDDDDDDDDD                                            lllllll                  BBBBBBBBBBBBBBBBB                                     kkkkkkkk           \n" +
"D::::::::::::DDD                                         l:::::l                  B::::::::::::::::B                                    k::::::k           \n" +
"D:::::::::::::::DD                                       l:::::l                  B::::::BBBBBB:::::B                                   k::::::k           \n" +
"DDD:::::DDDDD:::::D                                      l:::::l                  BB:::::B     B:::::B                                  k::::::k           \n" +
"  D:::::D    D:::::D uuuuuu    uuuuuu    aaaaaaaaaaaaa    l::::l                    B::::B     B:::::B   ooooooooooo      ooooooooooo    k:::::k    kkkkkkk\n" +
"  D:::::D     D:::::Du::::u    u::::u    a::::::::::::a   l::::l                    B::::B     B:::::B oo:::::::::::oo  oo:::::::::::oo  k:::::k   k:::::k \n" +
"  D:::::D     D:::::Du::::u    u::::u    aaaaaaaaa:::::a  l::::l                    B::::BBBBBB:::::B o:::::::::::::::oo:::::::::::::::o k:::::k  k:::::k  \n" +
"  D:::::D     D:::::Du::::u    u::::u             a::::a  l::::l  ---------------   B:::::::::::::BB  o:::::ooooo:::::oo:::::ooooo:::::o k:::::k k:::::k   \n" +
"  D:::::D     D:::::Du::::u    u::::u      aaaaaaa:::::a  l::::l  -:::::::::::::-   B::::BBBBBB:::::B o::::o     o::::oo::::o     o::::o k::::::k:::::k    \n" +
"  D:::::D     D:::::Du::::u    u::::u    aa::::::::::::a  l::::l  ---------------   B::::B     B:::::Bo::::o     o::::oo::::o     o::::o k:::::::::::k     \n" +
"  D:::::D     D:::::Du::::u    u::::u   a::::aaaa::::::a  l::::l                    B::::B     B:::::Bo::::o     o::::oo::::o     o::::o k:::::::::::k     \n" +
"  D:::::D    D:::::D u:::::uuuu:::::u  a::::a    a:::::a  l::::l                    B::::B     B:::::Bo::::o     o::::oo::::o     o::::o k::::::k:::::k    \n" +
"DDD:::::DDDDD:::::D  u:::::::::::::::uua::::a    a:::::a l::::::l                 BB:::::BBBBBB::::::Bo:::::ooooo:::::oo:::::ooooo:::::ok::::::k k:::::k   \n" +
"D:::::::::::::::DD    u:::::::::::::::ua:::::aaaa::::::a l::::::l                 B:::::::::::::::::B o:::::::::::::::oo:::::::::::::::ok::::::k  k:::::k  \n" +
"D::::::::::::DDD       uu::::::::uu:::u a::::::::::aa:::al::::::l                 B::::::::::::::::B   oo:::::::::::oo  oo:::::::::::oo k::::::k   k:::::k \n" +
"DDDDDDDDDDDDD            uuuuuuuu  uuuu  aaaaaaaaaa  aaaallllllll                 BBBBBBBBBBBBBBBBB      ooooooooooo      ooooooooooo   kkkkkkkk    kkkkkkk\n" +
"                                                                                                                                                           \n" +
"                                                                                                                                                           \n" +
"                                                                                                                                                           \n" +
"                                                                                                                                                           \n" +
"                                                                                                                                                           \n" +
"                                                                                                                                                           \n" +
"                                                                                                                                                           ";
    

    public void LoadBook(PhoneBook phoneBook) throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        
        for(int i =0; i < 10; i++){
            phoneBook.directory.put(scanner.nextLine(), scanner.nextLine());
        }
        
    }
    
    public void PrintBook(PhoneBook phoneBook){
        System.out.println(phoneBook.directory.get("14145554561"));
    }

    public void Welcome() {
        System.out.print(title);
        System.out.println("\n\nWelcome to Dualbook!!\n");
    }

    public char Continue() {
        System.out.println("Would you like view or edit another phonebook?  Y||N");
        return inChar();
    }

    public void GoodBye() throws InterruptedException {
        System.out.println("Thanks for using Dual-Book!");
        waitASec();
        
    }
    
    public char inChar(){
        char c = keyboard.next().toUpperCase().charAt(0);
        clearBuf();
        return c;
    }
    
    public void waitASec() throws InterruptedException{
        Thread.sleep(1000);
    }
    
    public void clearBuf(){
        keyboard.nextLine();
    }
    
    public void printString(String outPut){
        System.out.println(outPut);
    }
    
    public String inString(){
        return keyboard.nextLine().toLowerCase();
    }

    public void savePhoneBook(List<String> sortedBook, String title) {
         try {
            FileWriter myWriter = new FileWriter(title + ".txt");
            
            for(int i=0; i<sortedBook.size(); i++){
                myWriter.write(sortedBook.get(i)+"\n");
            }
                    
            myWriter.close();
            
            System.out.println("Successfully wrote to the file.");
            
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            }
    }


    
    
    
}
