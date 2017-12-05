public class GenericMethods {
	public <T1, T2, T3> void f(T1 t1, T2 t2, T3 t3) {
		System.out.println(t1.getClass().getName());
		System.out.println(t2.getClass().getName());
		System.out.println(t3.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods gm = new GenericMethods();
		gm.f(" ", 6, 8.2f);
		gm.f(9.0, 'v', true);
	}
}
