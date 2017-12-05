import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

@SuppressWarnings("serial")
public class MyClientA extends JFrame {

	/**
	 * @param args
	 */
	private BufferedReader readerA;
	private ServerSocket serverA;
	private Socket socketA;
	Socket socketAA;

	private PrintWriter writerA;

	JTextArea taA = new JTextArea();
	JTextField tfA = new JTextField();
	Container cA;
	
	

	// 构造函数，设置窗口显示
	public void CreatWindowA(String title) {
		setTitle(title);
		cA = this.getContentPane();
		cA.add(taA, BorderLayout.NORTH);
		cA.add(tfA, BorderLayout.SOUTH);
		setBounds(300, 200, 350, 500);
		setVisible(true);
		tfA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eA) {
				writerA.println(tfA.getText());
				if (null != tfA.getText()) {
					taA.append(tfA.getText());
					tfA.setText("");
				}
				MyClientB clientA_B = new MyClientB();
				if (null != clientA_B.tfB.getText()) {
					taA.append(clientA_B.tfB.getText());
					//clientA_B.tfB.setText("");
				}
			}
		});
	}

	void getServerA() {
		try {
			serverA = new ServerSocket(8000);
			System.out.println("服务器套接字已经创建成功");
			while (true) {
				System.out.println("等待客户机的连接");
				socketA = serverA.accept();
				readerA = new BufferedReader(new InputStreamReader(
						socketA.getInputStream()));
				getClientMessage();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getClientMessage(){
		try{
			while(true){
				System.out.println("ClientA:"+readerA.readLine());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			if(readerA!=null){
				readerA.close();
			}
			if(socketA!=null){
				socketA.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private void connect(){
		taA.append("Connecting,,,");
		try{
			socketAA = new Socket("196.76.1.221",8001);
			writerA = new PrintWriter(socketAA.getOutputStream(),true);
			taA.append("Conneted");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClientA clientA = new MyClientA();
		clientA.CreatWindowA("Conversation with ClientB");
		clientA.getServerA();
		clientA.connect();

	}

}
