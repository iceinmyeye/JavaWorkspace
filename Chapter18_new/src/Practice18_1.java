
public class Practice18_1 extends Thread {

	/**
	 * @param args
	 */
	private String[] words = {"�콫��������˹��Ҳ��","���ȿ�����־��","�����ǣ����������",
			"�շ������и�������Ϊ��","���Զ������ԣ�������������"};
	private int i = 0;
	public void run(){
		while(true){
			System.out.println(words[i]);
			try{
				sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			if(++i>(words.length-1)){
				return;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Practice18_1().start();

	}

}
