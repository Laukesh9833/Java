import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Color;
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
		
		b1.setEnabled(false);
		
		//hiding button 
		//b1.setVisible(false);
		//b1.show(false);
		
        add(b1);
        add(b2);
    }
public static void main(String [] args){
    button b=new button();
    }        
    }
