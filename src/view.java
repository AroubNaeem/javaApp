import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class view extends JFrame {
	private JTextField firstnum= new JTextField(10);
	private JTextField secnum= new JTextField(10);
	private JTextField result= new JTextField(10);
	private JLabel l1= new JLabel("first number");
	private JLabel l2= new JLabel("second number");
	private JLabel l3= new JLabel("result");
	private JButton addition = new JButton ("+");


	view(){
		  JPanel panel = new JPanel();
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setSize(700,300);
		  panel.add(l1);
		  panel.add(firstnum);
		  panel.add(l2);
		  panel.add(secnum);
		  panel.add(l3);
		  
		  
		  panel.add(result);
		  panel.add(addition);
		  this.add(panel);
		  
		  
		
		
		
	}

	 public int getf(){
		return Integer.parseInt(firstnum.getText());
		
		
	}
	 
	 public int gets(){
		return Integer.parseInt(secnum.getText());
		
		
	}
	 public int getr(){
		return Integer.parseInt(result.getText());
		
		
	}
	 
	 public void setr(int res){
		 result.setText(Integer.toString(res));
		
		
	}
	   public void addAdditionListener(ActionListener add){
		   addition.addActionListener(add);
		   
	   }
	 
	 void errorm(String err){
		 JOptionPane.showMessageDialog(this, err);
		 
		 
		 
	 }
}
