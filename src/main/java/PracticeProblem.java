import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int intChecker() {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.print("Input an integer: ");
		while (!(input.hasNextInt())) {
			input.nextLine();
			System.out.print("Input an integer: ");
			}
		num = input.nextInt();
		input.nextLine();
		return num;
	}

	public static double doubleChecker() {
		double num;
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		while (!(input.hasNextDouble())) {
			input.nextLine();
			System.out.print("Input a number: ");
			}
		num = input.nextDouble();
		input.nextLine();
		return num;
	}

	public static boolean booleanChecker() {
		boolean value;
		Scanner input = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		while (!(input.hasNextBoolean())) {
			input.nextLine();
			System.out.print("Input a boolean: ");
			}
		value = input.nextBoolean();
		input.nextLine();
		return value;
	}

	public static boolean multipleIntChecker() {
		Scanner input = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.print("Input an integer: ");
		 while (!(input.hasNextInt())) {
			input.nextLine();
			System.out.print("Input an integer: ");
			}
			input.nextInt();
		}
		return true;
	}

}
