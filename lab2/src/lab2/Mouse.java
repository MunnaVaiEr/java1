package lab2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse implements MouseListener,MouseMotionListener {
	JFrame f;
	JTextField t1,t2;
	public Mouse() {
		f=new JFrame();
		f.setSize(400,500);
		t1=new JTextField();
		t1.setColumns(10);
		t2=new JTextField();
		t2.setColumns(10);
		f.add(t1);
		f.add(t2);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.addMouseListener(this);
		f.addMouseMotionListener(this);
		
		
	}
public void mouseEntered(MouseEvent e) {
	t1.setText("In");
}
public void mouseExited(MouseEvent e) {
	t1.setText("Out");
}
public void mouseMoved(MouseEvent e) {
	t2.setText("X="+e.getX()+"Y="+e.getY());
}
public void mouseClicked(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
public void mouseDragged(MouseEvent e) {}

public static void main(String[]args) {
	new Mouse();
}
}

