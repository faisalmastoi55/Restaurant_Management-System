import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Restaurant implements ActionListener
{
	JFrame f;
	JTextArea ta;
	JPanel p1,p2,p3,p4,p5,p6,p7;
	JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9,lbl10,lbl11,lbl12,lbl13,lbl14,lbl15,lbl16,lbl17,lbl18,lbl19,lbl20;
	JTextField txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9,txt10,txt11,txt12,txt13,txt14,txt15,txt16;
	JButton btn1,btn2,btn3,btn4;

	Restaurant()
	{
		f = new JFrame("Restaurant Management System");
		f.getContentPane().setBackground(Color.BLUE);

		p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(10,10,1345,80);
		p1.setBackground(Color.BLACK);

		lbl1 = new JLabel("Restaurant Management System");
		lbl1.setBounds(240,-5,1000,80);
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(new Font("Serif",Font.BOLD,60));
		p1.add(lbl1);
		f.add(p1);

		p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(10,100,450,300);
		p2.setBackground(Color.GRAY);

		lbl2 = new JLabel("Meals");
		lbl2.setBounds(180,10,200,30);
		lbl2.setForeground(Color.BLACK);
		lbl2.setFont(new Font("Serif",Font.BOLD,30));
		p2.add(lbl2);
		f.add(p2);

		lbl3 = new JLabel("Filet-O-Fish");
		lbl3.setBounds(40,60,200,30);
		lbl3.setForeground(Color.BLACK);
		lbl3.setFont(new Font("Serif",Font.BOLD,20));
		p2.add(lbl3);
		f.add(p2);

		txt1 = new JTextField();
		txt1.setBounds(280,60,130,30);
		txt1.setBackground(Color.WHITE);
		txt1.setFont(new Font("Serif",Font.BOLD,20));
		txt1.setHorizontalAlignment(JTextField.CENTER);
		p2.add(txt1);
		f.add(p2);

		lbl4 = new JLabel("Chicken Burger");
		lbl4.setBounds(40,100,200,30);
		lbl4.setForeground(Color.BLACK);
		lbl4.setFont(new Font("Serif",Font.BOLD,20));
		p2.add(lbl4);
		f.add(p2);

		txt2 = new JTextField();
		txt2.setBounds(280,100,130,30);
		txt2.setBackground(Color.WHITE);
		txt2.setFont(new Font("Serif",Font.BOLD,20));
		txt2.setHorizontalAlignment(JTextField.CENTER);
		p2.add(txt2);
		f.add(p2);

		lbl5 = new JLabel("Chicken Legend");
		lbl5.setBounds(40,140,200,30);
		lbl5.setForeground(Color.BLACK);
		lbl5.setFont(new Font("Serif",Font.BOLD,20));
		p2.add(lbl5);
		f.add(p2);

		txt3 = new JTextField();
		txt3.setBounds(280,140,130,30);
		txt3.setBackground(Color.WHITE);
		txt3.setFont(new Font("Serif",Font.BOLD,20));
		txt3.setHorizontalAlignment(JTextField.CENTER);
		p2.add(txt3);
		f.add(p2);

		lbl6 = new JLabel("Chicken Burger Meal");
		lbl6.setBounds(40,180,250,30);
		lbl6.setForeground(Color.BLACK);
		lbl6.setFont(new Font("Serif",Font.BOLD,20));
		p2.add(lbl6);
		f.add(p2);

		txt4 = new JTextField();
		txt4.setBounds(280,180,130,30);
		txt4.setBackground(Color.WHITE);
		txt4.setFont(new Font("Serif",Font.BOLD,20));
		txt4.setHorizontalAlignment(JTextField.CENTER);
		p2.add(txt4);
		f.add(p2);

		lbl7 = new JLabel("Bacon and Cheese Burger");
		lbl7.setBounds(40,220,250,30);
		lbl7.setForeground(Color.BLACK);
		lbl7.setFont(new Font("Serif",Font.BOLD,20));
		p2.add(lbl7);
		f.add(p2);

		txt5 = new JTextField();
		txt5.setBounds(280,220,130,30);
		txt5.setBackground(Color.WHITE);
		txt5.setFont(new Font("Serif",Font.BOLD,20));
		txt5.setHorizontalAlignment(JTextField.CENTER);
		p2.add(txt5);
		f.add(p2);

		p3 = new JPanel();
		p3.setLayout(null);
		p3.setBounds(500,100,450,300);
		p3.setBackground(Color.GRAY);

		lbl8 = new JLabel("Drinks");
		lbl8.setBounds(180,10,200,30);
		lbl8.setForeground(Color.BLACK);
		lbl8.setFont(new Font("Serif",Font.BOLD,30));
		p3.add(lbl8);
		f.add(p3);

		lbl9 = new JLabel("Milk Shake");
		lbl9.setBounds(40,60,200,30);
		lbl9.setForeground(Color.BLACK);
		lbl9.setFont(new Font("Serif",Font.BOLD,20));
		p3.add(lbl9);
		f.add(p3);

		txt6 = new JTextField();
		txt6.setBounds(280,60,130,30);
		txt6.setBackground(Color.WHITE);
		txt6.setFont(new Font("Serif",Font.BOLD,20));
		txt6.setHorizontalAlignment(JTextField.CENTER);
		p3.add(txt6);
		f.add(p3);

		lbl10 = new JLabel("Vanilla Cone");
		lbl10.setBounds(40,100,200,30);
		lbl10.setForeground(Color.BLACK);
		lbl10.setFont(new Font("Serif",Font.BOLD,20));
		p3.add(lbl10);
		f.add(p3);

		txt7 = new JTextField();
		txt7.setBounds(280,100,130,30);
		txt7.setBackground(Color.WHITE);
		txt7.setFont(new Font("Serif",Font.BOLD,20));
		txt7.setHorizontalAlignment(JTextField.CENTER);
		p3.add(txt7);
		f.add(p3);

		lbl11 = new JLabel("Classic Vanilla");
		lbl11.setBounds(40,140,200,30);
		lbl11.setForeground(Color.BLACK);
		lbl11.setFont(new Font("Serif",Font.BOLD,20));
		p3.add(lbl11);
		f.add(p3);

		txt8 = new JTextField();
		txt8.setBounds(280,140,130,30);
		txt8.setBackground(Color.WHITE);
		txt8.setFont(new Font("Serif",Font.BOLD,20));
		txt8.setHorizontalAlignment(JTextField.CENTER);
		p3.add(txt8);
		f.add(p3);

		lbl12 = new JLabel("Vanilla Milk Shake");
		lbl12.setBounds(40,180,250,30);
		lbl12.setForeground(Color.BLACK);
		lbl12.setFont(new Font("Serif",Font.BOLD,20));
		p3.add(lbl12);
		f.add(p3);

		txt9 = new JTextField();
		txt9.setBounds(280,180,130,30);
		txt9.setBackground(Color.WHITE);
		txt9.setFont(new Font("Serif",Font.BOLD,20));
		txt9.setHorizontalAlignment(JTextField.CENTER);
		p3.add(txt9);
		f.add(p3);

		lbl13 = new JLabel("Chocolate Milk Shake");
		lbl13.setBounds(40,220,250,30);
		lbl13.setForeground(Color.BLACK);
		lbl13.setFont(new Font("Serif",Font.BOLD,20));
		p3.add(lbl13);
		f.add(p3);

		txt10 = new JTextField();
		txt10.setBounds(280,220,130,30);
		txt10.setBackground(Color.WHITE);
		txt10.setFont(new Font("Serif",Font.BOLD,20));
		txt10.setHorizontalAlignment(JTextField.CENTER);
		p3.add(txt10);
		f.add(p3);

		p4 = new JPanel();
		p4.setLayout(null);
		p4.setBounds(10,420,450,170);
		p4.setBackground(Color.GRAY);

		lbl14 = new JLabel("Cost Of Meal");
		lbl14.setBounds(40,20,250,30);
		lbl14.setForeground(Color.BLACK);
		lbl14.setFont(new Font("Serif",Font.BOLD,25));
		p4.add(lbl14);
		f.add(p4);

		txt11 = new JTextField();
		txt11.setBounds(280,20,130,30);
		txt11.setBackground(Color.BLUE);
		txt11.setForeground(Color.WHITE);
		txt11.setFont(new Font("Serif",Font.BOLD,20));
		txt11.setHorizontalAlignment(JTextField.CENTER);
		txt11.setEditable(false);
		p4.add(txt11);
		f.add(p4);

		lbl15 = new JLabel("Cost Of Drinks");
		lbl15.setBounds(40,60,250,30);
		lbl15.setForeground(Color.BLACK);
		lbl15.setFont(new Font("Serif",Font.BOLD,25));
		p4.add(lbl15);
		f.add(p4);

		txt12 = new JTextField();
		txt12.setBounds(280,60,130,30);
		txt12.setBackground(Color.BLUE);
		txt12.setForeground(Color.WHITE);
		txt12.setFont(new Font("Serif",Font.BOLD,20));
		txt12.setHorizontalAlignment(JTextField.CENTER);
		txt12.setEditable(false);
		p4.add(txt12);
		f.add(p4);

		lbl16 = new JLabel("Total Cost of Items");
		lbl16.setBounds(40,100,250,30);
		lbl16.setForeground(Color.BLACK);
		lbl16.setFont(new Font("Serif",Font.BOLD,25));
		p4.add(lbl16);
		f.add(p4);

		txt13 = new JTextField();
		txt13.setBounds(280,100,130,30);
		txt13.setBackground(Color.BLUE);
		txt13.setForeground(Color.WHITE);
		txt13.setFont(new Font("Serif",Font.BOLD,20));
		txt13.setHorizontalAlignment(JTextField.CENTER);
		txt13.setEditable(false);
		p4.add(txt13);
		f.add(p4);


		p5 = new JPanel();
		p5.setLayout(null);
		p5.setBounds(500,420,450,170);
		p5.setBackground(Color.GRAY);
		
		lbl17 = new JLabel("Tax");
		lbl17.setBounds(40,20,250,30);
		lbl17.setForeground(Color.BLACK);
		lbl17.setFont(new Font("Serif",Font.BOLD,25));
		p5.add(lbl17);
		f.add(p5);

		txt14 = new JTextField();
		txt14.setBounds(280,20,130,30);
		txt14.setBackground(Color.BLUE);
		txt14.setForeground(Color.WHITE);
		txt14.setFont(new Font("Serif",Font.BOLD,20));
		txt14.setHorizontalAlignment(JTextField.CENTER);
		txt14.setEditable(false);
		p5.add(txt14);
		f.add(p5);

		lbl18 = new JLabel("SubTotal");
		lbl18.setBounds(40,60,250,30);
		lbl18.setForeground(Color.BLACK);
		lbl18.setFont(new Font("Serif",Font.BOLD,25));
		p5.add(lbl18);
		f.add(p5);

		txt15 = new JTextField();
		txt15.setBounds(280,60,130,30);
		txt15.setBackground(Color.BLUE);
		txt15.setForeground(Color.WHITE);
		txt15.setFont(new Font("Serif",Font.BOLD,20));
		txt15.setHorizontalAlignment(JTextField.CENTER);
		txt15.setEditable(false);
		p5.add(txt15);
		f.add(p5);

		lbl19 = new JLabel("Total");
		lbl19.setBounds(40,100,250,30);
		lbl19.setForeground(Color.BLACK);
		lbl19.setFont(new Font("Serif",Font.BOLD,25));
		p5.add(lbl19);
		f.add(p5);

		txt16 = new JTextField();
		txt16.setBounds(280,100,130,30);
		txt16.setBackground(Color.BLUE);
		txt16.setForeground(Color.WHITE);
		txt16.setFont(new Font("Serif",Font.BOLD,20));
		txt16.setHorizontalAlignment(JTextField.CENTER);
		txt16.setEditable(false);
		p5.add(txt16);
		f.add(p5);

		p6 = new JPanel();
		p6.setLayout(null);
		p6.setBounds(10,610,940,80);
		p6.setBackground(Color.GRAY);
		
		btn1 = new JButton("Total");
		btn1.setBounds(110,20,150,40);
		btn1.setBackground(Color.BLACK);
		btn1.setForeground(Color.WHITE);
		btn1.setFont(new Font("Serif",Font.BOLD,20));
		btn1.setFocusable(false);
		btn1.addActionListener(this);
		p6.add(btn1);
		f.add(p6);

		btn2 = new JButton("Receipt");
		btn2.setBounds(300,20,150,40);
		btn2.setBackground(Color.BLACK);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Serif",Font.BOLD,20));
		btn2.setFocusable(false);
		btn2.addActionListener(this);
		p6.add(btn2);
		f.add(p6);

		btn3 = new JButton("Reset");
		btn3.setBounds(490,20,150,40);
		btn3.setBackground(Color.BLACK);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Serif",Font.BOLD,20));
		btn3.setFocusable(false);
		btn3.addActionListener(this);
		p6.add(btn3);
		f.add(p6);

		btn4 = new JButton("Exit");
		btn4.setBounds(680,20,150,40);
		btn4.setBackground(Color.BLACK);
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Serif",Font.BOLD,20));
		btn4.setFocusable(false);
		btn4.addActionListener(this);
		p6.add(btn4);
		f.add(p6);

		p7 = new JPanel();
		p7.setLayout(null);
		p7.setBounds(980,100,375,585);
		p7.setBackground(Color.GRAY);

		ta = new JTextArea();
		ta.setBounds(15,15,345,550);
		p7.add(ta);
		f.add(p7);

		lbl20 = new JLabel("Restaurant Management System");
		lbl20.setBounds(60,10,250,30);
		lbl20.setFont(new Font("Serif",Font.BOLD,15));
		ta.add(lbl20);


		f.setLayout(null);
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		//f.setUndecorated(true);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == btn1)
		{
			String m1 = txt1.getText();
			String m2 = txt2.getText();
			String m3 = txt3.getText();
			String m4 = txt4.getText();
			String m5 = txt5.getText();

			int fish = Integer.parseInt(m1);
			int burger = Integer.parseInt(m2);
			int legend = Integer.parseInt(m3);
			int bMeal = Integer.parseInt(m4);
			int cheese = Integer.parseInt(m5);

			int totalMeal = fish*500 + burger*200 + legend*600 + bMeal*400 + cheese*200;
			txt11.setText(""+totalMeal);
			
			String d1 = txt6.getText();
			String d2 = txt7.getText();
			String d3 = txt8.getText();
			String d4 = txt9.getText();
			String d5 = txt10.getText();

			int mShake = Integer.parseInt(d1);
			int vCone = Integer.parseInt(d2);
			int cVanilla = Integer.parseInt(d3);
			int vMShake = Integer.parseInt(d4);
			int cMShake = Integer.parseInt(d5);

			int totalDrinks = mShake*150 + vCone*200 + cVanilla*220 + vMShake*170 + cMShake*250;

			txt12.setText(""+totalDrinks);

			String ti = txt11.getText();
			String ti2 = txt12.getText();

			int totalMeal1 = Integer.parseInt(ti);
			int totalDrinks1 = Integer.parseInt(ti2);

			txt13.setText(""+(totalMeal1+totalDrinks1));

			txt14.setText("50");

			txt15.setText(""+(totalMeal+totalDrinks1));


			String total1 = txt13.getText();
			String tax = txt14.getText();

			int total11 = Integer.parseInt(total1);
			int tax1 = Integer.parseInt(tax);

			txt16.setText(""+(total11+tax1));

		}

		if(ae.getSource() == btn2)
		{
			String r1 = txt11.getText();
			String r2 = txt12.getText();
			String r3 = txt13.getText();
			String r4 = txt14.getText();
			String r5 = txt15.getText();
			String r6 = txt16.getText();

			int a1 = Integer.parseInt(r1);
			int a2 = Integer.parseInt(r2);
			int a3 = Integer.parseInt(r3);
			int a4 = Integer.parseInt(r4);
			int a5 = Integer.parseInt(r5);
			int a6 = Integer.parseInt(r6);

			ta.setText("\n\n\n\n\n\n\t Cost of Meal : \t\t "+a1+"\n\n\n\t Cost of Drinks : \t "+a2+"\n\n\n\t Total Cost of Items :\t "+a3+"\n\n---------------------------------------------------------------------------------\n\n\t Tax : \t  "+a4+"\n\n\n\t SubTotal : \t "+a5+"\n\n\n\t Total : \t  "+a6+"\n\n\n---------------------------------------------------------------------------------\n\n\n\t            Thank You ");			


		}

		if(ae.getSource() == btn3)
		{
			
			/*txt1.setText(" ");
			txt2.setText(" ");
			txt3.setText(" ");
			txt4.setText(" ");
			txt5.setText(" ");
			txt6.setText(" ");
			txt7.setText(" ");
			txt8.setText(" ");
			txt9.setText(" ");
			txt10.setText(" ");
			*/txt11.setText(" ");
			txt12.setText(" ");
			txt13.setText(" ");
			txt14.setText(" ");
			txt15.setText(" ");
			txt16.setText(" ");
			ta.setText(" ");
			
		}

		if(ae.getSource() == btn4)
		{
			System.exit(0);
		}


	}

	public static void main(String arg[])
	{
		new Restaurant();
	}
	
}