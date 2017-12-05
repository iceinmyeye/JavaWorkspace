public class Area {

	/**
	 * @param args
	 */
	float lth;
	float wth;

	public Area(float lth, float wth) {
		this.lth = lth;
		this.wth = wth;
	}

	float CanculateArea() {
		return lth * wth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area obj=new Area(2.5f, 1.0f);
		System.out.println("矩形的面积是："+obj.CanculateArea());
	}

}
