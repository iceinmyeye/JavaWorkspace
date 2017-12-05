import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
class Practice18_2 extends JFrame {
	private Thread threadA;
	//private Thread threadB;
	
	// 定义要打印的那段话
	private String str = "天将降大任于斯人也，必先苦其心志，劳其筋骨，饿其体肤，空乏其身，"
			+ "行拂乱其所为，所以动心忍性，增益其所不能。" 
			+ "人恒过，然后能改。困于虑，衡于心，而后作。征于色，发于声，而后喻。";

	boolean b = true;
	int i = 0;

	public Practice18_2() {
		super();
		//JFrame jf = new JFrame();
		//Container ctn = jf.getContentPane();
		//setLayout(new BorderLayout());
		//ctn.setBounds(100,200,400,300);
		//setTitle("print");
		//?似乎不需要JFrame呀！！！
		JButton jbStart = new JButton("开始");
		JButton jbEnd = new JButton("停止");
		getContentPane().add(jbStart,BorderLayout.WEST);
		getContentPane().add(jbEnd,BorderLayout.EAST);

		jbStart.addActionListener(new jbsAction());
		jbEnd.addActionListener(new jbeAction());
	}

	class jbsAction implements ActionListener {
		public void actionPerformed(ActionEvent e0) {
			threadA = new Thread(new Runnable() {
				public void run() {
					while (true) {
						System.out.print(str.substring(i, i + 1));
						try {
							Thread.sleep(100);
							//threadB.join();
						} catch (Exception e) {
							e.printStackTrace();
						}
						if (++i > (str.length() - 1)){
							i = 0;
							return;
						}
						if (b == false) {
							b = !b;
							return;
						}
					}
				}
			});
			threadA.start();
		}
	}

//	class jbeAction implements ActionListener {
//		public void actionPerformed(ActionEvent e1) {
//			threadB = new Thread(new Runnable() {
//				public void run() {
//					b = false;
//				}
//			});
//			
//			threadB.start();
//		}
//	}
	
	class jbeAction implements ActionListener{
		public void actionPerformed(ActionEvent e1){
			b = false;
		}
	}

	// 开始并设置窗体属性的函数
	public static void init(JFrame jf, int width, int height) {
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
		jf.setBounds(400,200,width, height);
		jf.setVisible(true);
	}

	// public class Practice18_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printWindow pt = new printWindow();
		init(new Practice18_2(), 400, 150);
	}
}
