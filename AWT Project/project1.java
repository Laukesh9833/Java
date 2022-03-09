	import java.awt.Frame;
	import java.awt.TextField;
	import java.awt.FlowLayout;
	import java.awt.Button;
	import java.awt.event.*;
	import java.awt.TextComponent;
	import java.awt.*;
	
	class project1 extends Frame implements ActionListener{
		TextField t1;
		TextField t2;
		Button b1;
		Button b2;
		public project1(){
			setSize(300,400);
			setVisible(true);
			setLocation(300,200);
			setLayout(null);
			t1=new TextField("Loka",20);
			t2=new TextField("Rahula",20);
		
			b1=new Button("Swap");
			b2=new Button("Exit");
			b1.addActionListener(this);
			b2.addActionListener(this);
			
			t1.setBounds(50,100,100,20);
			t2.setBounds(50,140,100,20);
			
			b1.setBounds(50,250,50,20);
			b2.setBounds(110,250,50,20);
			add(t1);
			add(t2);
			add(b1);
			add(b2);		
		}
		public static void main(String[] args){
			project1 pr=new project1();
			
			}
		public void actionPerformed(ActionEvent e){
			Object source=e.getSource();
			if(source==b1){
			t1.setText("Rahula");
			t2.setText("Loka");
			b1.setLabel("Exit");
			b2.setLabel("Swap");
			}
			if(source==b2){
				System.exit(0);
			}
		}
		}
