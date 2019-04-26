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

public class CreateImage extends Menu{

	public static void main(String args[]) throws IOException{

	}
	public void WordCloudImage(List<String> text) throws Exception {


	//	ArrayList<String> MostUsedWords = new ArrayList<String>();
		Random rand = new Random();

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

                                                                                           // I  used the sample code on Moodle to create image
                                                                                           // I added the for loop to display the chosent amount words in random locations on the image

		for (int i = 0;i <= MaxNumWords; i++) {   // loops until it reaches how many words you wanted to display

		 font = new Font(Font.MONOSPACED, Font.ITALIC, rand.nextInt(250) + 100);     // I used the .Random to get different sized fonts for each word
		 graphics.setFont(font);
		 graphics.setColor(Color.black);

		 graphics.drawString(text.get(i) , rand.nextInt(3000), rand.nextInt(3000));          //It took me a long time to get the size of the image and font so you can see every words
		++i;
		}

		 graphics.dispose();
		 ImageIO.write(image, "png", new File(ImageName + ".png"));      //creates the image

		 }



	}


