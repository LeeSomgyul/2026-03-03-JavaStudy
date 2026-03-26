import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
interface Rand{
	public void rand(int [] com);
}

public class 숫자야구게임 extends JFrame implements ActionListener, Rand{

	JTextArea ta = new JTextArea();
	JTextField tf = new JTextField(10);
	JButton start = new JButton("시작");
	JButton end = new JButton("종료");
	
	private int[] com = new int[3];
	private int[] user = new int[3];
	private int s,b;
	
	public 숫자야구게임() {
		JScrollPane js = new JScrollPane(ta);
		JPanel p = new JPanel();
		p.add(tf);
		p.add(start);
		p.add(end);
		ta.setEditable(false); 
		tf.setEnabled(false);
		
		add("Center", js);
		add("South", p);
		setSize(350, 400);
		setVisible(true);
		
		start.addActionListener(this);
		tf.addActionListener(this);
		end.addActionListener(this);
	}
	
	public static void main(String[] args) {
		
		new 숫자야구게임();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == end) {
			JOptionPane.showMessageDialog(this, "프로그램 종료");
			System.exit(0);
		}else if(e.getSource() == start) {
			JOptionPane.showMessageDialog(this, "야구게임을 시작합니다");
			rand(com);
			tf.setEnabled(true);
			tf.requestFocus();
			start.setEnabled(false);
		}
		else if(e.getSource() == tf) {
			String strInput = tf.getText();
			int input = 0;
			try {
				input = Integer.parseInt(strInput);
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다.");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			if(input<99 || input > 999) {
				JOptionPane.showMessageDialog(this, "세자리 정수만 입력 가능합니다.");
				tf.setText("");
				tf.requestFocus();
			}
			
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {
				JOptionPane.showMessageDialog(this, "중복된 수는 사용할 수 없습니다.");
				tf.setText("");
				tf.requestFocus();
			}
			
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				JOptionPane.showMessageDialog(this, "0은 사용할 수 없습니다.");
				tf.setText("");
				tf.requestFocus();
			}
			
			s=0;
			b=0;
			
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(com[i] == user[j]) {
						if(i==j) {
							s++;
						}else {
							b++;
						}
					}
				}
			}
			
			String hit = String.format("Input Number: %d, Result: %dS-%dB\n" ,input, s, b );
			ta.append(hit);
			
			if(s==3) {
				JOptionPane.showMessageDialog(this, "게임오버!!");
				System.exit(0);
			}
			tf.setText("");
			tf.requestFocus();
		}
	}

	@Override
	public void rand(int[] com) {
		for(int i=0; i<3; i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j=0; i<i; j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
		
	}
	
	

}
