import java.awt.*;
import javax.swing.*;
public class JoinTest extends JFrame {

	/**
	 * @param args
	 */
	private Thread threadA;
	private Thread threadB;
	final JProgressBar progressA = new JProgressBar();
	final JProgressBar progressB = new JProgressBar();
	int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		init(new JoinTest(),100,100);

	}
	public JoinTest(){
		super();
		getContentPane().add(progressA,BorderLayout.NORTH);
		getContentPane().add(progressB,BorderLayout.SOUTH);
		progressA.setStringPainted(true);
		progressB.setStringPainted(true);
		
		threadA= new Thread(new Runnable(){
			int count = 0;
			public void run(){
				while(true){
					progressA.setValue(++count);
					try{
						threadA.sleep(100);
						threadB.join();
					}catch(Exception e){
						e.printStackTrace();
					}
				}
			}
		});
		threadA.start();
		threadB = new Thread(new Runnable(){
			int count = 0;
			public void run(){
				while(true){
					progressB.setValue(++count);
					try{
						threadB.sleep(100);
					}catch(Exception e){
						e.printStackTrace();
					}
					if(count==100){
						break;
					}
				}
			}
		});
		threadB.start();
	}
	
	public static void init(JFrame frame,int width,int height){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}

}
