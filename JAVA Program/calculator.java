import java.util.Scanner;
public class calculator {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the First Number");
		double num1= sc.nextDouble();
		System.out.println("Enter the second Number");
		double num2= sc.nextDouble();
		System.out.println("Enter the operation to be performed"
				+ " {1->Addition}"
				+ " {2->Substraction}"
				+ " {3->Multiplication}"
				+ " {4->Division}");
		int choice= sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Sum is ->"+(num1+num2)); break;
		case 2: System.out.println("Difference is ->"+ (num1-num2)); break;
		case 3: System.out.println("Product is ->"+ (num1*num2)); break;
		case 4:{if(num2==0)
			System.out.println("Denominator can't be zero"); 
		else
			System.out.println("division result is"+ (num1/num2));
		}
		break;
		default: System.out.println("Choose Wisely");
		}
		
	}
}

