import java.util.Random;

import java.util.Scanner;

class Abc {

	public static void main(String[] args) {

		Random rand = new Random();

		Scanner stdIn = new Scanner(System.in);

		int a;
		a = 2;
		int b = -1;

		double x = 1.5 * 2;

		final double PI = 3.14;
		x = rand.nextDouble();
		System.out.println(
			"半径" + x + "の円の面積は" +
			(PI * x * x) + "です。");
		System.out.print("整数aの面積は");
		a = stdIn.nextInt();
		System.out.println("a / 2 = " + a / 2);
		System.out.println("a % 2 = " + a % 2);
		String s = "ABC";
		System.out.println("文字列sは" + s + "です。");
	}
}
