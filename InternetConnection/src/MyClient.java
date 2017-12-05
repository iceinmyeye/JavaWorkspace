import java.awt.*;						//����java.awt��
import java.awt.event.*;					//����java.awt.event��
import java.io.*;							//����java.io��
import java.net.*;						//����java.net��
import javax.swing.*;						//����java.swing��
@SuppressWarnings("serial")
public class MyClient extends JFrame {			//������̳�JFrame��
	private PrintWriter writer;					//����PrintWriter�����
	Socket socket;							//����Socket����
	private JTextArea ta = new JTextArea();		//����JtextArea����
	private JTextField tf = new JTextField();		//����JtextField����
	Container cc;							//����Container����
	public MyClient(String title) {				//���췽��
		super(title);						//���ø���Ĺ��췽��
		cc = this.getContentPane();			//ʵ��������
		cc.add(ta, "North");					//���ı�����ڴ�����ϲ�
		cc.add(tf, "South");					//���ı�����ڴ�����²�
		tf.addActionListener(new ActionListener() {		//���¼�
			public void actionPerformed(ActionEvent e) {
				writer.println(tf.getText());				//���ı�������Ϣд����
				ta.append(tf.getText() + "\n");			//���ı�������Ϣ��ʾ���ı�����
				tf.setText(" ");						//���ı������
			}
		});
	}
	private void connect() {							//�����׽��ַ���
		ta.append("��������");						//�ı�������Ϣ��Ϣ
		try {										//��׽�쳣
			socket = new Socket("127.0.0.1", 8000);	//ʵ����Socket����
			writer = new PrintWriter(socket.getOutputStream(), true);
			ta.append("�������");					//�ı�������ʾ��Ϣ
		} catch (Exception e) {
			e.printStackTrace();						//����쳣��Ϣ
		}
	}
	public static void main(String[] args) {				//������
		MyClient clien = new MyClient("�������������");	//������������
		clien.setSize(200, 200);						//���ô����С
		clien.setVisible(true);							//��������ʾ
		clien.connect();								//�������ӷ���
	}
}
