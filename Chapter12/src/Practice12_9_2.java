
class Number{
	double mutiply(double x1, double x2){
		return x1*x2;
	}
}

public class Practice12_9_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Number num = new Number();
			System.out.println(num.mutiply(2, 98));
		}
		
		catch(Exception e){
			e.getMessage();
		}

	}

}
