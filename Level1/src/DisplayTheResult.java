import java.util.Random;

import javax.swing.JOptionPane;

public class DisplayTheResult {
	
public static void main(String[] args){
	int a = 0;
	int i = 0;
	String answer = JOptionPane.showInputDialog("Have number 1-100 pls");
	int iAns = Integer.parseInt(answer);
	
	

	for(i=0;i<1000000;i++){
		Random r = new Random();
		int iR = r.nextInt(100);
		if(iR == iAns){
			a = a+1;
		}
		if(i==100000){
			System.out.println(a);
		}

		}
	}
}
