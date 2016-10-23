import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener{
	PigLatinTranslator translator = new PigLatinTranslator();
	JTextField field1 = new JTextField();
	JTextField field2 = new JTextField();
public PigLatin() {
		super();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton();
		button.addActionListener(this);
		frame.add(panel);
		panel.add(field1);
		panel.add(button);
		panel.add(field2);
		frame.setSize(500, 50);
		field1.setColumns(50);
		field2.setColumns(50);
		frame.setTitle("title");
		
		frame.setVisible(true);
		button.setText("translate");

		frame.pack();
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args){
PigLatin latin = new PigLatin();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	field2.setText(translator.translate(field1.getText()));
}
}
