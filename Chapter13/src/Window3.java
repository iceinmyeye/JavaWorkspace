import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //涉及ActionEvent的事件

@SuppressWarnings("serial")
class LoginWindow extends JFrame{
	JTextField jtext = new JTextField();
	JPasswordField jpassword = new JPasswordField();
	JButton jbSubmit = new JButton("提交");
	JButton jbReset = new JButton("重置");
	
	public void CreatLoginWindow(){
		//创建JFrame窗口
		JFrame jf = new JFrame("登陆窗口");
		Container ctn = jf.getContentPane(); //创建容器
		//设置JFrame窗体的大小
		jf.setBounds(400, 200, 400, 350);
		jf.setResizable(false);
		
		//直接在Container对象ctn中添加组件，或者创建JPanel对象，
		//在JPanel对象中添加对象，然后将JPanel添加至Container中均可，效果相同
		//JPanel jpanel1 = new JPanel();
		ctn.setLayout(null);
		ctn.setBounds(483,534,400,300);
		
		
		//设置标签，显示文字信息
		JLabel jlUser = new JLabel("用户名");
		ctn.add(jlUser);
		jlUser.setBounds(50, 30, 60, 40);
		JLabel jlPassword = new JLabel("密码");
		ctn.add(jlPassword);
		jlPassword.setBounds(50,110,60,40);
		
		//设置文本框和密码框
//		JTextField jtext = new JTextField();
		ctn.add(jtext);
		jtext.setBounds(110, 30, 220, 40);
//		JPasswordField jpassword = new JPasswordField();
		ctn.add(jpassword);
		jpassword.setBounds(110, 110, 220, 40);
		jpassword.setEchoChar('*');
		
		//设置提交按钮和重置按钮
//		JButton jbSubmit = new JButton("提交");
		ctn.add(jbSubmit);
		jbSubmit.setBounds(80, 230, 70, 40);
//		JButton jbReset = new JButton("重置");
		ctn.add(jbReset);
		jbReset.setBounds(250, 230, 70, 40);
		
		//为提交按钮和重置按钮分别添加实现ActionListener接口的对象
		jbSubmit.addActionListener(new jbSubmitAction());
		jbReset.addActionListener(new jbResetAction());
		
		//将这些组件添加至主窗口并设置其可见
		//添加组件在设置组件大小之前或之后都可以
//		jpanel1.add(jlUser);
//		jpanel1.add(jlPassword);
//		jpanel1.add(jtext);
//		jpanel1.add(jpassword);
//		jpanel1.add(jbSubmit);
//		jpanel1.add(jbReset);
		//ctn.add(ctn);
		jf.setVisible(true);
	}
	
	//定义两个内部类来实现提交按钮和重置按钮的ActionListener接口
	class jbSubmitAction extends JDialog implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JDialog jd = new JDialog(new LoginWindow(), "提示", true); //true设置为模式对话框，即始终在前，阻塞别的线程直至对话框线程结束
			Container ctnjd = jd.getContentPane();
			jd.setBounds(450,250,150,120);
			//ctnjd.setBounds(600, 420, 150, 120);
			if (jtext.getText().length()==0 || jpassword.getPassword().length==0){
				ctnjd.add(new JLabel("用户名或密码不能为空"));
				jd.setVisible(true);
			}
			else if ((jtext.getText().equals("mr")) && String.valueOf(jpassword.getPassword()).equals("mrsoft")){
				ctnjd.add(new JLabel("登陆成功"));
				jd.setVisible(true);
			}
			else{
				ctnjd.add(new JLabel("用户名或密码错误"));
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
