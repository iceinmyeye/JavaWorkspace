package com.basic;

//import edu.princeton.cs.algs4.StdIn;
//import edu.princeton.cs.algs4.StdOut;

public class practice {

	public static void main(String[] args) {

		// // 1.1.1
		// System.out.println((0+15)/2);
		// System.out.println(2.0e-6 * 100000000.1);
		// System.out.println(true && false || true && true);
		//
		// // 1.1.2
		// System.out.println((1+2.236)/2);
		// System.out.println(1+2+3+4.0);
		// System.out.println(4.1 >= 4);
		// System.out.println(1+2+"3"); // �ַ������
		// System.out.println(1+2+'3'); // 1+2+�ַ�3��ascii��

		// // 1.1.3
		// int a = StdIn.readInt();
		// int b = StdIn.readInt();
		// int c = StdIn.readInt();
		// if (a == b && a == c) {
		// StdOut.print(true);
		// } else {
		// StdOut.print(false);
		// }

//		// 1.1.5
//		double x = 1.002;
//		double y = 0.99;
//		if ((x > 0 && x < 1.0) && (y > 0 && y < 1.0)) {
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}
		
//		// 1.1.8
//		System.out.println('b');
//		System.out.println('b'+'c');
//		System.out.println((char) ('a' + 4));
		
		// 1.1.24
		System.out.println(Functions.gcd(105, 24));
		System.out.println(Functions.lcm(18, 12));
	}

}
