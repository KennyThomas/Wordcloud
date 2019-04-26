package ie.gmit.sw;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Words extends Menu {


	
	public void ReadWords() throws Exception{

		ArrayList<String> IgnoreAll = new ArrayList<String>();           //ignore words are read in and passed into this ArrayList
		ArrayList<String> InputWords = new ArrayList<String>();           //Words that are read from the chosen file

		
		
		
		File words = new File("ignorewords.txt");
	    Scanner ignorewords = new Scanner(words);
	  
		
		File file = new File(YourFile);
	    Scanner input = new Scanner(file);
	    input.useDelimiter("[^A-Za-z0-9É']+");         //used to clear the file of anything we don't want 
	    while(input.hasNext()) {
	    	InputWords.add(input.next());
	    	
	    	
	    }
	    while(ignorewords.hasNext()) {                   //words are added to each ArrayList
	    	
	    	IgnoreAll.add(ignorewords.next());
	    	
	    	
	    	
	    }
	    int i =0;
	    while(i < InputWords.size() ) {
	    	
	    	if(IgnoreAll.contains(InputWords.get(i).toLowerCase())) {          //makes all words lowercase
	    		
	    		
	    InputWords.remove(i);          //removes ignored word
	    		
	    	}
	    	else {
	    		i++;
	    	}
	    	
	    }
	    

	        for ( i = 0; i <InputWords.size() ; i++) {
	        	 
	        	System.out.println(InputWords.get(i));
	        	
	        
			}                           

	        FrequencyTable f = new FrequencyTable();
	        f.WordCountFile(InputWords);                       //pass the words to the frequency class

	        


	input.close();
	ignorewords.close();		//closes the file
	}
	}




		
	
	
	
	
	
	
	
	
	
	
	
	

