class Father{
	public Father(String name){
		System.out.println(name);
	}
	void printfirstname(){
		System.out.println("Dong");
	}
	
	void printsecondname(){
		System.out.println("Xiaojing");
	}
}

class Son extends Father{
	//����Ĺ��췽��
	public Son(String name2, String name3){
		//ʵ�����������ʱ�������޲ι��췽���ᱻ�Զ����ã�
		//���вι��췽����Ҫ��super�ؼ�����ʾ����
		super(name2);
		System.out.println(name3);
	}
	
	//��д�����ǣ����෽��
	void printsecondname(){
		System.out.println("Cancan");
	}
}

public class Practice10_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����������ת�͵�����
		/**�ڷ��������У��������߷ֱ�Ϊ����������ʱ��,
		�������Ϊ���õ���ڣ��ұ���Ϊ���õ�ʵ�ʵ���ִ�еķ���*/
		Father sn = new Son("I love", "Cancan");   
		sn.printsecondname();

		//����һ��������󣬵������෽��
		Son ft = new Son("jing","jing");
		ft.printsecondname();
		
		//����һ���������
		Father fth = new Father("Cancan");
		fth.printsecondname();
	}

}
