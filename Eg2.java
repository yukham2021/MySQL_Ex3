package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eg2 extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;
	private JPasswordField pwd;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eg2 frame = new Eg2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Eg2() {
		setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setBounds(183, 11, 82, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name");
		lblNewLabel_1.setBounds(22, 49, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Password");
		lblNewLabel_2.setBounds(22, 77, 90, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Email");
		lblNewLabel_3.setBounds(22, 109, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(22, 143, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Interest");
		lblNewLabel_5.setBounds(22, 179, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fruits");
		lblNewLabel_6.setBounds(22, 212, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txt1 = new JTextField();
		txt1.setBounds(122, 46, 176, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(122, 77, 176, 20);
		contentPane.add(pwd);
		
		txt2 = new JTextField();
		txt2.setBounds(122, 106, 176, 20);
		contentPane.add(txt2);
		txt2.setColumns(10);
		
		JRadioButton rd1 = new JRadioButton("Male");
		rd1.setBounds(108, 139, 109, 23);
		contentPane.add(rd1);
		
		JRadioButton rd2 = new JRadioButton("Female");
		rd2.setBounds(219, 139, 109, 23);
		contentPane.add(rd2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(rd1);
		bg.add(rd2);
		
		JCheckBox chk1 = new JCheckBox("Reading");
		chk1.setBounds(108, 175, 97, 23);
		contentPane.add(chk1);
		
		JCheckBox chk2 = new JCheckBox("Writing");
		chk2.setBounds(207, 175, 97, 23);
		contentPane.add(chk2);
		
		JCheckBox chk3 = new JCheckBox("Listening");
		chk3.setBounds(306, 175, 97, 23);
		contentPane.add(chk3);
		
	String fruits[]= {"Apple","Orange","Banana"};
		JComboBox cbo = new JComboBox(fruits);
		cbo.setBounds(122, 208, 176, 22);
		contentPane.add(cbo);
		
		JButton btn = new JButton("Register");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=txt1.getText();
				String password=String.valueOf(pwd.getPassword());
				String email=txt2.getText();
				String gender=null;
				String interest = null;
				if(rd1.isSelected()) {
					gender = rd1.getText();
				}else if(rd2.isSelected()) {
					gender = rd2.getText();
				}
				if(chk1.isSelected()) {
					interest = chk1.getText()+"";
			}
				if(chk2.isSelected()) {
				interest += chk2.getText()+"";
			}
				if (chk3.isSelected()) {
				interest += chk3.getText();
			}
			String fruit =(String)cbo.getSelectedItem();
			
			JOptionPane.showMessageDialog(null,"Name:"+name+"\nEmail:"+email+"\nGender:"+gender+"\nInterest:"+interest+"\nFavourite Fruit:"+fruit);
			}
		});
		btn.setBounds(160, 241, 89, 23);
		contentPane.add(btn);
	}
}
