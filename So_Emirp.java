import java.util.Scanner;

public class So_Emirp {
	// hàm xác định số nguyên tố
	public static boolean prime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	// hàm đảo ngược vị trí các chữ số
	public static int reverse(int number) {
		int reverse = 0;
		if (number != 0) {
			reverse = reverse * 10 + (number % 10);
			number /= 10;
		}
		return reverse;
	}

	// xác định số ngược xuôi
	public static boolean primeUpAnDown(int number) {
		int reverse = 0;
		int check = number;
		do {
			if (number != 0) {
				reverse = reverse * 10 + (number % 10);
				number /= 10;
			}
		} while (number > 0);
		if (check == reverse) {
			return true;
		}
		return false;
	}

	// hàm xác định số Emirp
	public static boolean emirp(int number) {
		int reverse = reverse(number);
		for (int i = 2; i < reverse; i++) {
			if (reverse % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println("CHUONG TRINH XAC DINH SO EMIRP");
		System.out.println();

		int i = 0;
		while (i < 100) {
			Scanner scanner = new Scanner(System.in);

			System.out.print("Nhap so can xac dinh: ");
			int number = scanner.nextInt();

			// biến kết quả
			boolean resutl = true;

			if (number <= 11) {
				resutl = false;
			} else {
				if (prime(number) == false) {
					resutl = false;
				} else {
					if (primeUpAnDown(number) == true) {
						resutl = false;
					} else {
						if (emirp(number) == true) {
							System.out.println(number + " La so Emirp");
							System.out.println();
						}
					}
				}
			}

			if (resutl == false) {
				System.out.println(number + " Khong phai la so Emirp");
				System.out.println();
			}

		}
	}
}
