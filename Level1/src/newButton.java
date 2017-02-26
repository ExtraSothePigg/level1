import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class newButton{
	JButton button = new JButton();
public static void main(String[] args){
	newButton s = new newButton();
	s.setup();
}

private void setup() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(button);
	frame.pack();
	frame.setVisible(true);
	button.addActionListener((e)->{
			Random Sr = new Random();
			int r = Sr.nextInt(100);
			JOptionPane.showMessageDialog(null, r);
	});
	
}

}
