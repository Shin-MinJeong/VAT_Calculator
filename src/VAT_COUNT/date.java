package VAT_COUNT;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class date extends JFrame{
	public date() {
		setTitle("�ΰ���ġ�� ����") ;
        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
        setSize(1500, 700) ;
        Container c = getContentPane() ;
        c.setLayout(null) ;
		c.setBackground(Color.PINK) ;
		
		JLabel dateLabel = new JLabel("��¥�� �������ּ���.") ;
		dateLabel.setFont(new Font("�޸յձ�������", Font.BOLD, 30)) ;
		dateLabel.setBounds(80, 30, 500, 80) ;
		c.add(dateLabel) ;
		
		JButton first = new JButton("��ݱ�") ;
		JButton second = new JButton("�Ϲݱ�") ;
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
			if(first.getText().equals("��ݱ�"))
				JOptionPane.showMessageDialog(null, "���̰����ڴ� ��û�Ⱓ�� �ƴմϴ�.", "Message", JOptionPane.ERROR_MESSAGE) ;
				setVisible(false) ;
			new count1() ;
		 }
	class secondListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton second = (JButton)e.getSource();
			if(second.getText().equals("�Ϲݱ�"))
				setVisible(false) ;
			new count1() ;
			 }
        }
    }
}