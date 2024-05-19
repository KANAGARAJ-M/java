import java.util.*;

public class FBuzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int ec = 0, temp = a;
		int oc = 0;
		while (a != 0) {
			int b = a % 10;
			if (b % 2 == 0) {
				ec++;
			} else {
				oc++;
			}
			a = a / 10;
		}
		a = temp;
		if ((a % 2 == 0) && (a >= 6 && a <= 50)) {
			System.out.println("buzz");
		} else if (a % 2 == 0) {
			System.out.println("fizz");
		} else if (a % 2 != 0) {
			System.out.println("buzz");

		} else if ((a % 2 == 1) && (ec > oc)) {
			System.out.println("fizz");
		}
	}
}
