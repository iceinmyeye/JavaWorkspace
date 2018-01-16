package com.basic;

public class Functions {
	
	// 计算一个整数的绝对值
	public static int abs(int x) {
		if (x < 0) return -x;
		else return x;
	}
	
	// 计算一个浮点数的绝对值
	public static double abs(double x) {
		if (x < 0.0) return -x;
		else return x;
	}
	
	// 判断一个数是否是素数
	public static boolean isPrime(int N) {
		if (N < 2) {
			return false;
		}
		for (int i = 2; i*i <= N; i++) {
			if (N % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	// 牛顿迭代法计算平方根
	public static double sqrt(double c) {
		if (c < 0) {
			return Double.NaN;
		}
		double err = 1e-15;
		double t = c;
		while (Math.abs(t*t - c) > err) {
			t = (t + c/t) / 2;
		}
		return t;
	}
	
	// 计算直角三角形的斜边
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a*a+b*b);
	}
	
	// 计算1到N的调和级数
	public static double H(int N) {
		double sum = 0.0;
		for (int i = 1; i <= N; i++) {
			sum += 1.0/i;
		}
		return sum;
	}
	
	// 辗转相除法求最大公约数
	public static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (a % b == 0) {
			return b;
		} else {
			return gcd(b, a % b);
		}
	}
	
	// 利用最大公约数求最小公倍数
	public static int lcm(int a, int b) {
		int d = gcd(a, b);  // 先利用辗转相除法求出最大公约数
		return a * b / d;  // 最小公倍数 = 两数之积  / 最大公约数
	}

}
