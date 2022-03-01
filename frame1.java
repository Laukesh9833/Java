import java.awt.Frame;

/*                    //First way 
public class frame1{
	public static void main(String[] args) {
	System.out.println(1);
	Frame f=new Frame();
	f.setVisible(true);
	f.setSize(200,300);
	System.out.println(f);
	System.out.println(2);
	}
}

*/

                        //second way
class f extends Frame{
    public static void main(String[] args){
        System.out.println("start");
        f obj=new f();
        System.out.println(obj);
        
        obj.setTitle("new Frame");
        obj.setSize(100,100);
        obj.setVisible(true);
        System.out.println("end");
        }
    }
