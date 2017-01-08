import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dice implements ActionListener  {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton();
	
	
public static void main(String[] args){
	Dice d = new Dice();
	d.setup();
}
void makeButton(){
	
	frame.add(panel);
	panel.add(button);
	button.setText("roll dice");
	frame.setVisible(true);
	frame.pack();
}
public void setup(){
	makeButton();
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button){
		Random r = new Random();
		int x = r.nextInt(6);
		JOptionPane.showMessageDialog(null, x);
	}
	
}
}
