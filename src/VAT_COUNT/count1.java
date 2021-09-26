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
		
		setTitle("부가가치세 계산기") ;
		setDefaultCloseOperation(EXIT_ON_CLOSE) ;
		setSize(1500, 700) ;
        Container c = getContentPane() ;
        c.setLayout(null) ;
		c.setBackground(Color.PINK) ;
		
		JLabel count1Label = new JLabel("귀하의 정보를 입력해주세요.") ;
		JLabel warring  = new JLabel("  숫자만 입력하세요!") ;
		JLabel jf1Label = new JLabel(" 과세 세금계산서") ;
		JLabel jf2Label = new JLabel(" 과세 신용카드") ;
		JLabel jf3Label = new JLabel(" 과세 기타") ;
		JLabel jf4Label = new JLabel(" 세금계산서 매입") ;
		JLabel jf5Label = new JLabel(" 세금계산서 고정자산") ;
		JLabel jf6Label = new JLabel(" 그 외 매입분") ;
		 	
		count1Label.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30)) ;
		 warring.setFont(new Font("한컴산뜻돋움", Font.BOLD, 30));
		jf1Label.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15)) ;
		jf2Label.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15)) ;
		jf3Label.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15)) ;
		jf4Label.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15)) ;
		jf5Label.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15)) ;
		jf6Label.setFont(new Font("한컴산뜻돋움", Font.BOLD, 15)) ;
		
		count1Label.setBounds(80, 30, 500, 80) ;
		 warring.setBounds(485, 100, 500, 80);
		jf1Label.setBounds(189, 230, 200, 30) ;
		jf2Label.setBounds(198, 330, 200, 30) ;
		jf3Label.setBounds(230, 430, 200, 30) ;
		jf4Label.setBounds(688, 230, 200, 30) ;
		jf5Label.setBounds(658, 330, 200, 30) ;
		jf6Label.setBounds(708, 430, 200, 30) ;
		
		jf1Label.setToolTipText("세금계산서로 발급한 매출내역을 입력합니다. ") ;
		jf2Label.setToolTipText("신용카드 매출내역을 입력합니다. ") ;
		jf3Label.setToolTipText("임대업 종사자는 입력 버튼을 눌러 부동산 계약서의 보증금을 입력합니다. ") ;
		jf4Label.setToolTipText("세금계산서로 발행받은 매입내역을 입력합니다. ") ;
		jf5Label.setToolTipText("고정 매입 자산 내역을 입력합니다. ") ;
		jf6Label.setToolTipText("그 외 신용카드/현금영수증 매입 내역을 입력합니다. (공제 대상만 입력) ") ;
		
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
    	
    	JButton realty = new JButton("입력") ;
		realty.setSize(70, 50);
		realty.setLocation(155, 420);
		realty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String year = JOptionPane.showInputDialog("보증금을 입력하세요.") ;
				if(year != null)
					jf3.setText(year);
			}
		}) ;
		c.add(realty) ;
		
		ToolTipManager m = ToolTipManager.sharedInstance() ;
		m.setInitialDelay(0) ;
		
		JButton fin = new JButton("확인") ;
		fin.setSize(200, 50);
		fin.setLocation(525, 580) ;
		fin.addActionListener(new finListener()) ;
		c.add(fin) ;
		

		setVisible(true) ;

	}
	
	class finListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JButton fin = (JButton)e.getSource();
			if(fin.getText().equals("확인")) {
				setVisible(false) ;
			new count2() ;
			}
		 }
	 }
	
	class count2 extends JFrame {
		private ImageIcon napbu = new ImageIcon("napbu.png");
		count2() { 
			
			setTitle("부가가치세 계산기") ;
	        setDefaultCloseOperation(EXIT_ON_CLOSE) ;
	        setSize(1500, 700) ;
	        Container c = getContentPane() ;
	        c.setLayout(null) ;
			c.setBackground(Color.PINK) ;
			
			JLabel c2Label = new JLabel("금액을 확인해주세요.") ;
			c2Label.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 30)) ;
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
			
			JLabel SLabel = new JLabel("과세표준명세 :  " + sum ) ;
			JLabel PLabel = new JLabel("총 매입분   :  " + mum  ) ;
			JLabel FLabel = new JLabel("최종 금액 :  " + fin  ) ;
			JLabel ALabel = new JLabel("환급 계좌 :  ") ;
			SLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20)) ;
			PLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20)) ;
			FLabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 27)) ;
			ALabel.setFont(new Font("한컴산뜻돋움", Font.BOLD, 20)) ;
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