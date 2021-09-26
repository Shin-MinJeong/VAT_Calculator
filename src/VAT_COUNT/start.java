package VAT_COUNT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class start extends JFrame {
	
	public start() {
		setTitle("부가가치세 계산기") ;
        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
        setSize(1500, 700) ;
        Container c = getContentPane() ;
        c.setLayout(null) ;
		c.setBackground(Color.PINK) ;
		
		JLabel startLabel = new JLabel("VAT COUNT") ;
		JLabel nameLabel  = new JLabel("이름") ;
		JLabel numLabel   = new JLabel("사업자번호") ;
		startLabel.setFont(new Font("Bauhaus 93", Font.BOLD, 50)) ;
		 nameLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 18)) ;
		 numLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 18)) ;
		startLabel.setBounds(504, 200, 500, 80) ;
		 nameLabel.setBounds(480, 300, 100, 30);
		 numLabel.setBounds(430, 330, 100, 30);
		c.add(startLabel) ;
		c.add(nameLabel) ;
		c.add(numLabel) ;
		
		JTextField name = new JTextField(20) ;
		JTextField  num = new JTextField(10) ;
		
		name.setBounds(533, 300, 200, 30);
		 num.setBounds(533, 330, 200, 30);
		c.add(name) ;
		c.add(num)  ;
		
		JButton next = new JButton("다음") ;
		next.setSize(70, 50);
		next.setLocation(590, 450);
		next.addActionListener(new nextListener()) ;
		c.add(next) ;
		
		setVisible(true) ;
	}
	public static void main(String[] args) {
		new start() ;
	}
	
	class nextListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton next = (JButton)e.getSource();
			if(next.getText().equals("다음"))
				setVisible(false) ;
			new date() ;
		 }
	  }
  }
