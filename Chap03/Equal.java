import java.util.Scanner;

class Equal {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("aは？");  int a = stdIn.nextInt();
		System.out.print("bは？");  int b = stdIn.nextInt();

		if (a == b)
			System.out.println("a,bは等しいです。");
		else
			System.out.println("aとbは等しくないです。");
	}
}
