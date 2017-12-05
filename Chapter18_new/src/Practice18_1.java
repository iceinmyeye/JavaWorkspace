
public class Practice18_1 extends Thread {

	/**
	 * @param args
	 */
	private String[] words = {"天将降大任于斯人也，","必先苦其心志，","劳其筋骨，饿其体肤，",
			"空乏其身，行弗乱其所为。","所以动心忍性，增益其所不能"};
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
