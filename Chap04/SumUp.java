import java.util.Scanner;

class SumUp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("１からnまでの和を求めます。");
		int n;
		do {
			System.out.print("nの値：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("１から" + n + "までの和は = " + sum + "です。");
	}
}
