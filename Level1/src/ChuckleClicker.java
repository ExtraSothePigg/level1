import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton jokeBtn = new JButton();
	JButton punchBtn = new JButton();
	public static void main(String[] args) {
		ChuckleClicker c = new ChuckleClicker();
		c.setup();

	}

	 void makeButtons() {
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		punchBtn.setText("punchline");
		jokeBtn.setText("joke");
		panel.add(jokeBtn);
		panel.add(punchBtn);
		frame.pack();
	}

	public void setup() {
		makeButtons();
		jokeBtn.addActionListener(this);
		punchBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jokeBtn){
			JOptionPane.showMessageDialog(null, "import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import javax.swing.JButton;import javax.swing.JFrame;import javax.swing.JOptionPane;import javax.swing.JPanel;public class ChuckleClicker implements ActionListener {JFrame frame = new JFrame();JPanel panel = new JPanel();JButton jokeBtn = new JButton();JButton punchBtn = new JButton();public static void main(String[] args) {ChuckleClicker c = new ChuckleClicker();c.setup();}void makeButtons() {frame.add(panel);frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);frame.setVisible(true);punchBtn.setText(punchline);jokeBtn.setText(joke);panel.add(jokeBtn);panel.add(punchBtn);frame.pack();}public void setup() {makeButtons();jokeBtn.addActionListener(this);.addActionListener(this);	} void actionPerformed(ActionEvent e) {if(e.getSource()==jokeBtn){JOptionPane.showMessageDialog(null, what is life);");
		}
		if(e.getSource()==punchBtn){
			JOptionPane.showMessageDialog(null, "that was the joke");
		}
		
	}
}
