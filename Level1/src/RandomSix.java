import java.util.Random;

import javax.swing.JOptionPane;

public class RandomSix {
	
	public static void main(String[]args){
		int i = 0;
		int a = 0;
		String numS1 = JOptionPane.showInputDialog("num 1, between 0-9");
		int num1 = Integer.parseInt(numS1);
		String numS2 = JOptionPane.showInputDialog("num2");
		int num2 = Integer.parseInt(numS2);
		String numS3 = JOptionPane.showInputDialog("num3");
		int num3 = Integer.parseInt(numS3);
		String numS4 = JOptionPane.showInputDialog("num4");
		int num4 = Integer.parseInt(numS4);
		String numS5 = JOptionPane.showInputDialog("num5");
		int num5 = Integer.parseInt(numS5);
		String numS6 = JOptionPane.showInputDialog("num6");
		int num6 = Integer.parseInt(numS6);
		
		for(i=0;i<10000000;i++){
			Random rr1 = new Random();
			int r1 = rr1.nextInt(10);
			Random rr2 = new Random();
			int r2 = rr2.nextInt(10);
			Random rr3 = new Random();
			int r3 = rr3.nextInt(10);
			Random rr4 = new Random();
			int r4 = rr4.nextInt(10);
			Random rr5 = new Random();
			int r5 = rr5.nextInt(10);
			Random rr6 = new Random();
			int r6 = rr6.nextInt(10);
			if(r1==num1&&r2==num2&&r3==num3&&r4==num4&&r5==num5&&r6==num6){
				a = a + 1;
			}
			
		}
		System.out.println(a);
	}
}
