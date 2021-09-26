package VAT_COUNT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import VAT_COUNT.date.firstListener;

class Pay extends JDialog {
	JButton cash = new JButton("현금 결제") ;
	JButton card = new JButton("카드 결제") ;
	
	public Pay() {
		setTitle("결제") ;
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
				JOptionPane.showMessageDialog(null, "결제되었습니다!", "Message", JOptionPane.INFORMATION_MESSAGE) ;
		}
	}
}
