import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

class ButtonTest {

	@Test
	void test() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(300, 200);
		
		JButton button = new JButton("submit");
		button.setBackground(Color.BLUE);
		button.setBackground(Color.RED);
		
		frame.add(button);
		
		try{Thread.sleep(3000);}catch(InterruptedException e){}
	}

}
