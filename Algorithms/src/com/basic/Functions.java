package com.basic;

public class Functions {
	
	// ����һ�������ľ���ֵ
	public static int abs(int x) {
		if (x < 0) return -x;
		else return x;
	}
	
	// ����һ���������ľ���ֵ
	public static double abs(double x) {
		if (x < 0.0) return -x;
		else return x;
	}
	
	// �ж�һ�����Ƿ�������
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
	
	// ţ�ٵ���������ƽ����
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
	
	// ����ֱ�������ε�б��
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a*a+b*b);
	}
	
	// ����1��N�ĵ��ͼ���
	public static double H(int N) {
		double sum = 0.0;
		for (int i = 1; i <= N; i++) {
			sum += 1.0/i;
		}
		return sum;
	}
	
	// շת����������Լ��
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
	
	// �������Լ������С������
	public static int lcm(int a, int b) {
		int d = gcd(a, b);  // ������շת�����������Լ��
		return a * b / d;  // ��С������ = ����֮��  / ���Լ��
	}

}
