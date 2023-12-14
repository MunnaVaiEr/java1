package lab2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colours extends JFrame implements ActionListener  {
	JButton black,blue,red;
	
	public Colours() {
		setSize(500,500);
		black=new JButton("Black");
		blue=new JButton("Blue");
		red=new JButton("Red");
		add(black);
		add(blue);
		add(red);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		black.addActionListener(this);
		blue.addActionListener(this);
		red.addActionListener(this);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==black) {
		/*setBackground(Color.black);*/
		getContentPane().setBackground(Color.BLACK);
		}
		else if(e.getSource()==blue) {
			getContentPane().setBackground(Color.BLUE);
			
		}
		else {
			getContentPane().setBackground(Color.RED);
		}
	}
	public static void main(String[]args) {
		new Colours();
	}
}
