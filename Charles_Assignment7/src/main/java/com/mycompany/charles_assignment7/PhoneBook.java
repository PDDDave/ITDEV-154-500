/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.charles_assignment7;

import java.util.Hashtable;

/**
 *
 * @author vvard
 */
public class PhoneBook {
    public Hashtable directory = new Hashtable();
    private String title;
    
   public PhoneBook(String title){
       this.title = title;
   }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   

    
}
