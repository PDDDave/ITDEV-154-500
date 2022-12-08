/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.charles_assignment7;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author vvard
 */
public class Controller {
    View view = new View();
    char choice;
    char response;
    boolean cont = true;
    PhoneBook bookA;
    PhoneBook bookB;
    
    public void Begin() throws FileNotFoundException, InterruptedException{
        CreatePhoneBooks();
        LoadPhoneBooks();
        UserLoop();
    }

    private void CreatePhoneBooks() {
        bookA = new PhoneBook("A");
        bookB = new PhoneBook("B");
    }

    private void LoadPhoneBooks() throws FileNotFoundException {
        view.LoadBook(bookA);
        view.LoadBook(bookB);
    }

    private void UserLoop() throws InterruptedException {
        

        welcome();
        
        do{
            view.printString("\n\nWhich phone book would you like to access?\n\n A or B");
            choice = view.inChar();
            
            switch (choice) {
                case 'A':
                    editBook(bookA);
                    again();
                    break;
                case 'B':
                    editBook(bookB);
                    again();
                    break;
                default:
                    view.printString("Uknown input, try again");
            }
            

        
        }while (cont == true);
        
        goodbye();
        
    }

    private void welcome() {
        view.Welcome();
    }

    private void goodbye() throws InterruptedException {
        List<String> sortedA = new ArrayList<String>();
        List<String> sortedB = new ArrayList<String>();
        
        sortedA = sortHashTable(bookA);
        sortedB = sortHashTable(bookB);
        
        view.savePhoneBook(sortedA, "Book_A");
        view.savePhoneBook(sortedB, "Book_B");
        
        view.printString(bookA.directory.toString());
        view.printString(bookB.directory.toString());
        
        view.GoodBye();
        System.exit(0);
    }

    private void again() {
            response = view.Continue();
            if( response != 'Y'){
                cont = false;
            }
    }

    private void editBook(PhoneBook phoneBook) {
        boolean again = true;
        char res;
        view.printString("Now edditing phone book: " + phoneBook.getTitle());
        
        do{
            view.printString("\n\nWhat would you like to do?\n1. Add Entry\n2. Search for Entry\n3. Print Phonebook\n4.Remove entry\n5. Exit");
            res = view.inChar();
            
            switch (res) {
                case '1':
                    addEntry(phoneBook);
                    break;
                case '2':
                    view.printString(searchEntry(phoneBook, getSearch()));
                    break;
                case '3':
                    view.printString(phoneBook.directory.toString());
                    break;
                case '4':
                    view.printString(removeEntry(phoneBook));
                case '5':
                    again = false;
                    break;                    
                default:
                    view.printString("Uknown input, try again");
            }
            
        }while( again == true);
    }

    private String searchEntry(PhoneBook phoneBook, String query) {
        String result = "";
        
        if(phoneBook.directory.containsKey(query)){
            result = "Search result: " + phoneBook.directory.get(query).toString() + ", Phone number: " + query;
        }
        else{
            result = "No result found";
        }
        
        return result;
    }

    private String getSearch() {
        String query;
        boolean cont= true;
        
        do{
            view.printString("Please enter the number you would like to search (numbers only, no dashes or spaces)");
            query = view.inString();
            
            if(query.charAt(0)== '1' && query.length()==11){
                cont = false;
            } 
            else{
                view.printString("Number must include a 1 and then area code, for a total of eleven characters.");
            }
        }while(cont == true);
        
        return query;
    }

    private void addEntry(PhoneBook phoneBook) {
        String address = gatherAddress();
        String phoneNum = gatherPhoneNumber();
        String confirmation;
        
        if(!phoneBook.directory.contains(phoneNum)){
            phoneBook.directory.put(phoneNum,address);
            confirmation = "Entry Added";
        }else{
            confirmation = "****Error: Entry already exists.\n" + phoneBook.directory.get(phoneNum).toString();
        }
        
        view.printString(confirmation);
    }

    private String gatherAddress() {
        String address;
        
        view.printString("Please enter contact First and Last Name: ");
        address = view.inString();
        
        address += ", "; 
        view.printString("Please enter contact street address: ");
        address += view.inString();
        
        address += ", "; 
        view.printString("Please enter contact city: ");
        address += view.inString();
        
        address += ", "; 
        view.printString("Please enter contact state abbreviation: ");
        address += view.inString();
        
        address += ", "; 
        view.printString("Please enter contact zip code: ");
        address += view.inString();
        
        return address;
        
        
    }

    private String gatherPhoneNumber() {
        String phoneNum;
        boolean cont = true;
        
        
        do{
            view.printString("Please enter contact phone number: (numbers only, no dashes or spaces)");
            phoneNum = view.inString();
            if(phoneNum.charAt(0)== '1' && phoneNum.length()==11){
                cont = false;
            } 
            else{
                view.printString("Number must include a 1 and then area code, for a total of eleven characters.");
            }          
        }while(cont == true);
        
        return phoneNum;
    }

    private String removeEntry(PhoneBook phoneBook) {
        String query = gatherPhoneNumber();
        String result;
        
        if(phoneBook.directory.containsKey(query)){
            result = "Entry Deleted: " + phoneBook.directory.get(query).toString() + ", Phone number: " + query;
            phoneBook.directory.remove(query);
        }
        else{
            result = "No result found";
        }   
        
        return result;
    }


    private List<String> sortHashTable(PhoneBook phoneBook) {
        int i =0;
        List<String> sortedList = new ArrayList<String>();
        List<String> keys = Collections.list(phoneBook.directory.keys());
        Collections.sort(keys);
        Iterator<String> it = keys.iterator();
        
        while(it.hasNext()){
            String entry = it.next();
            
            sortedList.add(phoneBook.directory.get(entry).toString() + "\t Phone Number: " + entry);
            
        }
        
        return sortedList;
    }

    

    
}
