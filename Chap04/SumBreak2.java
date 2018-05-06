import java.util.Scanner;

class SumBreak2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("整数値追加します。");
		System.out.print("何個追加しますか。");
		int n = stdIn.nextInt();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("整数：");
			int t = stdIn.nextInt();
			if (sum + t > 1000) {
				System.out.println("合計が1,000を超えました。");
				System.out.println("最後の数値は無視します。");
				break;
			}
			sum += t;
		}
		System.out.print("合計は" + sum + "です。");
	}
}
