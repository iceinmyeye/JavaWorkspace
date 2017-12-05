enum Year{
	JAN("January"), FEB("February"), MAR("March"), APR("April"), MAY("May"), JUN("June"), 
	JUL("July"), AUG("August"), SEP("September"), OCT("October"), NOV("Novermber"), DEC("December");
	
	//定义该enum的构造函数,通常定义为private
	private String description;
	private Year(String description){
		this.description = description;
	}
	
	//定义返回括号中描述字符串的方法,定义为public
	public String getDescription(){
		return description;
	}
}

public class MyEnum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (Year mon : Year.values()){
			System.out.println((mon.ordinal() + 1) + " : " + mon.name());
			System.out.println(mon.getDescription());
		}
	}

}
