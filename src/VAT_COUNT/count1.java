package VAT_COUNT;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import VAT_COUNT.start;

    public class count1 extends JFrame {	
    	JTextField jf1 = new JTextField(20) ;
		JTextField jf2 = new JTextField(20) ;
		JTextField jf3 = new JTextField(20) ;
		JTextField jf4 = new JTextField(20) ;
		JTextField jf5 = new JTextField(20) ;
		JTextField jf6 = new JTextField(20) ;

	    public count1() {
		
		setTitle("�ΰ���ġ�� ����") ;
		setDefaultCloseOperation(EXIT_ON_CLOSE) ;
		setSize(1500, 700) ;
        Container c = getContentPane() ;
        c.setLayout(null) ;
		c.setBackground(Color.PINK) ;
		
		JLabel count1Label = new JLabel("������ ������ �Է����ּ���.") ;
		JLabel warring  = new JLabel("  ���ڸ� �Է��ϼ���!") ;
		JLabel jf1Label = new JLabel(" ���� ���ݰ�꼭") ;
		JLabel jf2Label = new JLabel(" ���� �ſ�ī��") ;
		JLabel jf3Label = new JLabel(" ���� ��Ÿ") ;
		JLabel jf4Label = new JLabel(" ���ݰ�꼭 ����") ;
		JLabel jf5Label = new JLabel(" ���ݰ�꼭 �����ڻ�") ;
		JLabel jf6Label = new JLabel(" �� �� ���Ժ�") ;
		 	
		count1Label.setFont(new Font("�޸յձ�������", Font.BOLD, 30)) ;
		 warring.setFont(new Font("���Ļ�浸��", Font.BOLD, 30));
		jf1Label.setFont(new Font("���Ļ�浸��", Font.BOLD, 15)) ;
		jf2Label.setFont(new Font("���Ļ�浸��", Font.BOLD, 15)) ;
		jf3Label.setFont(new Font("���Ļ�浸��", Font.BOLD, 15)) ;
		jf4Label.setFont(new Font("���Ļ�浸��", Font.BOLD, 15)) ;
		jf5Label.setFont(new Font("���Ļ�浸��", Font.BOLD, 15)) ;
		jf6Label.setFont(new Font("���Ļ�浸��", Font.BOLD, 15)) ;
		
		count1Label.setBounds(80, 30, 500, 80) ;
		 warring.setBounds(485, 100, 500, 80);
		jf1Label.setBounds(189, 230, 200, 30) ;
		jf2Label.setBounds(198, 330, 200, 30) ;
		jf3Label.setBounds(230, 430, 200, 30) ;
		jf4Label.setBounds(688, 230, 200, 30) ;
		jf5Label.setBounds(658, 330, 200, 30) ;
		jf6Label.setBounds(708, 430, 200, 30) ;
		
		jf1Label.setToolTipText("���ݰ�꼭�� �߱��� ���⳻���� �Է��մϴ�. ") ;
		jf2Label.setToolTipText("�ſ�ī�� ���⳻���� �Է��մϴ�. ") ;
		jf3Label.setToolTipText("�Ӵ�� �����ڴ� �Է� ��ư�� ���� �ε��� ��༭�� �������� �Է��մϴ�. ") ;
		jf4Label.setToolTipText("���ݰ�꼭�� ������� ���Գ����� �Է��մϴ�. ") ;
		jf5Label.setToolTipText("���� ���� �ڻ� ������ �Է��մϴ�. ") ;
		jf6Label.setToolTipText("�� �� �ſ�ī��/���ݿ����� ���� ������ �Է��մϴ�. (���� ��� �Է�) ") ;
		
		c.add(count1Label) ;
		c.add(warring) ;
		c.add(jf1Label) ;
		c.add(jf2Label) ;
		c.add(jf3Label) ;
		c.add(jf4Label) ;
		c.add(jf5Label) ;
		c.add(jf6Label) ;
	
		jf1.setBounds(320, 230, 200, 30);
		jf2.setBounds(320, 330, 200, 30);
		jf3.setBounds(320, 430, 200, 30);
		jf4.setBounds(820, 230, 200, 30);
		jf5.setBounds(820, 330, 200, 30);
		jf6.setBounds(820, 430, 200, 30);
		
		c.add(jf1) ;
		c.add(jf2) ;
		c.add(jf3) ;
		c.add(jf4) ;
		c.add(jf5) ;
		c.add(jf6) ; 
    	
    	JButton realty = new JButton("�Է�") ;
		realty.setSize(70, 50);
		realty.setLocation(155, 420);
		realty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String year = JOptionPane.showInputDialog("�������� �Է��ϼ���.") ;
				if(year != null)
					jf3.setText(year);
			}
		}) ;
		c.add(realty) ;
		
		ToolTipManager m = ToolTipManager.sharedInstance() ;
		m.setInitialDelay(0) ;
		
		JButton fin = new JButton("Ȯ��") ;
		fin.setSize(200, 50);
		fin.setLocation(525, 580) ;
		fin.addActionListener(new finListener()) ;
		c.add(fin) ;
		

		setVisible(true) ;

	}
	
	class finListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton fin = (JButton)e.getSource();
			if(fin.getText().equals("Ȯ��")) {
				setVisible(false) ;
			new count2() ;
			}
		 }
	 }
	
	class count2 extends JFrame {
		private ImageIcon napbu = new ImageIcon("napbu.png");
		count2() { 
			
			setTitle("�ΰ���ġ�� ����") ;
	        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
	        setSize(1500, 700) ;
	        Container c = getContentPane() ;
	        c.setLayout(null) ;
			c.setBackground(Color.PINK) ;
			
			JLabel c2Label = new JLabel("�ݾ��� Ȯ�����ּ���.") ;
			c2Label.setFont(new Font("�޸յձ�������", Font.BOLD, 30)) ;
			c2Label.setBounds(80, 30, 500, 80) ;
			
			c.add(c2Label) ;
					
			JButton next2 = new JButton(napbu) ;
			next2.addActionListener(new next2Listener()) ;
			next2.setSize(200, 140);
			next2.setLocation(900, 180);
			c.add(next2) ;		
			
			String tf1 = jf1.getText() ;
			String tf2 = jf2.getText() ;
			String tf3 = jf3.getText() ;
			String tf4 = jf4.getText() ;
			String tf5 = jf5.getText() ;
			String tf6 = jf6.getText() ;
			
			int n1=0, n2=0, n3=0, n4=0, n5=0, n6=0 ;
			try {
				n1 = Integer.parseInt(tf1);
				n2 = Integer.parseInt(tf2);
				n3 = Integer.parseInt(tf3);
				n4 = Integer.parseInt(tf4);
				n5 = Integer.parseInt(tf5);
				n6 = Integer.parseInt(tf6);

			}catch(NumberFormatException e) {
				e.printStackTrace() ;
			}
			int sum = (n1+n2+n3) ;
			int mum = (n4+n5+n6) ;
			int fin = (int)((sum-mum)*0.1) ;
			
			JLabel SLabel = new JLabel("����ǥ�ظ� :  " + sum ) ;
			JLabel PLabel = new JLabel("�� ���Ժ�   :  " + mum  ) ;
			JLabel FLabel = new JLabel("���� �ݾ� :  " + fin  ) ;
			JLabel ALabel = new JLabel("ȯ�� ���� :  ") ;
			SLabel.setFont(new Font("���Ļ�浸��", Font.BOLD, 20)) ;
			PLabel.setFont(new Font("���Ļ�浸��", Font.BOLD, 20)) ;
			FLabel.setFont(new Font("���Ļ�浸��", Font.BOLD, 27)) ;
			ALabel.setFont(new Font("���Ļ�浸��", Font.BOLD, 20)) ;
			SLabel.setBounds(198, 230, 500, 30) ;
			SLabel.setBounds(198, 230, 500, 30) ;
			PLabel.setBounds(198, 280, 500, 30) ;
			FLabel.setBounds(198, 430, 500, 30) ;
			ALabel.setBounds(198, 480, 500, 30) ;
			c.add(SLabel) ;
			c.add(PLabel) ;
			c.add(FLabel) ;
			c.add(ALabel) ;
			
			JTextField account  = new JTextField(20) ;
			account.setBounds(300,480,300,30);
			
			if(fin>0) {
				account.setEnabled(false);
			}
			else {
			account.setEnabled(true);
			}
			
			c.add(account);
			
			setVisible(true) ;
		}
		class next2Listener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
					new Pay() ;
				
			 }
		 }
	 }

	public static void main(String[] args) {
		new count1() ;
	}	
 }