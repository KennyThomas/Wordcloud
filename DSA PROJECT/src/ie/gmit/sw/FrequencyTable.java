package ie.gmit.sw;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.security.KeyStore.Entry;
import java.util.*;

public class FrequencyTable extends Words {

	
	public  void WordCountFile(List<String> Text) throws Exception  {
		
		ArrayList<String> MostUsedWords = new ArrayList<String>();
		  Map<String, Integer> hm = new HashMap<String, Integer>();  //used to get the frequency of  words

		  
	        for (String word : Text) { 
	            Integer j = hm.get(word); 
	            hm.put(word, (j == null) ? 1 : j + 1);          //I used this code I found online at  https://www.geeksforgeeks.org/count-occurrences-elements-list-java/
	        }                                                   //used for the hashmap 
	  
	     int MostUsed = 0;
	     String MostusedWord = null;
	     
	        long start = System.currentTimeMillis();
	        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
	            System.out.println( val.getKey() + " "                   //used for counting the occurences of the words
                        + "occurs" + ": " + val.getValue() + " times"); 
	            if(val.getValue()>MostUsed) {
	            MostUsed =val.getValue() ;
	            MostusedWord=val.getKey();           //I tried to add and if statement that would add the most occured but it didn't work
	            
	            MostUsedWords.add(MostusedWord);
	        
	            }
	            else if(val.getValue()<MostUsed){
	            	MostUsedWords.remove(val.getKey());
	            }
	
	        }
	       
	       
	        
	        System.out.println("the word most used is " + MostusedWord + " used " + MostUsed + " times");
	        System.out.println(MostUsedWords);
	     
	        System.out.println("Time: " + (System.currentTimeMillis() - start));   //time to search on my laptop was .15 seconds
	        
	        CreateImage image = new CreateImage();       //passes the the frequency of the words to the create image class
	        image.WordCloudImage(Text);
	       
	    } 
public  void WordCountURl(List<String> Text) throws Exception  {
		
		ArrayList<String> MostUsedWords = new ArrayList<String>();
		  Map<String, Integer> hm = new HashMap<String, Integer>(); 
		  
	        for (String word : Text) { 
	            Integer j = hm.get(word); 
	            hm.put(word, (j == null) ? 1 : j + 1); 
	        } 
	  
	     int MostUsed = 0;
	     String MostusedWord = null;
	        for (Map.Entry<String, Integer> val : hm.entrySet()) { 
	        	                                                                 // I used the same method for the URL  
	            System.out.println( val.getKey() + " "
	                               + "occurs"
	                               + ": " + val.getValue() + " times"); 
	            for (int i = 0; i < val.getValue(); i++) {
					
				
	            if(val.getValue()>MostUsed) {
	            MostUsed =val.getValue() ;
	            MostusedWord=val.getKey();
	            
	            MostUsedWords.add(MostusedWord);
	            }
	            else if(val.getValue()<MostUsed){
	            }
	            	
	            }
	        } 
	       
	       
	        
	        System.out.println("the word most used is " + MostusedWord + " used " + MostUsed + " times");
	        System.out.println(MostUsedWords);
	        
	        CreateImage image = new CreateImage();
	        image.WordCloudImage(Text);
}


}