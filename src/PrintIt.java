/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.cs2009f;

import java.io.FileNotFoundException;

/** prints the data in alphabetical order according to name
 * 03 April 2017
 * @author Moegamat Ra-eez Stenekamp
 */
public class PrintIt {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        // load data from file of data and create BST
        DataReader dataread = new DataReader();
        dataread.DataReader();
        
        // print all data from BST in order
        dataread.bst.inOrder();
    }
    
}
