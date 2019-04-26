package ie.gmit.sw;
import java.net.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Parser extends Menu {



	public void UrlParser() throws Exception{
		
		
		
		  URL aURL = new URL (url);
			ArrayList<String> WordsFromUrl = new ArrayList<String>();
			ArrayList<String> IgnoreAll = new ArrayList<String>();
			
			File words = new File("ignorewords.txt");
		    Scanner ignorewords = new Scanner(words);
			
			 System.out.println("protocol = " + aURL.getProtocol());
		     System.out.println("authority = " + aURL.getAuthority());
		     System.out.println("host = " + aURL.getHost());
		     System.out.println("port = " + aURL.getPort());
		     System.out.println("path = " + aURL.getPath());
		     System.out.println("query = " + aURL.getQuery());
		     System.out.println("filename = " + aURL.getFile());
		     System.out.println("ref = " + aURL.getRef());	
		     
		     URLConnection con = aURL.openConnection();
		        InputStream is =con.getInputStream();
		
		        Scanner Words = new Scanner(new InputStreamReader(is));
		       
		     
		        
	
	 Words.useDelimiter("[^A-Za-z0-9É']+");
	    while(Words.hasNext()) {
	    	WordsFromUrl.add(Words.next());
	    	
	    	
	    }
		    
	  while(ignorewords.hasNext()) {
	    	
	    	IgnoreAll.add(ignorewords.next());
	    	
	    }
	  
	    int i =0;
	    while(i < WordsFromUrl.size() ) {
	    	
	    	if(IgnoreAll.contains(WordsFromUrl.get(i).toLowerCase())) {         // I used the same method here as I did for the file parser 
	    		                                                                // I had to add more words to the ignore words file as there was HTML tags 
	    		
	    		
	    WordsFromUrl.remove(i);
	    		
	    	}
	    	else {
	    		i++;
	    	}
	    	
	    }
	        for ( i = 0; i <WordsFromUrl.size() ; i++) {
	        	 
	        	System.out.println(WordsFromUrl.get(i));

			}                           
	        FrequencyTable f = new FrequencyTable();
	        f.WordCountURl(WordsFromUrl);                 //passes the words to the frequency tclass
	}
	

}

	
	
