import java.awt.*;
import java.awt.event.*;

public class Closable extends WindowAdapter {
	Frame f;

	public Closable() {
		// TODO Auto-generated constructor stub
		f=new Frame();
		f.setSize(200,200);
		f.setVisible(true);
		f.addWindowListener(this);
		
	}
	public void windowClosing(WindowEvent e) {
		System.exit(0);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Closable();

	}

}
