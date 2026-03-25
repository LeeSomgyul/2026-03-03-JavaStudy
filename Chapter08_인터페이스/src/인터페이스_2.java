import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class 인터페이스_2 extends JFrame implements ActionListener{
	
	JButton north = new JButton("North");
	//JButton south = new JButton("South");
	JButton center = new JButton("Center");
	JButton east = new JButton("East");
	JButton west = new JButton("West");
	JTextField tf = new JTextField();
	
	public 인터페이스_2() {
		add("North", north);
		//add("South", south);
		add("Center", center);
		add("East", east);
		add("West", west);
		add("South", tf);
		
		setSize(350, 400);
		setVisible(true);
		
		north.addActionListener(this);
		//south.addActionListener(this);
		center.addActionListener(this);
		east.addActionListener(this);
		west.addActionListener(this);
	}

	public static void main(String[] args) {
		
		new 인터페이스_2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == north) {
			JOptionPane.showMessageDialog(this, "North 버튼이 클릭되었습니다.");
		}
		else if(e.getSource() == center) {
			JOptionPane.showMessageDialog(this, "Center 버튼이 클릭되었습니다.");
		}
		else if(e.getSource() == east) {
			JOptionPane.showMessageDialog(this, "East 버튼이 클릭되었습니다.");
		}
		else if(e.getSource() == west) {
			JOptionPane.showMessageDialog(this, "West 버튼이 클릭되었습니다.");
		}
		
	}

}
