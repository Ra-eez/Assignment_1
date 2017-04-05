/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.cs2009f;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**Class that searches through an unsorted Arraylist for certain names given on a txt file
 * 05 April 2017
 * @author Moegamat Ra-eez Stenekamp
 */
public class SearchItLinear {
   
    public static void main (String[] args) throws FileNotFoundException{
            
            // Load the files
            Scanner file = new Scanner(new File("/home/moegamat/Documents/CSC2009F_Assignment_1/Txt_files/testdata"));
            Scanner query = new Scanner(new File("/home/moegamat/Documents/CSC2009F_Assignment_1/Txt_files/Query.txt"));
            ArrayList<String> data = new ArrayList<>();
            ArrayList<String> name = new ArrayList<>();
            
            // Store the txt file values into the arraylists
            while (file.hasNext()){
                
                String info = file.nextLine();
                // Arraylist with data of the data file given
                data.add(info);
                String[] splitinfo = info.split("\\|");
                // Arraylist with only the names of the data given
                name.add(splitinfo[2]);
                
            }
            // Searches the file with the names that we want to find
            while (query.hasNext()){
                
                String compare = query.nextLine();
                    
                    // See whether the name is in the list of data given
                    if (!name.contains(compare)){
                        System.out.println("Not found");
                    } else {
                        // Find the data for the given name if the name is in the original data
                        for (int i = 0; i < name.size(); i++){
                            if (name.get(i).compareTo(compare) == 0){
                                System.out.println(data.get(i));
                            }
                        }
                }
            }
    }
}
