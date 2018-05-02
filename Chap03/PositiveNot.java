import java.util.Scanner;

class PositiveNot {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("整数値");
		int n = stdIn.nextInt();

		if (n > 0)
			System.out.println("0より大きいです");
		else
			System.out.println("マイナスの数字です。");
	}
}
