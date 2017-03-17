import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		Functions calcFunction = new Functions();
		
		int a;
		int b;
		int choice;
		boolean appOn = true;
		
while (appOn = true){
		System.out.println("=====================");
		System.out.println("Welcome to the Basic Calculator");
		System.out.println("=====================");
		System.out.println("");
		System.out.println("What function would you like to use?");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("5. Modulo");
		System.out.println("9. Exit");
		choice = input.nextInt();
		
switch(choice){
	case 1: System.out.println("Enter your first number:");
			a = input.nextInt();
			System.out.println("Enter your second number:");
			b = input.nextInt();
			System.out.println("The sum of your two numbers is:" +calcFunction.add(a, b));
			break;
				
	case 2: System.out.println("Enter your first number:");
			a = input.nextInt();
			System.out.println("Enter your second number:");
			b = input.nextInt();
			System.out.println("The subtraction of your two numbers is:" +calcFunction.subtract(a, b));
			break;
			
	case 3: System.out.println("Enter your first number:");
			a = input.nextInt();
			System.out.println("Enter your second number:");
			b = input.nextInt();
			System.out.println("The product of your two numbers is:" +calcFunction.multiply(a, b));
			break;
			
	case 4: System.out.println("Enter your first number:");
			a = input.nextInt();
			System.out.println("Enter your second number:");
			b = input.nextInt();
			System.out.println("The quotant of your two numbers is:" +calcFunction.divide(a, b));
			break;
			
	case 5: System.out.println("Enter your first number:");
			a = input.nextInt();
			System.out.println("Enter your second number:");
			b = input.nextInt();
			System.out.println("The modulo of your two numbers is:" +calcFunction.mod(a, b));
			break;
			
	case 9: System.out.println("Thank you for using my Calculator, goodbye!");
			appOn = false;
			System.exit(9);
			break;
	
	default: System.out.println("Error, please try again.");
			break;
			
			


}

}		

	}

}
