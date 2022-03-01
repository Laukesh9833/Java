import java.awt.Frame;
import java.awt.TextField;
import java.awt.FlowLayout;
class I extends Frame{
	public static void main(String[] args) {
		I i=new I();
	}
	
	public I(){
	    setVisible(true);
	    setSize(300,200);
        FlowLayout l=new FlowLayout();
        setLayout(l);
        TextField tf=new TextField("Go ..");
        add(tf);
        System.out.println(tf.isEditable());
        //tf.setEditable(false);
        tf.setText("Example of TextFied");
        System.out.println(tf.getText());
}
}
