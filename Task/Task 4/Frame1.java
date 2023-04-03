package com.task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frame1 
{
	JFrame frame;
	JButton btn, btn1;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1;
	JTextField t2;
	JTextField t3;
	JTextField t4;
	JPasswordField p1, p2;
	public Frame1() {
		
		frame =new JFrame();
		
		l1 = new JLabel("Register a new Student");
		l1.setBounds(35, 11, 262, 36);
		
		l2 = new JLabel("Name");
		l2.setBounds(35, 100, 46, 14);
		
		l3 = new JLabel("Mail Id");
		l3.setBounds(35, 170, 46, 14);
		
		l4 = new JLabel("Password");
		l4.setBounds(35, 240, 100, 14);
		
		l5 = new JLabel("Re password");
		l5.setBounds(35, 310, 100, 14);
		
		t1=new JTextField();
		t1.setBounds(135, 100, 193, 20);
		
		t2=new JTextField();
		t2.setBounds(135, 170, 193, 20);
		
		p1=new JPasswordField();
		p1.setBounds(135, 240, 193, 20);
		
		p2=new JPasswordField();
		p2.setBounds(135, 310, 193, 20);
		
		btn1 =new JButton("Register");
		btn1.setBounds(35, 400, 200, 50);
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(t1);
		frame.add(t2);
		frame.add(p1);
		frame.add(p2);
		frame.add(btn1);
		frame.setSize(550,500);
		frame.setLayout(null);
		frame.setVisible(true);
		
		btn1.addActionListener(new ActionListener()
		{

			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				
				
				
				try 
				{
					String name=t1.getText().toString();
					String mail=t2.getText().toString();
					String pass=p1.getText().toString();
					String repass=p2.getText().toString();
				
					String name1="\n Your name is:";
					String mail1="\n Your mail is:";
					String pass1="\n Your Password is:";
					
					if(pass.equals(repass))
					{
						FileOutputStream fout=new FileOutputStream("F:// Student data.txt");
						fout.write(name1.getBytes());
						fout.write(name.getBytes());
						
						fout.write(mail1.getBytes());
						fout.write(mail.getBytes());
						
						fout.write(pass1.getBytes());
						fout.write(pass.getBytes());
						
					}
					else
					{
						System.out.println("Password and repassword not same.");
						
					}
					StringBuffer b=new StringBuffer();
					b.append("Registered");
					JOptionPane.showMessageDialog(frame, b);
					
				} 
				
				catch (Exception e1) 
				{
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					
				
				}
			
			
		});
	}

	public static void main(String[] args)
	{
		new Frame1();
		
	}
}
	
