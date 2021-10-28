package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EgFrame extends JFrame {
EgFrame(){
	setTitle("Example1");
    setSize(400,400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel lbl1=new JLabel("Label1");
    JLabel lbl2=new JLabel("Label2");
    JLabel lbl3=new JLabel("Label3");
    JLabel lbl4=new JLabel("Label4");
    
    JPanel panel=new JPanel();
    panel.setLayout(new GridLayout(2,2));
    panel.add(lbl1);
    panel.add(lbl2);
    panel.add(lbl3);
    panel.add(lbl4);
    
    this.getContentPane().add(panel);
    setVisible(true);
}

public static void main(String[] args) {
	EgFrame f=new EgFrame();
}

}
