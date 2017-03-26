import java.util.Random;

import javax.swing.JOptionPane;

public class ControlledRandomness {
	static String s = "";
	public static void main(String[] args){
		String SAsk = JOptionPane.showInputDialog("So how many rows do ya want.");
		int ask = Integer.parseInt(SAsk);
		for(int i = 0;i<ask;i++){
			Random sR = new Random();
			int r = sR.nextInt(10);
			
			s += ""+r;
			System.out.println(s);
			
		}
	}
}
