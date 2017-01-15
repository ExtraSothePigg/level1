import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;

public class FancyWindow implements KeyListener {

	JFrame frame = new JFrame();
	
	public static void main(String[] args) {
		FancyWindow f = new FancyWindow();
		f.buildWindow();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_ENTER){
			Random r = new Random();
			Random r2 = new Random();
			int y = r2.nextInt(1080);
			int x = r.nextInt(1080);
			frame.setSize(x,y);
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	void buildWindow() {
		frame.addKeyListener(this);
		frame.setVisible(true);
	}
}
