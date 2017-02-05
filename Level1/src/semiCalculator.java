import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class semiCalculator implements ActionListener{
	Random rButton = new Random();
	int x = rButton.nextInt(50);
	String s = ""+x;
	JLabel num = new JLabel();
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton randomize = new JButton();
public static void main(String[] args){
semiCalculator s = new semiCalculator();
s.setup();
	
	
	}
public void setup(){
	
	
	
	
	
	num.setText(s);
	add.setText("add");
	subtract.setText("subtract");
	randomize.setText("randomize");
	
	add.addActionListener(this);
	subtract.addActionListener(this);
	randomize.addActionListener(this);
	
	frame.setVisible(true);
	frame.add(panel);
	panel.add(add);
	panel.add(subtract);
	panel.add(randomize);
	panel.add(num);
	frame.pack();
	
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
if(e.getSource() == add){
	x = x + 1;
	s = ""+x;
	num.setText(s);
}else if(e.getSource()==subtract){
	x = x - 1;
	s = ""+x;
	num.setText(s);
}else if(e.getSource()==randomize){
	Random r = new Random();
	int y = r.nextInt(50);
	x = y;
	s = ""+x;
	num.setText(s);
}
	
}
}
