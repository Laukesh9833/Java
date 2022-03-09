import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Color;
class Buttonevent extends Frame implements ActionListener{
	Button b;
	Button b1;
	public Buttonevent(){
	    setSize(300,200);
	    setVisible(true);
	    setLocation(200,100);
	    setLayout(new FlowLayout());
	    setBackground(Color.GRAY);
	    
	    b=new Button("Click Here!");
	    b1=new Button("exit");
	    b.addActionListener(this); //Current Object 
	    b1.addActionListener(this);
	    add(b);
	    add(b1);
	    
	}
	public static void main(String[] args) {
		Buttonevent b=new Buttonevent();
	}
	public void actionPerformed(ActionEvent e){
	  Object source = e.getSource();
	  if(source==b){
	    System.out.println(e.getSource());
	     	}
	  if(source==b1){
	    System.exit(0);
	  }
}
}

