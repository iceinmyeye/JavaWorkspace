import java.io.*;										//����java.io��
import java.net.*;									//����java.net��
public class MyTcp {									//������MyTcp
	private BufferedReader reader;						//����BufferedReader����
	private ServerSocket server;						//����ServerSocket����
	private Socket socket;							//����Socket����socket
	void getserver() {
		try {
			server = new ServerSocket(8000);			//ʵ����Socket����
			System.out.println("�������׽����Ѿ������ɹ�");	//�����Ϣ
			while (true) {							//����׽���������״̬
				System.out.println("�ȴ��ͻ���������");		//�����Ϣ
				socket = server.accept();				//ʵ����Socket����
				reader = new BufferedReader(new InputStreamReader(socket
						.getInputStream()));			//ʵ����BufferedReader����
				getClientMessage();					//����getClientMessage()����
			}
		} catch (Exception e) {
			e.printStackTrace();								//����쳣��Ϣ
		}
	}
	private void getClientMessage() {
		try {
			while (true) {									//����׽���������״̬
				System.out.println("�ͻ���:" + reader.readLine());	//��ÿͻ�����Ϣ
			}
		} catch (Exception e) {
			e.printStackTrace();								//����쳣��Ϣ
		}
		try {
			if (reader != null) {
				reader.close();								//�ر���
			}
			if (socket != null) {
				socket.close();								//�ر��׽���
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {						//������
		MyTcp tcp = new MyTcp();							//�����������
		tcp.getserver();										//���÷���
	}
}