package com.assignmentmodule3;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Swing implements ActionListener 
{
	JFrame frame;
	JLabel l1,l2,l3,l4,l5,l6;
	JTextField t1,t2,t3,t4;
	JRadioButton rb1,rb2;
	JButton btnexit,btnregister,btndel,btnupdate,btnreset,btnrefresh;
	JTable jtable;
    JScrollPane jscroll;
	DefaultTableModel model;
	
    public Swing()
	{
		frame= new JFrame("Registeration Form");
		
		l1=new JLabel("Registration form");
		l1.setFont(new Font("Tahoma", Font.BOLD, 16));
		l1.setBounds(40, 30, 170, 50);
		
		l2=new JLabel("ID");
		l2.setBounds(10, 100, 46, 14);
		
		l3=new JLabel("Name");
		l3.setBounds(10, 160, 46, 14);
		
		l4=new JLabel("Gender");
		l4.setBounds(10, 220, 46, 14);
		
		l5=new JLabel("Adress");
		l5.setBounds(10, 280, 46, 14);
		
		l6=new JLabel("Contact");
		l6.setBounds(10, 340, 46, 14);
		
		
		t1= new JTextField();
		t1.setBounds(75, 100, 150, 20);
		
		t2= new JTextField();
		t2.setBounds(75, 160, 150, 20);
		
		t3= new JTextField();
		t3.setBounds(75, 280, 150, 20);
		
		t4= new JTextField();
		t4.setBounds(75, 340, 150, 20);
		
		rb1=new JRadioButton("Male");
		rb1.setBounds(75, 220, 70, 20);
		
		rb2=new JRadioButton("Female");
		rb2.setBounds(150, 220, 80, 20);
		
		ButtonGroup bg= new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		
		btnexit=new JButton("Exit");
		btnexit.setBounds(10,400, 89, 23);
		
		btnregister=new JButton("Register");
		btnregister.setBounds(100, 400, 89, 23);
		
		btndel=new JButton("Delete");
		btndel.setBounds(10,425, 89, 23);
		
		btnupdate=new JButton("Update");
		btnupdate.setBounds(100,425, 89, 23);
		
		btnreset=new JButton("Reset");
		btnreset.setBounds(10, 450, 180, 23);
		
		btnrefresh=new JButton("Refresh table");
		btnrefresh.setBounds(500, 500, 150, 23);
		
		btnexit.addActionListener(this);
		btnregister.addActionListener(this);
		btndel.addActionListener(this);
		btnrefresh.addActionListener(this);
		btnreset.addActionListener(this);
		btnupdate.addActionListener(this);
        
		String column[] = {"S.No","ID","Name","Gender","Address","Contact"};
		
		model = new DefaultTableModel(column,0);
		jtable = new JTable(model);
		
		jtable.setBounds(300, 13, 550, 470);
		jtable.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));
		
		jtable.repaint();
		jscroll = new JScrollPane(jtable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jscroll.setBounds(300, 13, 550, 470);
		
		
		frame.add(l1);
		frame.add(l2);
		frame.add(l3);
		frame.add(l4);
		frame.add(l5);
		frame.add(l6);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);
		frame.add(t4);
		frame.add(rb1);
		frame.add(rb2);
		frame.add(btnexit);
		frame.add(btnregister);
		frame.add(btndel);
		frame.add(btnupdate);
		frame.add(btnreset);
		frame.add(btnrefresh);
		//frame.add(jtable);
		frame.add(jscroll);
		frame.setSize(900,600);;
		frame.setLayout(null);
		frame.setVisible(true);
		
		
}
	

	// sql dabase declaration
			String host = "jdbc:mysql://localhost:3306/";
			String dbname = "registrationform";
			String url = host+dbname;
	public void inserData()
	{
		
		try 
		{
			int noofinsert;
			int id = Integer.parseInt(t1.getText());
			String nam = t2.getText();
						
			String gend;
			if(rb1.isSelected())
			{
				gend = rb1.getText();
			}
			else
				gend = rb2.getText();
			
			String add = t3.getText();
			long cont = Long.parseLong(t4.getText());
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			Statement stmt = con.createStatement();
			String sqlinsert = "insert into registration value(null, '" + id + "','" + nam + "', '" + gend + "','" + add + "','" + cont +"')";
			noofinsert = stmt.executeUpdate(sqlinsert);
			
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		finally
		{
			JOptionPane.showMessageDialog(btnregister, "Registered Successfully");
		}
	}
	public void deleteData()
	{
		int noofdelete;
		int id = Integer.parseInt(t1.getText());
		String sqldelete = "delete from registration where Id='"+id+"'";
				
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			noofdelete = stmt.executeUpdate(sqldelete);
					
		}
		catch (Exception e) 
		{
			System.out.println();
		}
		finally
		{
			JOptionPane.showMessageDialog(btndel, "Deleted Successfully");
		}
		
	}
	public void updateData()
	{
		int noofupdate;
		int id = Integer.parseInt(t1.getText());
		String nam = t2.getText();
					
		String gend;
		if(rb1.isSelected())
		{
			gend = rb1.getText();
		}
		else
			gend = rb2.getText();
		
		String add = t1.getText();
		long cont = Long.parseLong(t4.getText());
		String sqlupdate = "update registration set Id= "+id+",Name= '"+nam+"',Gender= '"+gend+"',Address='"+add+"',Contact= "+cont+"";
								
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			noofupdate = stmt.executeUpdate(sqlupdate);
			JOptionPane.showMessageDialog(btnupdate, "Updated Successfully");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
			
	}
	public void viewDataInTable()
	{
			
		String sqlviewdata = "select * from registration";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,"root","");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlviewdata);
			model.setRowCount(0);
						
			while(rs.next())
			{
				model.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6)});
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		new Swing();
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == btnregister)
		{
			inserData();
		}
		if(e.getSource() == btnexit)
		{
			 frame.dispose();
		}
		if(e.getSource() == btndel)
		{
			 deleteData();
		}
		if(e.getSource() == btnreset)
		{
			 t1.setText(null);
			 t2.setText(null);
			 rb1.setSelected(false);
			 rb2.setSelected(false);
			 t3.setText(null);
			 t4.setText(null);
		}
		if(e.getSource() == btnupdate)
		{
			 updateData();
		}
		if(e.getSource() == btnrefresh)
		{
			viewDataInTable();
		}

		
		
	}
	
}
