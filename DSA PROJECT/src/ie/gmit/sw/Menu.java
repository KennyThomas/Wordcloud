package ie.gmit.sw;

import java.util.Scanner;

public class Menu extends Abstract{
	public static void main(String[] args)throws Exception {
		
	
	}
	String option;
	boolean keepgoing = true;           //to stop the while loop
	
	Scanner reader = new Scanner(System.in);


	public  void display() throws Exception {
	
		
		System.out.println("   DSA Project ");
		System.out.println("    Word Cloud ");
		System.out.println("=====================");
		System.out.println("Option 1| select url");
		System.out.println("Option 2| select file");                          // menu for the user to enter in the option
		System.out.println("Option 3| enter number of words to display");
		System.out.println("option 4| enter image name");
		System.out.println("option 5| quit");
		option = reader.nextLine();
		
		
		while(keepgoing != false) {
		if(option.equals("5")) {
			System.out.println("programme closed");    //programme will close
			keepgoing = false;
		
		
		}
		
		
		  else if (option.equals("1")){
		    	keepgoing = true;
		        System.out.println("Please enter in your url ");
		    	url = reader.nextLine();
		    	System.out.println("your url is " + url);
		    	Parser parser = new Parser();              //if user selects 1 they can enter a URL  and it will go to the URL parser class
				parser.UrlParser();
			
				}
				
		    else if (option.equals("2")){
		    	keepgoing = true;
		    	System.out.println("Enter the file name");
				YourFile = reader.nextLine();
				System.out.println("your file namae is " + YourFile);  ;       //if user selects 1 they can enter a file name and it will go to the file parser class
				Words words = new Words();         
				words.ReadWords();
			
				}
				
		    else if (option.equals("3")){
		    	keepgoing = true;
		    	System.out.println("Enter the max number of words");
				MaxNumWords = reader.nextInt();                                 //user enter how many words they want to appear on the wordcloud
				System.out.println("The max number of words is " + MaxNumWords);
			
				}
				
				
		    else if (option.equals("4")){
		    	keepgoing = true;
			   System.out.println("Enter image name");
				ImageName = reader.nextLine();                        //user decides what they want the image to be called
				System.out.println("your image name is " + ImageName);
			
		
		    }
		System.out.println("   DSA Project ");
		System.out.println("    Word Cloud ");
		System.out.println("=====================");
		System.out.println("Option 1| select url");
		System.out.println("Option 2| select file");
		System.out.println("Option 3| enter number of words to display");
		System.out.println("option 4| enter image name");
		System.out.println("option 5| quit");
		option = reader.nextLine();

				}
	


			
		    
			
		}


			
			
			
			
			
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
