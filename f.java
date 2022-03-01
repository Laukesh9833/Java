import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
class f{
	public static void main(String[] args) {
		Frame fr=new Frame();
		fr.setVisible(true);
		fr.setSize(100,200);
		fr.setLayout(new FlowLayout());;
		
		TextField tf0=new TextField("Text Field 1");
		TextField tf1=new TextField("Text Field 2");
		TextField tf2=new TextField("Text Field 3");
		TextField tf3=new TextField("Text Field 4");
		//jab hum window ki size badhayenge to saare layout ek saath aa jaynge 
		//jab hum wondow ki size kam karenge to sare layput upar niche aa jayenge 
		fr.add(tf0);
		fr.add(tf1);
		fr.add(tf2);
		fr.add(tf3);
		
	}
}
