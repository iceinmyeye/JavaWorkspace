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
	//子类的构造方法
	public Son(String name2, String name3){
		//实例化子类对象时，父类无参构造方法会被自动调用，
		//但有参构造方法需要用super关键字显示调用
		super(name2);
		System.out.println(name3);
	}
	
	//重写（覆盖）父类方法
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
		
		//子类对象向上转型到基类
		/**在方法覆盖中，左右俩边分别为父类和子类的时候,
		以左边作为调用的入口，右边作为调用的实际调用执行的方法*/
		Father sn = new Son("I love", "Cancan");   
		sn.printsecondname();

		//创建一个子类对象，调用子类方法
		Son ft = new Son("jing","jing");
		ft.printsecondname();
		
		//创建一个父类对象
		Father fth = new Father("Cancan");
		fth.printsecondname();
	}

}
