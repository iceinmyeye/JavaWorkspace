
class outerclass{
	//定义两个成员变量
	private static int a = 1;            //定义静态成员变量
	innerclass ic = new innerclass();   //外部类不能直接访问内部类成员，
	double x = ic.y/2;                  //必须实例化后通过对象引用调用
	
	//定义了几个函数
	void printline1(){
		System.out.println("I love");
	}
	void printline2(String someone){
		System.out.println(someone);
	}
	int doadd(int a, int b){
		return a+b;
	}
	
	//成员内部类
	class innerclass{
		int c = a*2;        //内部类可直接访问外部类成员，即使外部类成员为私有
		double y = 2.2;
		void printsentence(){
			printline1();
			printline2("Cancan");
		}
	}
}

public class Practice11_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//以下两行代码为在外部类之外实例化内部类对象
		//第一步，先创建外部类的对象；第二步，使用外部类.内部类指定对象的类型
		outerclass oc = new outerclass();
		outerclass.innerclass ic = oc.new innerclass();
		ic.printsentence();
		
		//使用匿名内部类
		//匿名类没有名称，末尾加分号
		//一个类是抽象的或是一个接口，那么其子类中的方法都可以使用匿名内部类来实现
		outerclass oca = new outerclass(){
			void printline1(){
				System.out.println("I fall in love with");
			}
		};
		oca.printline1();
		oca.printline2("CC");
	}

}
