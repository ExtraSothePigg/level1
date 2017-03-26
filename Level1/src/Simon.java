import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Simon implements ActionListener{
	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	String input = "";
public static void main(String[] args){
	Simon s = new Simon();
	s.setup();
}

private void setup() {
	b1.setText("1");
	b1.setOpaque(true);
	b2.setText("2");
	b2.setOpaque(true);
	b3.setText("3");
	b3.setOpaque(true);
	b4.setText("4");
	b4.setOpaque(true);
	
	f.add(p);
	p.add(b1);
	p.add(b2);
	p.add(b3);
	p.add(b4);
	f.pack();
	p.setOpaque(true);
	p.setBackground(Color.white);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setVisible(true);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	
	int turn = 1;
	String s = "";
	boolean toggle = true;
	
	while(toggle == true){
	for(int i = 0;i<turn;i++){
	Random Sr = new Random();
	int r = Sr.nextInt(4)+1;
		  if(r == 1){
		s += 1;
		b1.setBackground(Color.red);
	}else if(r == 2){
		s += 2;
		b2.setBackground(Color.yellow);
	}else if(r == 3){
		s += 3;
		b3.setBackground(Color.blue);
	}else if(r == 4){
		s += 4;
		b4.setBackground(Color.green);
	}
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(s);
	b1.setBackground(Color.white);
	b2.setBackground(Color.white);
	b3.setBackground(Color.white);
	b4.setBackground(Color.white);
	
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	if(i >= turn-1){
		toggle = false;
	}
}
}
	
}

@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==b1){
		input += 1;
		System.out.println(input);
	}
	if(e.getSource()==b2){
		input += 2;
		System.out.println(input);
	}
	if(e.getSource()==b3){
		input += 3;
		System.out.println(input);
	}
	if(e.getSource()==b4){
		input += 4;
		System.out.println(input);
	}
}

}

