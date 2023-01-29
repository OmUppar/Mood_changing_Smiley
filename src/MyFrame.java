import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;


public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label;
	ImageIcon smile;
	ImageIcon nervous;
	ImageIcon wonder;
	ImageIcon sad;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		label= new JLabel();
		label.addMouseListener(this);
		smile = new ImageIcon("Smile.png");
		nervous =new ImageIcon("nervous ball.jpg");
		wonder = new ImageIcon("Wonder ball.jpg");
		sad = new ImageIcon("Sad ball.jpg");
		
		label.setIcon(smile);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
//		System.out.println("You Clicked The Mouse");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("You Entered The Component");
		label.setBackground(Color.red);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		label.setIcon(wonder);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		label.setIcon(sad);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		label.setIcon(nervous);
	}

}
