
//自定义异常类
class MyException extends Exception{
	public MyException(String ErrorMessage){
		super(ErrorMessage);   //父类构造方法需要用super关键字显示调用
	}
}

//检查并抛出异常
class Student{
	int speak(int m) throws MyException{
		if(m > 1000){
			throw new MyException("输入值大于1000");
		}
		return m;
	}
}

public class Practice12_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try语句中包含的是可能发生异常的java语句
		//当try代码块中的语句发生了异常，程序就会转到catch代码块中执行
		try{
			Student stu = new Student();
			int result = stu.speak(1001);
			System.out.println("输入的数据是"+result);
		}
		
		//catch语句用来获取异常信息
		//e为MyException类型的参数
		catch(MyException e){
			System.out.println(e);
		}
		
		//不论程序有无异常发生，均会执行finally语句
		finally{
			System.out.println("程序执行完毕！");
		}
	}

}
