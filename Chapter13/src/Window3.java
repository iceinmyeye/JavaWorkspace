import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //�漰ActionEvent���¼�

@SuppressWarnings("serial")
class LoginWindow extends JFrame{
	JTextField jtext = new JTextField();
	JPasswordField jpassword = new JPasswordField();
	JButton jbSubmit = new JButton("�ύ");
	JButton jbReset = new JButton("����");
	
	public void CreatLoginWindow(){
		//����JFrame����
		JFrame jf = new JFrame("��½����");
		Container ctn = jf.getContentPane(); //��������
		//����JFrame����Ĵ�С
		jf.setBounds(400, 200, 400, 350);
		jf.setResizable(false);
		
		//ֱ����Container����ctn�������������ߴ���JPanel����
		//��JPanel��������Ӷ���Ȼ��JPanel�����Container�о��ɣ�Ч����ͬ
		//JPanel jpanel1 = new JPanel();
		ctn.setLayout(null);
		ctn.setBounds(483,534,400,300);
		
		
		//���ñ�ǩ����ʾ������Ϣ
		JLabel jlUser = new JLabel("�û���");
		ctn.add(jlUser);
		jlUser.setBounds(50, 30, 60, 40);
		JLabel jlPassword = new JLabel("����");
		ctn.add(jlPassword);
		jlPassword.setBounds(50,110,60,40);
		
		//�����ı���������
//		JTextField jtext = new JTextField();
		ctn.add(jtext);
		jtext.setBounds(110, 30, 220, 40);
//		JPasswordField jpassword = new JPasswordField();
		ctn.add(jpassword);
		jpassword.setBounds(110, 110, 220, 40);
		jpassword.setEchoChar('*');
		
		//�����ύ��ť�����ð�ť
//		JButton jbSubmit = new JButton("�ύ");
		ctn.add(jbSubmit);
		jbSubmit.setBounds(80, 230, 70, 40);
//		JButton jbReset = new JButton("����");
		ctn.add(jbReset);
		jbReset.setBounds(250, 230, 70, 40);
		
		//Ϊ�ύ��ť�����ð�ť�ֱ����ʵ��ActionListener�ӿڵĶ���
		jbSubmit.addActionListener(new jbSubmitAction());
		jbReset.addActionListener(new jbResetAction());
		
		//����Щ�������������ڲ�������ɼ�
		//�����������������С֮ǰ��֮�󶼿���
//		jpanel1.add(jlUser);
//		jpanel1.add(jlPassword);
//		jpanel1.add(jtext);
//		jpanel1.add(jpassword);
//		jpanel1.add(jbSubmit);
//		jpanel1.add(jbReset);
		//ctn.add(ctn);
		jf.setVisible(true);
	}
	
	//���������ڲ�����ʵ���ύ��ť�����ð�ť��ActionListener�ӿ�
	class jbSubmitAction extends JDialog implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JDialog jd = new JDialog(new LoginWindow(), "��ʾ", true); //true����Ϊģʽ�Ի��򣬼�ʼ����ǰ����������߳�ֱ���Ի����߳̽���
			Container ctnjd = jd.getContentPane();
			jd.setBounds(450,250,150,120);
			//ctnjd.setBounds(600, 420, 150, 120);
			if (jtext.getText().length()==0 || jpassword.getPassword().length==0){
				ctnjd.add(new JLabel("�û��������벻��Ϊ��"));
				jd.setVisible(true);
			}
			else if ((jtext.getText().equals("mr")) && String.valueOf(jpassword.getPassword()).equals("mrsoft")){
				ctnjd.add(new JLabel("��½�ɹ�"));
				jd.setVisible(true);
			}
			else{
				ctnjd.add(new JLabel("�û������������"));
				jd.setVisible(true);
			}
		}
	}
	
	class jbResetAction implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			jtext.setText(null);
			jpassword.setText(null);
		}
	}
}

public class Window3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LoginWindow().CreatLoginWindow();

	}

}
