interface Miss {
	void elegant();
}

interface Girl {
	void lovely();
}

interface MyLady {
	void sexy();
}

interface Women {
	void mature();
}

class Female implements Miss, Girl, MyLady, Women {
	public void mature() {
		System.out.println("The women is mature");
	}

	public void elegant() {
		System.out.println("The miss is elegant");
	}

	public void lovely() {
		System.out.println("The girl is lovely");
	}

	public void sexy() {
		System.out.println("The lady is sexy");
	}
}

public class InterfacePractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Female female = new Female();
		female.sexy();

	}

}
