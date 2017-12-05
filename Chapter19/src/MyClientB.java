import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;

@SuppressWarnings("serial")
public class MyClientB extends JFrame {

	/**
	 * @param args
	 */
	private BufferedReader readerB;
	private ServerSocket serverB;
	private Socket socketB;
	Socket socketBB;

	private PrintWriter writerB;

	JTextArea taB = new JTextArea();
	JTextField tfB = new JTextField();
	Container cB;

	
	
	// 构造函数，设置窗口显示
	public void CreatWindowB(String title) {
		setTitle(title);
		cB = this.getContentPane();
		cB.add(taB, BorderLayout.NORTH);
		cB.add(tfB, BorderLayout.SOUTH);
		setBounds(800, 200, 350, 500);
		setVisible(true);
		tfB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eA) {
				writerB.println(tfB.getText());
				if (null != tfB.getText()) {
					taB.append(tfB.getText());
					tfB.setText("");
				}
				MyClientA clientB_A = new MyClientA();
				if (null != clientB_A.tfA.getText()) {
					taB.append(clientB_A.tfA.getText());
					//clientB_A.tfA.setText("");
				}
			}
		});
	}

	void getServerB() {
		try {
			serverB = new ServerSocket(8001);
			System.out.println("服务器套接字已经创建成功");
			while (true) {
				System.out.println("等待客户机的连接");
				socketB = serverB.accept();
				readerB = new BufferedReader(new InputStreamReader(
						socketB.getInputStream()));
				getClientMessage();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void getClientMessage(){
		try{
			while(true){
				System.out.println("ClientB:"+readerB.readLine());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			if(readerB!=null){
				readerB.close();
			}
			if(socketB!=null){
				socketB.close();
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private void connect(){
		taB.append("Connecting,,,");
		try{
			socketBB = new Socket("196.76.1.222",8000);
			writerB = new PrintWriter(socketBB.getOutputStream(),true);
			taB.append("Conneted");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClientB clientB = new MyClientB();
		clientB.CreatWindowB("Conversation with ClientA");
		clientB.getServerB();
		clientB.connect();

	}

}
