import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
class Practice18_2 extends JFrame {
	private Thread threadA;
	//private Thread threadB;
	
	// ����Ҫ��ӡ���Ƕλ�
	private String str = "�콫��������˹��Ҳ�����ȿ�����־�������ǣ�����������շ�����"
			+ "�з�������Ϊ�����Զ������ԣ������������ܡ�" 
			+ "�˺����Ȼ���ܸġ������ǣ������ģ�������������ɫ������������������";

	boolean b = true;
	int i = 0;

	public Practice18_2() {
		super();
		//JFrame jf = new JFrame();
		//Container ctn = jf.getContentPane();
		//setLayout(new BorderLayout());
		//ctn.setBounds(100,200,400,300);
		//setTitle("print");
		//?�ƺ�����ҪJFrameѽ������
		JButton jbStart = new JButton("��ʼ");
		JButton jbEnd = new JButton("ֹͣ");
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

	// ��ʼ�����ô������Եĺ���
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
