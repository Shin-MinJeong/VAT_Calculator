package VAT_COUNT;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class date extends JFrame{
	public date() {
		setTitle("부가가치세 계산기") ;
        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
        setSize(1500, 700) ;
        Container c = getContentPane() ;
        c.setLayout(null) ;
		c.setBackground(Color.PINK) ;
		
		JLabel dateLabel = new JLabel("날짜를 선택해주세요.") ;
		dateLabel.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30)) ;
		dateLabel.setBounds(80, 30, 500, 80) ;
		c.add(dateLabel) ;
		
		JButton first = new JButton("상반기") ;
		JButton second = new JButton("하반기") ;
	    first.setSize(170, 100);
		first.setLocation(552, 250);
		second.setSize(170, 100);
		second.setLocation(552, 390);
		c.add(first) ;
		c.add(second) ;
		first.addActionListener(new firstListener()) ;
		second.addActionListener(new firstListener()) ;
		
		setVisible(true) ;
	}
	public static void main(String[] args) {
		new date() ;
	}
	
	class firstListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton first = (JButton)e.getSource();
			if(first.getText().equals("상반기"))
				JOptionPane.showMessageDialog(null, "간이과세자는 신청기간이 아닙니다.", "Message", JOptionPane.ERROR_MESSAGE) ;
				setVisible(false) ;
			new count1() ;
		 }
	class secondListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton second = (JButton)e.getSource();
			if(second.getText().equals("하반기"))
				setVisible(false) ;
			new count1() ;
			 }
        }
    }
}