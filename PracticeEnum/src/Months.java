public enum Months {
	January(1), February(2);

	private int i;

	private Months(int i) {
		this.i = i;
	}

	public int getInt() {
		return i;
	}

	public static void main(String[] args) {
		System.out.println(Months.January.getInt());
	}
}
