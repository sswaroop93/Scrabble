/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package scrabble;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author snswaroop
 */
public class Dictionary {
    public static  HashMap<String,Integer> dict= new HashMap<String,Integer>();

    public static int worth[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    private static void buildDict(File file) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file)); //To change body of generated methods, choose Tools | Templates.
        String line = null;
        
        while ((line = reader.readLine()) != null) {
            dict.put(line,calculateScore(line));
            System.out.println(line);
                
	}
        
    }

    private static Integer calculateScore(String w) {
    
    int score = 0;    
    if ( score == -1 ){
    score = 0;
    for(int i = 0; i < w.length(); i++){
       score += worth[ w.charAt(i) - 'A' ];
       }
    }
    return score;
 //To change body of generated methods, choose Tools | Templates.
    }
    
    public Boolean isPresent(String word){
        if(dict.containsKey(word))
            return true;
        return false;
    }
    
}
