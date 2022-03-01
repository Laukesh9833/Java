import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
class f1 {
	public static void main(String[] args) {
		fr frame=new fr();
		
	}
}
class fr extends Frame{
    private TextField tf1=new TextField("text 1");
    private TextField tf2=new TextField("text 2");
    private TextField tf3=new TextField("text 3");
    fr(){
        this.setSize(200,300);
        setVisible(true);
        setLocation(100,200);
  //      FlowLayout fl=new FlowLayout(FlowLayout.LEFT);
//		FlowLayout fl=new FlowLayout(FlowLayout.RIGHT);
//		FlowLayout fl=new FlowLayout(FlowLayout.CENTER);
		FlowLayout fl=new FlowLayout(FlowLayout.CENTER,100,50);
        setLayout(fl);
        add(tf1);
        add(tf2);
        add(tf3);
    }
    
}
