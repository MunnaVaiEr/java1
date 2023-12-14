package lab2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Maths extends JFrame implements ActionListener {
	JTextField t1,t2,ans;
	JButton plus,minus;
	public Maths() {
	setSize(500,500);
	t1=new JTextField();
	t1.setColumns(10);
	t2=new JTextField();
	t2.setColumns(10);
	ans=new JTextField();
	ans.setColumns(10);
	ans.setEditable(false);
	plus=new JButton("+");
	minus=new JButton("-");
	add(t1);
	add(t2);
	add(ans);
	add(plus);
	add(minus);
	setLayout(new FlowLayout(FlowLayout.LEFT));
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	plus.addActionListener(this);
	minus.addActionListener(this);
	
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int num1=Integer.parseInt(t1.getText());
		int num2=Integer.parseInt(t2.getText());
		if(e.getSource()==plus){
			ans.setText(""+(num1+num2));
		}
		else {
			ans.setText(""+(num1-num2));
			
		}
	}
	public static void main(String[]args) {
		new Maths();
	}

}
