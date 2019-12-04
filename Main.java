import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] grid1 = new int[9];
		int[] grid2 = new int[9];
		int temp;
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 9 ; i++) {
			temp = input.nextInt();
			grid1[i] = temp;
		}
		for (int i = 0; i < 9 ; i++) {
			temp = input.nextInt();
			grid2[i] = temp;
		}
		System.out.println(Arrays.toString(grid1));
		System.out.println(Arrays.toString(grid2));
	}
}