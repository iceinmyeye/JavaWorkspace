import java.io.*;
import java.util.Scanner;
public class StoreNameAndPassword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = sc.nextLine();
		System.out.println("请输入密码：");
		String password = sc.nextLine();
		File fileName = new File("E:\\VS_Projects\\NameAndPassword","NameAndPassword.txt");
		try{
			if(!fileName.getParentFile().exists()){
				//如果没有该路径（E:\\VS_Projects\\NameAndPassword）的文件夹，
				//则创建之
				fileName.getParentFile().mkdir();
			}
			if(!fileName.exists()){
				//如果该文见不存在，就创建该文件
				fileName.createNewFile();
			}
			FileWriter fw = new FileWriter(fileName);
			fw.write(name+"\r\n");  // /r/n实现换行
			fw.write(password+"\r\n");
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		sc.close();

	}

}
