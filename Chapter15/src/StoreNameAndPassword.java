import java.io.*;
import java.util.Scanner;
public class StoreNameAndPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������������");
		String name = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		File fileName = new File("E:\\VS_Projects\\NameAndPassword","NameAndPassword.txt");
		try{
			if(!fileName.getParentFile().exists()){
				//���û�и�·����E:\\VS_Projects\\NameAndPassword�����ļ��У�
				//�򴴽�֮
				fileName.getParentFile().mkdir();
			}
			if(!fileName.exists()){
				//������ļ������ڣ��ʹ������ļ�
				fileName.createNewFile();
			}
			FileWriter fw = new FileWriter(fileName);
			fw.write(name+"\r\n");  // /r/nʵ�ֻ���
			fw.write(password+"\r\n");
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		sc.close();

	}

}
