/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.util.ArrayList;

/**
 *
 * @author default
 */
public interface IBoard {
    //declaring constants
    public static final int NUMBER_OF_DICE = 16;
    public static final int GRID = 4;
    
    //method signatures
    public void populateDice();
    public ArrayList shakeDice();
}
