public class PrimeNumsTillGivenNum {

	public static void main(String args[]) {
		int x = 31;
		for (int i = 2; i < x; i++) {
			Boolean flag = true;
			for (int j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}
	}
}
