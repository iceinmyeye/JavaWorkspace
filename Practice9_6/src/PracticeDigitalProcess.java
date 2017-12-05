import java.text.DecimalFormat;

public class PracticeDigitalProcess {

	/**
	 * @param args
	 */
	//获取num1到num2之间的6个偶数（不包括num2），并求其和
	//int[] s = new int[5];
	//int s[] = {0,0,0,0,0,0};
	public int GetSixEven(double num1, double num2){
		int sum = 0;
		for (int i=0;i<5;++i){
			int x = (int)num1 + (int)(Math.random()*(num2-num1));
			if (x%2==0){
				sum += x;
				//System.out.println(x);  该语句用来验证x值及最后结果
			}
			else{
				sum += x+1;
				//System.out.println(x+1);  该语句用来验证x值及最后结果
			}
		}
		return sum;
	}
	
	//定义一个求圆面积的方法，将计算结果保留5为小数
	public String CircleArea(double radius){
		DecimalFormat df = new DecimalFormat("#.#####");
		return df.format(Math.PI * Math.pow(radius, 2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PracticeDigitalProcess pdp = new PracticeDigitalProcess();
		System.out.println("2-32之间随机产生的6个偶数之和为" + pdp.GetSixEven(2, 32));
		System.out.println("半径为2.5的圆的面积为" + pdp.CircleArea(2.5));

	}

}
