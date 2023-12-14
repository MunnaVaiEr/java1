package lab2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example implements ActionListener {
	JFrame f;
	JTextField t;
	JButton btn;
	
	public Example() {
		f=new JFrame();
		f.setSize(400,500);
		t=new JTextField();
		t.setColumns(10);
		btn=new JButton("click");
		f.add(t);
		f.add(btn);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Font fn=new Font("Arial",Font.BOLD,20);
		t.setFont(fn);
		t.setBackground(Color.BLACK);
		t.setForeground(Color.RED);
		String text=t.getText();
		t.setText(text.toUpperCase());
	}
	public static void main(String[]args) {
		new Example();
	}

}
