package Day16;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class AnonymousClassListener extends JFrame {
	public AnonymousClassListener() {
		setTitle("Action 이벤트 리스너 작성");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		JButton btn2 = new JButton("배경색 변경");
		c.add(btn);
		c.add(btn2);
		Random ran =new Random();
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setBackground(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
				}
		});
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
			b.setText("액션");
			else
			b.setText("Action");
			setTitle(b.getText());
			}
			});
		
		setSize(350, 150);
		setVisible(true);
	}

	public static void main (String[] args) {
		new AnonymousClassListener();
	}
}
