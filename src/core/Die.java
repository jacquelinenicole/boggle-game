/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;
import java.util.Random;

//creates methods for use in other classes
public class Die implements IDie {
    //declares string to store all dices' letters
    private final ArrayList<String> letters = new ArrayList<>();
    
    Random randomNumbers = new Random();
    int randomSide;
    String letterRolled;
    
    
    //adds letters; implemented in populateData()
    @Override
    public void addLetter(String letter) {
        letters.add(letter);
    }
    
    //prints the dices' letters; implemented in populateData()
    @Override
    public void displayLetters() {
        for (String character: letters)
            System.out.print(character + "  ");
    }

    //picks a random letter from the die
    @Override
    public String rollDie() {
       randomSide = randomNumbers.nextInt(6);
       letterRolled = letters.get(randomSide);
       return letterRolled;
    }

}
