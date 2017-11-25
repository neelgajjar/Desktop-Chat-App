import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Login {
public static void main(String [] args){
	final JFrame login = new JFrame("Login");
	JPanel panel = new JPanel();
	final JTextField loginName = new JTextField(20);
	JButton enter = new JButton("Login");
	
	panel .add(loginName);
	panel.add(enter);
	login.add(panel);
	login.setSize(300, 100);
	login.setVisible(true);
	login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	enter.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			try {
				ChatClient client = new ChatClient(loginName.getText());
				login.setVisible(false);
				login.dispose();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
	});
	
	loginName.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			if(e.getKeyCode() == KeyEvent.VK_ENTER){
				try {
					ChatClient client = new ChatClient(loginName.getText());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				login.setVisible(false);
				login.dispose();
			}
			
		}
	});
}
}
