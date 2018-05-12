import java.util.Scanner;

class Power {

	static double power(double x, int n) {
		double tmp = 1.0;

		for (int i = 1; i <= n; i++)
			tmp *= x;
		return tmp;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("aのb乘を求めます。");
		System.out.print("実数a:");  double a = stdIn.nextDouble();
		System.out.print("実数b:");  int b = stdIn.nextInt();

		System.out.println(a + "の" + b + "乘は" + power(a, b) + "です。");
	}
}
