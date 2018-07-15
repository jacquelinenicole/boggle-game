/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/**
 *
 * @author default
 */
public interface IDie {
    //declaring constant
    public static final int NUMBER_OF_SIDES = 6; 
   
    //method signatures
    public String rollDie();
    public void addLetter(String letter);
    public void displayLetters();  
}
