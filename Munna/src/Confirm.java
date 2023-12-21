import javax.swing.*;
import java.awt.event.*;
public class Confirm extends WindowAdapter {
	JFrame f;
	
	public Confirm() {
		// TODO Auto-generated constructor stub
		f=new JFrame();
		f.setSize(400,500);
		f.setVisible(true);
		f.addWindowListener(this);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
	}
	public void windowClosing(WindowEvent e) {
		int choice=JOptionPane.showConfirmDialog(f,"Do You Want To Exit?","Alert",JOptionPane.WARNING_MESSAGE);
	if(choice==JOptionPane.YES_OPTION) {
		System.exit(0);
	}
	}
	public static void main(String[] args) {
		
		new Confirm();
}
}
