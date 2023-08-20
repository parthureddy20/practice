
public class CalculatorUsingSwitch {
	void arithmetic(int num1,int num2,char operation) {
		switch(operation) {
		case '+':
			System.out.println("Addition of "+num1+" + "+num2+" = "+(num1+num2));
			break;
		case '-':
			System.out.println("Addition of "+num1+" - "+num2+" = "+(num1-num2));
			break;
		case '*':
			System.out.println("Addition of "+num1+" * "+num2+" = "+(num1*num2));
			break;
		case '/':
			
			System.out.printf("Addition of "+num1+" / "+num2+" = %.2f",(double)num1/num2);
			break;
		case '%':
			System.out.println("Addition of "+num1+" % "+num2+" = "+(num1%num2));
			break;
		}
	}
}
