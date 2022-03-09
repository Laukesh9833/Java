import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.event.*;
class button extends Frame{
    Button b1;
    Button b2;
    button(){
        setSize(300,400);
        setVisible(true);
        setLayout(new FlowLayout());
        b1=new Button();
        b2=new Button("Clear");
        
        //set label by method
        b1.setLabel("Label setted");
		b2.setLabel("Updated Clear");
		
		//get Label name by method
		String l=b1.getLabel();
		System.out.println(l);
		
		//set button's height and weight
		b1.setPreferredSize(new Dimension(200,300));
		
		b1.setBackground(Color.BLUE);
		b1.setForeground(Color.WHITE);
		
		b1.setEnabled(true);
		
		//hiding button 
		//b1.setVisible(false);
		//b1.show(false);
		b1.addActionListener(new myEvent());
        add(b1);
        add(b2);
    }
public static void main(String [] args){
    button b=new button();
    }        
    }
class myEvent implements ActionListener{
	public void actionPerformed(ActionEvent e){
	System.out.println("button is clicked");
}
}
