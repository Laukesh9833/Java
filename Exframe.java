import java.awt.Frame;
import java.awt.Color;
public class Exframe{
	public static void main(String[] args) {
		Frame obj=new Frame();
		
//size
//                        width,Hight		
//		obj.setSize(100,100);
// margin        horizontal,vertical		
//		obj.setLocation(50,70);
		
//combonation of size and location
//	                              x.  y.     h.   v	
		obj.setBounds(50,70,300,300);
		
		obj.setBackground(Color.RED);
		
		boolean n=obj.isVisible();
		System.out.println(n);
		obj.setVisible(true);
		
	}
}
