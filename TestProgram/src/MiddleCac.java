
public class MiddleCac {

	public static void main(String[] args) {
		cacError(0.805596, 0.826215, 0.868);
		cacError(0.705449, 0.71134, 0.764);
		cacError(0.620029, 0.605302, 0.63);
		cacError(0.546392, 0.549337, 0.477);
		cacError(0.490427, 0.4757, 0.418);
		cacError(0.468336, 0.453608, 0.384);
		cacError(0.431517, 0.43299, 0.342);
		cacError(0.418262, 0.407953, 0.35);
		cacError(0.403535, 0.403535, 0.316);
		cacError(0.371134, 0.375552, 0.318);
	}

	private static void cacError(double d1, double d2, double d3) {
		double mean = (d1 + d2 + d3) / 3;
		double result = Math.sqrt((Math.pow(d1 - mean, 2) + Math.pow(d2 - mean, 2) + Math.pow(d3 - mean, 2)) / 3);
		System.out.println(result);
	}
}
