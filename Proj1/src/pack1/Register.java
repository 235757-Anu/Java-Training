package pack1;
import java.awt.*;  
import java.awt.Container;
import java.awt.event.*;  
class Register extends Frame implements ActionListener{  
	TextField tf1; 
	TextField tf2;
	TextField tf3; 
	TextField tf4;

	Register(){  
  
        /*nameLabel=new JLabel("Name"); 
        nameField=new JTextField();
        nameLabel=new JLabel("UID"); 
        nameField=new JTextField();
        nameLabel=new JLabel("Mail ID"); 
        nameField=new JTextField();
        nameLabel=new JLabel("Password"); 
        nameField=new JTextField();*/
		tf1=new TextField();  
		tf1.setBounds(60,50,170,20);  
		tf2=new TextField();  
		tf2.setBounds(60,100,170,20);
		tf3=new TextField();  
		tf3.setBounds(60,150,170,20);
		tf4=new TextField();  
		tf4.setBounds(60,200,170,20);
		Button b=new Button("Submit");  
		b.setBounds(100,250,80,30);  
 
		b.addActionListener(this); 

 
		add(b);add(tf1);  
		setSize(300,300);  
		add(b);add(tf2);  
		setSize(300,300);
		add(b);add(tf3);  
		setSize(300,300);
		add(b);add(tf4);  
		setSize(300,300);
		setLayout(null);  
		setVisible(true);  
	}  
	public void actionPerformed(ActionEvent e){  
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
	}  
	public static void main(String args[]){  
		new Register();  
	}  
}
