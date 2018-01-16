
public class MiddleCac {

	public static void main(String[] args) {
		cacError(0.942-0.443, 0.943-0.433, 0.928-0.431);
		cacError(0.947-0.456, 0.952-0.481, 0.950-0.455);
		cacError(0.950-0.538, 0.945-0.56, 0.947-0.52);
		cacError(0.951-0.604, 0.960-0.586, 0.950-0.593);
		cacError(0.942-0.693, 0.944-0.658, 0.942-0.649);
		cacError(0.942-0.7, 0.943-0.768, 0.936-0.71);
		cacError(0.945-0.863, 0.944-0.803, 0.942-0.806);
		cacError(0.942-0.87, 0.947-0.822, 0.944-0.843);
		cacError(0.952-0.899, 0.956-0.908, 0.944-0.829);
		cacError(0.943-0.919, 0.943-0.922, 0.942-0.869);
		cacError(0.948-1.053, 0.960-1.078, 0.964-1.059);
	}

	private static void cacError(double d1, double d2, double d3) {
		double mean = (d1 + d2 + d3) / 3;
		double result = Math.sqrt((Math.pow(d1 - mean, 2) + Math.pow(d2 - mean, 2) + Math.pow(d3 - mean, 2)) / 3);
		System.out.println(mean + " " + result);
	}
}
