package VAT_COUNT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import VAT_COUNT.date.firstListener;

class Pay extends JDialog {
	JButton cash = new JButton("���� ����") ;
	JButton card = new JButton("ī�� ����") ;
	
	public Pay() {
		setTitle("����") ;
		setLayout(null) ;
		cash.setBounds(80,50,100,50);
		card.setBounds(200,50,100,50);
		add(cash) ;
		add(card) ;
		cash.addActionListener(new payListener()) ;
		card.addActionListener(new payListener()) ;
		setSize(400,200) ;
		
		setVisible(true) ;
	
		}
	class payListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "�����Ǿ����ϴ�!", "Message", JOptionPane.INFORMATION_MESSAGE) ;
		}
	}
}
