import java.util.Scanner;

public class CalculatorUsingSwitchDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter num1 = ");
		int num1 = scan.nextInt();
		System.out.print("Enter num2 = ");
		int num2 = scan.nextInt();
		System.out.print("Enter operator = ");
		char operation = scan.next().charAt(0);
		CalculatorUsingSwitch c1 = new CalculatorUsingSwitch();
		c1.arithmetic(num1, num2, operation);
		scan.close();
	}

}
