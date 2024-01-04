package myfirstprogram;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class myframe extends JFrame {
			JButton button;
			myframe(){
				
				ImageIcon icon = new ImageIcon("face.jpeg");
			    button =new JButton();
				button.setBounds(200,100,100,50);
				button.addActionListener(e -> System.out.println("Hellooo"));
				button.setText("Hellows");
				button.setFocusable(false);
				button.setIcon(icon);
				
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLayout(null);
				this.setSize(500,500);
				this.setVisible(true); 
				this.add(button);
			}
		
}
