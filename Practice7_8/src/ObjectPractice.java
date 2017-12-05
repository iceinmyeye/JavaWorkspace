
public class ObjectPractice {

	/**
	 * @param args
	 */
	private int x;
	public void setx(int xx){
		this.x = xx;
	}
	public int getx(){
		//x = 0;
		setx(0);
		return this.x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectPractice op = new ObjectPractice();
		//op.setx(0);
		System.out.println(op.getx());

	}

}
