package core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SwingDemo implements ActionListener{
	JLabel l1,l2,l3,l4;
	JTextField t1,t3,t2,t4;
	JButton b1,b2,b3,b4;
	public SwingDemo() {
		JFrame fr =new JFrame("AppName");
		fr.setVisible(true);
		fr.setSize(700, 500);
		fr.setLayout(null);
		
		l1 = new JLabel("Id : ");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);
		
		l2 = new JLabel("Name : ");
		l2.setBounds(100, 130, 120, 20);
		fr.add(l2);
		
		l3 = new JLabel("Contact : ");
		l3.setBounds(100, 160, 120, 20);
		fr.add(l3);
		
		l4 = new JLabel("Email : ");
		l4.setBounds(100, 190, 120, 20);
		fr.add(l4);
		
		t1 = new JTextField();
		t1.setBounds(180, 100, 120, 20);
		fr.add(t1);
		
		t2 = new JTextField();
		t2.setBounds(180, 130, 120, 20);
		fr.add(t2);
		
		t3 = new JTextField();
		t3.setBounds(180, 160, 120, 20);
		fr.add(t3);
		
		t4 = new JTextField();
		t4.setBounds(180, 190, 120, 20);
		fr.add(t4);
		
		b1 = new JButton("Insert");
		b1.setBounds(100, 230, 120, 20);
		fr.add(b1);
		b2 = new JButton("Search");
		b2.setBounds(250, 230, 120, 20);
		fr.add(b2);
		b3 = new JButton("Update");
		b3.setBounds(100, 260, 120, 20);
		fr.add(b3);
		b4 = new JButton("Delete");
		b4.setBounds(250, 260, 120, 20);
		fr.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() ==b1) {
			System.out.println("insert button clicked");
		}
		else if(e.getSource()==b2) {
			System.out.println("saerch button clicked");
		}
		else if(e.getSource()==b3) {
			System.out.println("update button clicked");
		}
		else if(e.getSource()==b4) {
			System.out.println("delete button clicked");
		}
		
	}
}
public class P030_Swing {
	
	public static void main(String[] args) {
		new SwingDemo();
	}
}