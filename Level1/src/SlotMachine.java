import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SlotMachine implements ActionListener {
	
	
	Random r1 = new Random();
	Random r2 = new Random();
	Random r3 = new Random();
	int num1 = r1.nextInt(9);
	int num2 = r2.nextInt(9);
	int num3 = r3.nextInt(9);
	int cash = 50000;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton spin = new JButton();
	JLabel nums = new JLabel();
	JLabel money = new JLabel();
	JLabel betHere = new JLabel();
	JTextField betAmount = new JTextField(5);
	
	
	public static void main(String[] args){
	SlotMachine s = new SlotMachine();
	s.setup();
	}
	
	public void setup(){
		
		frame.add(panel);
		panel.add(betHere);
		panel.add(betAmount);
		panel.add(spin);
		panel.add(nums);
		panel.add(money);
		nums.setText("" + num1 + " | "+ num2 +" | "+ num3);
		money.setText("|| $"+cash+".00");
		betHere.setText("Bet:");
		frame.setVisible(true);
		spin.setText("Spin!");
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		spin.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==spin){
			
			Random r11 = new Random();
			Random r12 = new Random();
			Random r13 = new Random();
			num1 = r11.nextInt(9);
			num2 = r12.nextInt(9);
			num3 = r13.nextInt(9);
			nums.setText("" + num1 + " | "+ num2 +" | "+ num3);
		}if(num1 == num2 && num2 == num3){
			JOptionPane.showMessageDialog(null, "YOU ARE WIN HIP HIP");
			String sBet = betAmount.getText();
			int bet = Integer.parseInt(sBet);
			int win = bet * 20;
			cash = cash + win;
			money.setText("|| $"+cash+".00");
			frame.pack();
		}else if(num1 == num2 && num2 == num3 && num3 == 6){
			JOptionPane.showMessageDialog(null, "You feel your sins crawling up your back.");
			System.exit(0);
	}else if(num1 == num2 && num2 == num3 && num3 == 7){
		JOptionPane.showMessageDialog(null, "Y'got lucky.");
		cash = cash * 7;
	}else{
			String sBet = betAmount.getText();
			int bet = Integer.parseInt(sBet);
			
			cash = cash - bet;
			money.setText("|| $"+cash+".00");
			frame.pack();
		}if(cash <= 0){
			System.exit(0);
		}if(cash == 666){
			System.exit(0);
		}
	}
}