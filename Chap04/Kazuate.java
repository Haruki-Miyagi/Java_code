import java.util.Random;
import java.util.Scanner;

class Kazuate {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		int no = rand.nextInt(100);

		System.out.println("数当てゲーム開始!!");
		System.out.println("0~99の数を当ててください。");

		int x;
		do {
			System.out.print("いくつでしょうか?");
			x = stdIn.nextInt();

			if (x > no)
        System.out.println("もっと小さい数");
			else if (x < no)
				System.out.println("もっと大きい数");
		} while (x != no);

		System.out.println("正解です。");
	}
}
