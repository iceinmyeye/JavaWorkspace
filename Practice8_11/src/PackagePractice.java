
public class PackagePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//创建integer类对象，并以int类型返回
		Integer intg = new Integer(8);
		System.out.println("integer类对象的返回值为"+intg.intValue());

		//创建character对象并比较是否相等
		Character mychar1 = new Character('s');
		Character mychar2 = new Character('S');
		int x = mychar1.compareTo(mychar2);
		System.out.println(x==0?"两个Character对象相等":"两个Character对象不相等");
		
		//将其转换为小写字母比较是否相等
		mychar1 = Character.toLowerCase(mychar1);
		mychar2 = Character.toLowerCase(mychar2);
		int xx = mychar1.compareTo(mychar2);
		System.out.println(xx==0?"两个转换后的Character对象相等"
				:"两个转换后的Character对象不相等");
		
		//通过字符型变量创建Boolean值，再将其转换为字符串输出
		Boolean bl = new Boolean("True");
		System.out.println("Boolean转换为字符串输出为"+bl.toString());
	}

}
