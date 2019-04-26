package ie.gmit.sw;
import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.Spring;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Random;
public class CreateImage extends Menu{

	public static void main(String args[]) throws IOException{

	}
	public void WordCloudImage(List<String> text) throws Exception {           //gets words from previous page
		
		
		ArrayList<String> MostUsedWords = new ArrayList<String>();
		Random rand = new Random();  // used random for words and colors
		
		
		Font font = new Font(Font.SANS_SERIF, Font.BOLD, 62);
		 BufferedImage image = new BufferedImage(4000,4000, BufferedImage.TYPE_4BYTE_ABGR);
		
	
		 Graphics graphics = image.getGraphics();
		 
		 font = new Font(Font.SANS_SERIF, Font.ITALIC, 200);
		 graphics.setColor(Color.red);
		 graphics.setFont(font);
		 graphics.drawString("Data Structures", 0, 200);

		 font = new Font(Font.SANS_SERIF, Font.ITALIC, 200);
		 graphics.setFont(font);
		 graphics.setColor(Color.yellow);
		 graphics.drawString("and Algorithms", 0, 400);

		 font = new Font(Font.MONOSPACED, Font.PLAIN, 200);
		 graphics.setFont(font);
		 graphics.setColor(Color.orange);
		 graphics.drawString("2019 Assignment", 0, 600);
		 
		 font = new Font(Font.MONOSPACED, Font.PLAIN, 200);
		 graphics.setFont(font);
		 graphics.setColor(Color.green);
		 graphics.drawString("G00359994 - Thomas Kenny", 0, 900);
		 
		 int r = rand.nextInt(256);
		 int g = rand.nextInt(256);
		 int b = rand.nextInt(256);                                                                           // I  used the sample code on Moodle to create image
		 int r2 = 0 , g2 =0 , b2 = 0;                                                                                            // I added the for loop to display the chosent amount words in random locations on the image
		 System.out.println("If you would like the colors to be random type 1 or create your  color type 2 ");
	     int Choice= reader.nextInt();                                                                    
                                 if(Choice == 1) {
                                	 
                                	 
                                		for (int i = 0;i <= MaxNumWords; i++) {   // loops until it reaches how many words you wanted to display
                            				
                                			 font = new Font(Font.MONOSPACED, Font.ITALIC, rand.nextInt(250) + 100);     // I used the .Random to get different sized fonts for each word
                                			 graphics.setFont(font);
                                			 Color randomColour = new Color(r,g,b); 
                                			  r = rand.nextInt(256);
                                			  g = rand.nextInt(256);            // I used this to get the colors to be random 
                                			  b = rand.nextInt(256);   
                                			 graphics.setColor(randomColour);   
                                			
                                			 graphics.drawString(text.get(i) , rand.nextInt(3000), rand.nextInt(3000));        
                                			++i;
                                			} 
                                		
                                			 graphics.dispose();
                                			 ImageIO.write(image, "png", new File(ImageName + ".png"));      //creates the image
                                			
                                			 }
                                 else if(Choice == 2) {
                                	 
                                     System.out.println("Enter a number between 1 and 256 for R");     	                                  
                                      r2 = reader.nextInt();   
                                      
                                      System.out.println("Enter a number between 1 and 256 for G");     	                 // I added the function so the user can make their own color                                                          
                                      g2 = reader.nextInt();   
                                      
                                      System.out.println("Enter a number between 1 and 256 for B");     	                                                                           
                                      b2 = reader.nextInt();   

         Color UserColour = new Color(r2,g2,b2); 
         
         
		for (int i = 0;i <= MaxNumWords; i++) {   
				
		 font = new Font(Font.MONOSPACED, Font.ITALIC, rand.nextInt(250) + 100);     
		 graphics.setFont(font);
		 graphics.setColor(UserColour); 

		 graphics.drawString(text.get(i) , rand.nextInt(3000), rand.nextInt(3000));               //same as above 
		++i;                                                                                  
		} 
	
		 graphics.dispose();
		 ImageIO.write(image, "png", new File(ImageName + ".png"));      
		
		 }
	}
		
		
		
	}
	 
	 
