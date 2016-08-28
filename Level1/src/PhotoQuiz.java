 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
		String imageURL = "https://www.cesarsway.com/sites/newcesarsway/files/styles/large_article_preview/public/Common-dog-behaviors-explained.jpg?itok=FSzwbBoi";
		// 2. create a variable of type "Component" that will hold your image
		Component dogImage;
		// 3. use the "createImage()" method below to initialize your Component
		dogImage = createImage(imageURL);
		// 4. add the image to the quiz window
		quizWindow.add(dogImage);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What is this thing?");
		// 7. print "CORRECT" if the user gave the right answer
		if(answer.equals("dog")){
			System.out.println("CORRECT GOOD JOB");
		}else{
			System.out.println("no thats wrong its a dog. :(((((((");
		}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
		quizWindow.remove(dogImage);
		// 10. find another image and create it (might take more than one line of code)
		String imageURL2 = "https://www.royalcanin.com/~/media/Royal-Canin/Product-Categories/cat-adult-landing-hero.ashx";
		Component catImage;
		catImage = createImage(imageURL2);
		// 11. add the second image to the quiz window
		quizWindow.add(catImage);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String Answer2 = JOptionPane.showInputDialog("What is THIS thing?");
		// 14+ check answer, say if correct or incorrect, etc.
		if(Answer2.equals("cat")){
			System.out.println("yes that is indeed correct");
		}else{
			System.out.println("no ;-;");
		}
		quizWindow.remove(catImage);
		
		String imageURL3 = "https://lh3.googleusercontent.com/xfC8_TBvSwNfgvmp4Y5CI1Dv9iG2Q_LGPoM9UjO2XGUHp4MdtCtcir7wCMZuIFp9hg=w300";
		Component qImage;
		qImage = createImage(imageURL3);
		quizWindow.add(qImage);
		quizWindow.pack();
		String answer3 = JOptionPane.showInputDialog("What is this?");
		if(answer3.equals("q")){
			System.out.println("YESTHAT");
		}else if(answer3.equals("letter")){
			System.out.println("Yeah, close enough. It's supposed to be q, but whatever.");
		}else{
			System.out.println("no.");
		}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





