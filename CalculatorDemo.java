import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter first number = ");
		int num1=scan.nextInt();
		System.out.print("Enter Second number = ");
		int num2=scan.nextInt();
		System.out.print("Enter your choose = ");
		char operator = scan.next().charAt(0);
		Calculator c1 = new Calculator();
		if(operator == '+') {
			
			System.out.println("Sum of "+num1+" and "+num2+" = "+c1.arithmeticSum(num1, num2));
		}else if(operator == '-') {
			
			System.out.println("Difference of "+num1+" and "+num2+" = "+c1.arithmeticSubtraction(num1, num2));
		}else if(operator == '*') {
			
			System.out.println("Product of "+num1+" and "+num2+" = "+c1.multiplication(num1, num2));
		}else if(operator == '/') {
		
			System.out.printf("Division of "+num1+" and "+num2+" = %.3f",c1.division(num1, num2));
		}else if(operator == '%'){
			
			System.out.println("Reminder of "+num1+" and "+num2+" = "+c1.modulodivision(num1, num2));
		}
		scan.close();
	}

}
