import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class quickCalc implements ActionListener{
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JTextField jtf = new JTextField(5);
	JButton dbl = new JButton();
	JButton sqr = new JButton();
	public static void main(String[] args){
		quickCalc s = new quickCalc();
		s.setup();
}
public void setup(){
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	dbl.setText("Double Value");
	sqr.setText("Square Value");
	f.add(p);
	p.add(dbl);
	p.add(jtf);
	p.add(sqr);
	f.pack();
	f.setVisible(true);
	dbl.addActionListener(this);
	sqr.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==dbl){
		String sst = jtf.getText();
		int st = Integer.parseInt(sst);
		st = st * 2;
		JOptionPane.showMessageDialog(null, st);
	}if(e.getSource()==sqr){
		String sst = jtf.getText();
		int st = Integer.parseInt(sst);
		st = st * st;
		JOptionPane.showMessageDialog(null, st);
	}
}
}