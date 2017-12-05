import java.util.Scanner;

//自定义异常类
class SecondException extends Exception{
	public SecondException(String Error){
		super(Error);
	}
}

//定义计算两个数最大公约数的方法，如果向该方法传递负整数，则抛出异常
class Computer{
	int count(int x1, int x2) throws SecondException{
		if (x1 < 0 || x2 < 0 ){
			throw new SecondException("输入不能为负整数");
		}
		int divisor = 1;
		for (int i=Math.min(x1, x2);i>0;--i){
			if ((x1%i==0) && (x2%i==0)){
				divisor = i;
				break;
			}
		}
		return divisor;
	}
}

public class Practice12_9_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入数1：");
			int num1 = sc.nextInt();
			System.out.println("请输入数2：");
			int num2 = sc.nextInt();
			Computer com = new Computer();
			int m_divisor = com.count(num1, num2);
			System.out.println(num1+"和"+num2+"的最大公约数是"+m_divisor);
			sc.close();
		}
		catch(SecondException e){
			System.out.println(e);
		}

	}

}
